# ehotel-buffet

Hotels are in a deep trouble these days, they fight for customer satisfaction and good reviews, while they have hard
time to find personnel. If they have one waiter less, then the breakfast buffet tables might get empty, leading to
dissatisfied guests. If they have one manager less in the kitchen, they might be in the situation where the kitchen runs
out of some material due to the high demand of guests, or on the contrary, expired food has to be thrown out.

In these circumstances you decided to run an eHotel; the idea is that you automatise as much as you can of the operation
workflow. As a start, you want to create a buffet simulator that helps you to develop and optimise the logic behind how
to run the buffet effectively. The buffet management module gets information from the guest reservation module about
current and future guests, and tries to achieve two goals:

Minimize dissatisfaction by avoiding empty plates in the buffet.
Minimize food waste.
These goals pull in different directions, and a balance is hard to find as the exact demand is not predictable, but you
can rely on all the data available before the guests eventually show up in the restaurant. Good luck!

What are you going to learn?

* Use various types of collections.
* Test your business logic.
* Simulate a complex flow of events.
* Optimize simulation parameters.
* Practice SRP, DIP, ISP concepts

## Tasks

### Guests for a day

Implement the GuestService interface to provide information about guests and reservations. Its task is to provide the
guests for a specific day. Selected from the full list of guests.

* Method getGuestsForDay returns an unordered collection of guests to be expected on a given day, based on the full list
  of guest reservations.

### Generate guests

For the sake of the simulation, GuestService implementation also has to generate random guest reservations. Reservations
should span from 1 up to 7 nights, and the stay needs to be in the given "season", i.e. fall between the two date
parameters provided for the method. For example, if the date limits for the "season" are 1st Aug and 4th Aug, the
generated reservations may be 1, 2, or 3 days long, and the 3 days long reservations must start on 1st Aug.

* Method generateRandomGuest returns a new guest with randomly picked name, guest type, and reservation period covering
  1 up to 7 nights.
* The check-in and check-out dates must fall between the provided season limits (limit dates included).

### Buffet state

Modify the Buffet data class so that is able to keep track of the meals prepared for the buffet. Each portion of meal
has a "timestamp" of its creation, as consumption and disposal of meal portions depends on is "freshness". Prepare that
you'll need to find the most or least fresh portions of a given type (see later tasks). You can assume that the new
portions entering the buffet will be the freshest (but portions arriving in the same refill batch can have the same
timestamp).

* It is possible to find meal portions of a given meal type, ordered by their freshness.

### Buffet refill

Modify the BuffetService interface and create an implementation class for it. Add a method to the interface responsible
for adding new portions to the buffet with the specified type, timestamp, and amount. We need a "batch" refill, so we
should be able to request multiple types and portions at once, having the same timestamp (the freshest in the buffet).

* The refill method receives a Buffet instance, and a collection that describes how many portions need to be added per
  meal type at once. One call of this method adds portions having the same (freshest) timestamp.

### Consume the freshest

Guests have a strong special skill to always pick the freshest pieces from the table. Create a consumeFreshest method in
BuffetService and in the implementation which removes the freshest portion of the requested meal type, and returns true
that indicate success. Return false if there are no such type in the buffet.

* Method consumeFreshest removes the freshest portion of the requested meal from the buffet. The returned boolean
  indicates the success.

### Collect food waste

Add a method to BuffetService (and to the implementation) called collectWaste which removes all portions from the buffet
that:

* belong to a meal type of a given MealDurability
* were created before a given time. Return the sum cost of the meals discarded during the call. The unit costs are
  attached to the meal types.


* Method collectWaste removes items from the buffet based on meal durability and freshness.
* The method returns the sum cost of the discarded meals (discarded units × unit cost).

### Prepare breakfast groups

Breakfast takes place between 6 am and 10 am, and the simulator runs in 30-minute cycles. This means 8 cycles each day.
The guests for the given day arrive randomly in one of these cycles. Create a method that is able to split a given day's
guest into these breakfast cycles. Note that it may happen that some of these groups are empty, but every guest must
appear exactly once. It is up to you where you place this functionality.

* There is a method that splits an (unordered) collection of guests into n (unordered) groups randomly. The groups
  arrive sequentially in time, so the resulting collection of groups is ordered.

### Serve breakfast

Create a BreakfastManager with a serve method that runs the morning cycle. It uses the prepared guest groups for the
breakfast cycles. Three phases take place in each cycle:

