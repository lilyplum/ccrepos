# unique-id

There are many cases when we need to generate unique ids upon creating new elements (items in a list, rows in a table).
Many times there is a framework taking responsibility for that (like a database engine), but what if we had to deal with
this by ourselves? Let's see some options.

## 1. Check everything

We can play safe if we check every single item already in our collection and generate an identifier that differs from
all of the others. A variant for this is when we keep a central registry of the used ids so that we don't need to fetch
all of the data; in this case we "ask" new ids from the registry.

## 2. Increment something

We don't need to keep a registry of all the previous ids if there is a rule that guarantees uniqueness; for example, an
ever-incremented number will never go back to an earlier, smaller value. In this case the central registry consists of
one value, the latest id. Watch out for the possible overflow of computer-stored integers! Incrementing 65535 stored on
2 bytes will yield 0 on most systems.

## 3. Make collisions unlikely

We might as well generate random ids from a pool that is much much larger than the number of possible items. This
strategy doesn't guarantee uniqueness, it is pseudo-unique: it may happen that two generated ids are the same (this is
called a collision), however, the chance of this is negligible for the practical cases. See UUID for a widely used
example.

## General notes on concurrency

Concurrent operations complicate things A LOT. For the first two strategies it means that the search of the existing ids
cannot start until another id creation has not been finished. See the following examples:

* A registry holds existing ids {A, B, C}. A client asks for a new id; a function checks that {A, B, C} is the set of
  the ids. At this point another client asks for an id, and the same check (started as a different process) yields the
  same result. Then the first process returns D as a possible new id, and so does the second process. If there is no
  safeguard to prevent this, D will be duplicated in the list, or even worse, the entity saved later will overwrite the
  first one.
* A registry holds 7334 as the last index. Two processes inquire this data concurrently. If it can happen that both get
  7334 as the answer, so both would try to assign 7335 to their new record with the consequences described above.

The resolution of this problem is that the registry check and the new id generation cannot happen separately, and the
concurrent requests must be serialized: the second search-and-generate process mustn't start until the first process
didn't get its answer, and the new id hadn't been saved into the registry.