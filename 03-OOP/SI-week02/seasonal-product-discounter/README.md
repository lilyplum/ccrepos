# seasonal-product-discounter

Running a shop can be overwhelming, so your friend, Taylor from CoolMall, asks for your help. The management comes up
with different discount ideas all the time, and it's hard to keep track all of them and calculate the eventual price for
the products. Taylor needs a program that can accommodate various types of discount logic, applies the relevant ones for
a specific product on a specific day, and calculates the price.

Currently, there are three types of discounts: monthly discounts, color discounts, and seasonal discounts.

* Monthly discounts include:
    * Summer Kick-off, giving 10% discounts on every product during June and July.
    * Winter Sale, giving 10% discount on every product during February.
* Color discounts include:
    * Blue Winter, giving 5% discount on every blue-colored product during winter.
    * Green Spring, giving 5% discount on every green-colored product during spring.
    * Yellow Summer, giving 5% discount on every yellow-colored product during summer.
    * Brown Autumn, giving 5% discount on every brown-colored product during autumn.
* Seasonal discounts include:
    * Sale Discount, giving 10% discount if the purchase happens the season next to the item's favored season (e.g. if
      the customer buys gloves, a winter product, during spring).
    * Outlet Discount, giving 20% discount if the purchase happens two seasons after the product's favored season (e.g.
      if the customer buys winter gloves during the summer).
      What are you going to learn?
* Create data classes as Java records.
* Code along the Dependency Inversion Principle.
* Solve class cooperation using composition.

## Tasks

### Create a Screen class

Create a Screen class responsible for displaying information for the user.

* The Screen class is present in the ui subpackage.
* The Screen class has a method for displaying all the available products with all relevant data.
* The Screen class has a method for displaying all details of the Offer after presenting the date of purchase. The
  details include the Products name, the applicable Discounts (if no discount can be applied, display No discounts
  applicable), and the final price (after the discounts applied, if any)

### Create an Input class

Create an Input class responsible for collecting the necessary user input.

* The Input class is present in the ui subpackage.
* The Input class has a method for asking user input regarding the product that the user would like to purchase. The
  method should continue asking until a valid product can be returned.
* The Input class has a method for asking user input regarding the date of the purchase. The method should continue
  asking until a valid date can be returned.

### Implement Monthly Discount

Finish the existing MonthlyDiscount class so that every product can be discounted during the given months.

* The MonthlyDiscount class' accepts() method a implements the expected behavior.
* The MonthlyDiscount class is covered with unit tests.

### Create Discount interface

Create a Discount interface based on MonthlyDiscount which can be used for all other types of discounts as well.

* The Discount interface has three methods, accepts(), getName(), and getRate().
* Class MonthlyDiscount implements the Discount interface.

### Create DiscounterService

Create a service named DiscounterService responsible for getting the offer for a given product at a given date, by
collecting all applicable discounts, and calculating the final price.

* The DiscounterService class is present in the logic.service subpackage.
* Create an Offer record data class that contains all relevant data for an offer: the product, the date, the applicable
  discounts, and the final price.
* The DiscounterService class has a getOffer() method which returns an Offer instance for a product and a date. The
  method checks all existing discounts, and applies all that are relevant in the price.
* The DiscounterService class is covered with unit tests

### Create a DateService class

Create a DateService class responsible for every date and season related calculations. All other classes that need such
services should rely on it.

* The DateService class is present in the logic.service subpackage.
* The DateService class has an isBetween() method which checks if a given date is between two other date arguments,
  start and end (inclusively).
* The DateService class has an isInSeason() method which checks if a given date is within the season provided as the
  second argument.
* The DateService class is covered with unit tests.

### Create Color Discount

Create a ColorDiscount class so that every product of a color can be discounted at a given season. Add the 4 color
discounts to the application based on the description above.

* The ColorDiscount class is present in the logic.discount subpackage, and implements the Discount interface.
* The ColorDiscount constructor collects all data and service dependencies that are required for its calculations.
* The accepts() method of the ColorDiscount class implements the required discount logic.
* There are four ColorDiscount instances added to the application's getDiscounts(), Blue Winter, Green Spring, Yellow
  Summer, and Brown Autumn.
* The ColorDiscount class is covered with unit tests.

### OPTIONAL TASK:

Create Seasonal Discount
Create a SeasonalDiscount class so that every product of a color can be discounted at a given season. To create a
Seasonal Discount, you will need a target, which defines the delay between the products' main season and the discounted
season. Imagine, that you'd like to discount gloves, which is a winter product. You have to define, how many seasons
later the discount will be active. This number is the target.

* The SeasonalDiscount class is present in the logic.discount subpackage, and implements the Discount interface.
* The SeasonalDiscount constructor collects all data and service dependencies that are required for its calculations.
* The accepts() method of the SeasonalDiscount class implements the required discount logic.
* There are two SeasonalDiscount instances added to the application's getDiscounts(), Sale Discount and Outlet Discount.
* The season shift calculation is provided by the DateService class' shiftSeason() method.
* The SeasonalDiscountclass is covered with unit tests.

### Background materials

[Dependency injection](https://www.educative.io/answers/what-is-dependency-injection-in-java)  
[Records in Java](https://www.baeldung.com/java-record-keyword)  
[Dates in Java](https://www.baeldung.com/java-8-date-time-intro)  
[Scanner class in Java](https://www.geeksforgeeks.org/scanner-class-in-java/)  
[Composition over inheritance - simplified](https://www.geeksforgeeks.org/favoring-composition-over-inheritance-in-java-with-examples/)  
[Composition over inheritance - more detailed blog post from the writer of Effective Java](https://blogs.oracle.com/javamagazine/post/java-inheritance-composition)  