* Refill buffet supply.
* Consume breakfast - the guests try to eat what they prefer from the actual buffet supply, and get unhappy (and eat
  nothing) if they found the preferred meal container empty. Select the guest's personal preference randomly from the
  preference list attached to its guest type.
* Discard old meals - you have to discard those items from the supply that are not fresh enough to keep on display.
  These are the meals of MealDurability.SHORT, and that's been in the supply for at least 3 cycles. E.g. at the end of
  the 3rd cycle (7:00-7:30), a scrambled egg (being of SHORT durability), created at 6:00 just before the 1st cycle, has
  to be discarded. And there is one more sad task to do at the end of the serving period: all meals from the buffet must
  be discarded, except for those of durability LONG - so SHORT and MEDIUM has to be discarded at the end of the day.


* The buffet supply filled/refilled at the beginning of each cycle. The exact number of the provided meal types and
  portions does not matter for now.
* In each cycle, the guests of the actual group pick their random preferences (from the options characteristic of their
  types), and go for it in the buffet. They get unhappy if they find none.
* After each cycle all SHORT durability meals are discarded that have not been consumed during the last 3 cycles (
  including the current one).

### Collect success metrics

For each breakfast session, collect and display the two main success metrics, the number of unhappy guests and the cost
of food waste.

* The number of unhappy guests is displayed at the end of the breakfast serving period.
* The sum cost of wasted food is displayed at the end of the breakfast serving period.

### Optimize refill strategy

The buffet refill needs an input about how many new portions should be served for the next cycle. Create a method
getOptimalPortions that produces these numbers. The method must rely on the following information passed as arguments:

1. The buffet state.
2. The number of guests (per guest type) who are still to be expected for that day.
3. The number of cycles left for that day (starting from 8 and decreasing).
4. The assumed cost of an unhappy guest. This is a very important parameter that should govern the trade-off between
   going for guest happiness OR minimizing food waste. When passing the arguments to the optimizer, it is very important
   NOT to send what cannot be known in reality. Although the serve method has the group information for the whole day,
   the optimizer must be presented only with those future information that can be known for sure. For example, at the
   start of the day we know that 6 BUSINESS, 4 TOURIST and 2 KIDS can be expected during the 8 cycles. If in the first
   cycle 2 BUSINESS and 1 TOURIST guest showed up, the optimizer should get that 4 BUSINESS, 3 TOURIST and 2 KIDS can be
   expected during the next 7 cycles.


* Method getOptimalPortions in BreakfastManager receives the required four input, and provides the refill request
  numbers.
* The second parameter hides future group information, it only contains the aggregate numbers for the rest of the day.

### Manage dinner

As the breakfast is managed with success, your next big task is to organize the à la carte dinner operations. This time
the details will be up to you, we'll just sketching out some guidelines:

* There should be a menu to choose from.
* You have to have access to a "statistics" how much these menu items are preferred by your customers.
* You must have some information about the expected number of guests. For example, you can use the existing daily guest
  numbers as an input.
* Each individual customer comes with a list of ordered preferences from the menu, and they got happier if they can
  choose from the top of it. The individual preferences must in a way mirror the above global "statistics": customers
  should tend to pick "popular" items higher on their lists.
* The kitchen stores various ingredients needed for creating a meal. Keep track of the consumed ingredients when
  preparing a meal.
* Ingredients must have "freshness" and a date of expiry.
* Customer happiness also should depend on the freshness of the components used for their meals.
* Again, try to optimize for greater happiness and less waste, introducing some trade-off number between the two.


* Individual preference lists of menu items are generated upon the global preference "statistics" - popular items have
  higher probability to get higher positions.
* There is a method for simulating one evening: getting the customers for that evening with their individual preference
  lists, serving their top preferred meals that can be prepared (in order of customer appearance), removing the required
  ingredients from the kitchen stock, and collecting happiness numbers during the evening. Also sum up expired
  ingredient at the end of the day.
* There is a strategy for buying ingredients based on actual stock, general preference statistics, and expected future
  customer numbers.

### Hints

* The first tasks in this project are trying to "guide" the implementation very closely. Hopefully this will enable to
  compare your optimizing strategies with others.
* Watch out, the last task is different, it is as big as the others combined. While the morning buffet simulator is
  closely specified, the dinner kitchen simulator is described only vaguely. Of course, you can build upon the existing
  breakfast logic there as well, but feel free to add extra features or try out different solutions if you want.

