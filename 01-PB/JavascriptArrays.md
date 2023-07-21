# JavaScript Arrays

An array is a data structure in JavaScript that stores multiple values in a list.

You can access each value individually, operate on all values at once, sort them, and do many more operations on them.

Without lists, we'd have to store the items in separate variables, but it would not scale well. It might work for a few
items but would be less efficient for hundreds of them.

```javascript
const fruits = ["apple", "orange", "mango"];
```

## List items

Each array item has an index, which is a positive number starting from zero. You can get an item from the list by
specifying its index in brackets.

Arrays have a length property that stores the number of items in the list. Length does not have to do anything with what
kind of data does it have, it can be full of null values, but it will still show the largest index + 1.

```javascript
const fruits = ["apple", "orange", "mango"];
const firstFruit = fruits[0];
const lastFruit = fruits[fruits.length - 1];
```

Lists can hold different kinds of values at once, but keep in mind that it's easier to maintain code that stores the
same type of values in a list.

## Arrays are mutable

You can change an array element by reassigning the item in the specified index.

```javascript
const fruits = ["apple", "orange", "mango"];
fruits[1] = "banana";
```

Note that you can still change individual items in the list even though you defined the list as a constant, but you're
not allowed to reassign the variable to another list.

## Lists have methods

Some of the most common list operations are:

* .pop(): remove the last item from the list, and use it
* .push(): add an item to the list
* .sort(): reorders the array in place
* .join(separator): create a string concatenated by the separator string
* .slice(startIndex, endIndex): return a part of the list as a new array.
* .splice(index, deleteNumber, item1, item2...): Add or remove items from a list. Starting from index, delete
  deleteNumber rows and add the items given as parameters. After it finishes the calculation, it returns the deleted
  items.

```javascript
const fruits = ["apple", "orange", "mango"];

fruits.push("banana");
// fruits: ["apple", "orange", "mango", "banana"]
const lastItem = fruits.pop();
// lastItem: banana

const fruitString = fruits.join(", ");
// fruitString: "apple, orange, mango"
const favorites = fruits.slice(1, 2);
// favorites: ["orange"]
fruits.sort();
// fruits: ["apple", "mango", "orange"]

const removed = fruits.splice(1, 2, "strawberry");
// fruits: ["apple", "strawberry"]
// removed: [ "orange", "mango" ]
```