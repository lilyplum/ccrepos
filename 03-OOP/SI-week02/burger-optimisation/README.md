# burger-optimisation

In this project, we are going to create an order management system for a restaurant that specializes in burgers. Waiters
pick up orders from customers and use this system to submit those orders. The system then assigns each order to an
available cook. Cooks have different skill levels that determine if they can create a given burger based on its number
of ingredients. The system also tries to allocate orders in the most efficient way, which means it assigns new orders to
cooks that are less busy at a given moment.

What are you going to learn?

* Collections: List, ArrayList, LinkedList, Queue, HashMap
* Java records
* Interface Segregation Principle
* Single Responsibility Principle
* Console output

## Tasks

### CookProvider

Create an implementation of the CookProvider interface. The role of this class is going to be to create Cook objects and
serve them to other classes. You can create your own cooks or use the following:

Martha Stewart - Level 1
Jamie Oliver - Level 2
Gordon Ramsay - Level 1

If you don't use these, make sure to create cooks with varying skill levels - it will be useful for testing your
implementation later.

* The CookProviderImpl class is created in the service.cooking package. Upon construction, it creates Cook objects and
  stores them in some kind of a collection in a field.
* The Cooks objects have their ingredient capacity calculated. It is derived from the skill level, and the relationship
  is the following:

```
Level 1 - 5
Level 2 - 6
Level 3 - 8
Level 4 - 12
```

* The getCooks method of the interface CookProvider is implemented, and it returns the previously created cooks objects

### MenuService

The MenuServiceImpl contains all the possible burgers the restaurant can make. However, some of the burgers are quite
complex and require an experienced cook. Before each shift, the restaurant want to make sure to only include burgers in
today's menu that the current cooks are able to make.

* The getAvailableBurgers method is implemented. It returns a list of burgers that the currently available cooks are
  able to make. A cook can make a burger if their ingredientCapacity is higher than or equal to the burger's
  numberOfDifferentIngredients.

### CookingService

Complete the implementation of the CookingServiceImpl class. It implements the CookingService interface which has a
single method that receives a Queue of orders and a List of cooks. By using a Queue for the orders, we can make sure the
burgers are prepared in the same order they were requested, as it is a FIFO (First In First Out)) data structure. Inside
the method, you have to implement the following:

1. Take the order from the front of the Queue
2. Find the cooks who can prepare the burger based on its' number of ingredients
3. Between those cooks, assign the burger to the one who currently has the less workload. For this, use the provided
   workloadMap.
4. Increment the chosen cook's workload using the workLoadMap. Very simply, you can just add the burger's
   numberOfDifferentIngredients to it.
5. Finally, create a Meal object from the Order
6. Repeat until there are no more orders in the Queue

* The cookOrders method is implemented according to the above steps. It returns a Queue of Meal objects, each
  corresponding to an order from the input Queue.

### OrderService

Create an implementation of the OrderService interface. The implementation should have a dependency on the
CookingService and CookProvider interfaces. The class should be able to create Order objects from incoming Burgers and
store them in a member variable. By invoking its processOrders method, it should delegate the processing of the orders
to the CookingService.

* An OrderServiceImpl class is created and placed in the service.orders package. It implements the OrderService
  interface.
* The addBurger method is implemented. It creates Order objects from the Burgers and stores them in a class field.
* The processOrders method is implemented. It delegates the orders collected to the CookingService, providing the cooks
  using the CookProvider dependency. After the cooking process is done, all orders should be removed from the class
  field, putting the class in a clean state. A collection of Meals is returned from the method.

### User Interface

Implement the missing methods in the BurgerOptimisationUiclass.

* The displayAvailableBurgers method is implemented. It prints out to the console the names of the available burgers
  separated by a comma.
* The addOrdersToOrderService method is implemented. It registers the orders received in its input parameter at the
  OrderService.
* The displayMeals method is implemented. It displays the prepared meals in the following format:

Order id: 0; Burger: Light beef burger [Ingredients: 4]; Prepared by: Martha Stewart [Capacity level: 4]

### Application

Complete the implementation of the Application class. A skeleton has been provided. Just change the null values to the
appropriate types. The role of the Application class is to simply create the components and wire them together. Then it
calls the run method of the BurgerOptimisationUi.

* The main method of the Application class is completed.

### OPTIONAL TASK:

Unit tests
Create unit tests for the CookingServiceImpl and MenuServiceImpl classes.

* Unit tests created for the CookingServiceImpl class.
* Unit tests created for the MenuServiceImpl class.

### Background materials

[Introduction to Interfaces](../../IntroductionToJavaInterfaces.md)  
[Interface Segregation Principle](https://www.baeldung.com/java-interface-segregation)  
[Java collections guide](https://www.baeldung.com/java-collections)  
[ArrayList in Java](https://www.baeldung.com/java-arraylist)  
[Queue in Java](https://www.baeldung.com/java-queue)  
[LinkedList in Java](https://www.baeldung.com/java-linkedlist)  
[HashMap in Java](https://www.baeldung.com/java-hashmap)
[ArrayList vs LinkedList](https://www.baeldung.com/java-arraylist-linkedlist)
[Console input & output Java](https://www.baeldung.com/java-console-input-output)
[Single Responsibility Principle](https://www.baeldung.com/java-single-responsibility-principle)
