# grocery-shopping

Your aunt has a small grocery store down on the corner. During the pandemic the only option to keep operating is to go
online and create a web shop offering home delivery.

Family first. Your cousin knows some front-end so she hacks the web pages for the shop. And they've heard you learned
some "back-end language", so you are supposed to write the server-side logic for it.

Well... where to start? You'll need to keep track of a lot of things: list of goods and prices, the contents of shopping
carts that can have multiple items of the same product, and on the top of it there is a complicated tax system in place
that requires tax calculations to be made based on the category of the product.

Luckily, you are not the first programmer to face such requirements, it is quite common that one needs to deal with
similar "collection" of things. Collections to the rescue! Everything is implemented, you only need to decide what to
pick from the toolbox, and for that you need to think deeply about the requirements: Does the order of things count? Can
there be duplicate elements?

What are you going to learn?

* Use lists, sets, and maps.
* Format complex string output.

## Tasks

### Create Product class

Create a data class (it can be a record) named Product. Products need to have a name, a net price (use integer), and a
collection of categories (use the enum provided). The order of categories doesn't count, and it would be meaningless to
add a category more than once to a product.

* The Product class has a string name, an integer net price, and a collection of categories.
* The type of the category collection is unordered and unique.

### Create Cart class

Create a data class (it can be a record) named Cart. A cart needs to hold a collection of products, and most importantly
it needs to keep track of the quantities for all selected products.

* The Cart class has a collection attribute that's capable of tracking the selected products with (integer) quantities.

### Create Grocery class

Create a data class (it can be a record) named Grocery with a name, and a collection of products. The collection needs
to keep the ordering as it is to be displayed as a "menu", and customers will select the products using their ordinals.

* The Grocery class has a string name and a collection of products.
* The type of the 'collection of products' is an ordered collection.

### List products

The list of available products is printed upon launching the application, and later when the command list is entered.
Place a number before each item that helps customers to select the desired product.

* The available product list is displayed as given in the comments of GroceryShoppingApplication.
* The product list is displayed when the application is started.
* The product list is displayed when the list command is entered.

### Shopping cart

Implement a shopping cart that can be filled by entering product numbers. The cart should be initially empty, and accept
any number of valid product selections one by one. The cart should keep track the quantities selected so far from each
product. Display the contents of the cart upon starting the application, and also after processing every (either valid
or invalid) user command.

* Upon start, "Your cart is empty." is displayed above the user prompt.
* When a product is selected for the first time, it gets saved to the cart having quantity one.
* When a product is selected that is already in the cart, its quantity in the cart is increased by one.
* The contents of the cart is displayed after every command process and before the user prompt, with at least the
  product name and quantity information present.
* The unit and total net prices (the latter is the unit multiplied by the quantity) appear for each product in the cart
  when displayed.
* When the user types buy, the application stops with a good-bye message.

### Calculate taxes

Calculate the tax rate for products by adding the rates (given as percentages) of the related categories. An example: "
Gnutella" is an UNHEALTHY and DAIRY product, so the tax rate on it is 10 + 15 = 25%. Display the calculated tax rates
along cart items. Also display the total sum of the tax to pay, and the gross values (net total + tax total) for every
item.

* The tax rates of the products are correctly calculated from the attached categories and their tax rates.
* The total tax and the total gross price is displayed for each line in the cart

### Pretty print cart

Display the contents of the cart in a pleasing and comprehensible way (as it can be in the console). The columns should
follow each other like this: product : quantity : net unit : net total : tax rate : tax total : gross total, separated
by colons. Add spaces ("pad") the displayed data so that the column separators appear as vertical lines. Align product
names left, all the numeric data right, while the column headers appear at the center of the column space. See the
example in a comment of the start repository.

* The columns follow each other like this: product : quantity : net unit : net total : tax rate : tax total : gross
  total, separated by colons.
* Column separators appear at the exact same positions in each line, so the cart is displayed like a proper table.
* Product names are left-aligned.
* Numeric data (quantities, prices, rates) are right-aligned.
* Column headers are center-aligned.
* The table layout doesn't break even if we put extremely big quantities into the cart.

### OPTIONAL TASK: Bad things warning

There are some categories of products that we'd like to raise awareness of. Currently these are UNHEALTHY,
BIG_CARBON_FOOTPRINT, and ALCOHOL.

* The collection of "bad" categories are injected as input parameter to the main shopping method.
* Before the application exits (by command buy), a warning message is displayed like this: Be aware that you have bought
  items from these categories: UNHEALTHY, BIG_CARBON_FOOTPRINT. Only those "bad" categories should be displayed that are
  represented in our cart.

### Hints

* Create one or more service classes that calculate the requested data and assemble the output strings for the UI. Use
  console output only in the ShoppingUI class.
* There is a HUGE literature about Java Collections on the Internet. Don't get lost in the details.

### Background materials

[Records in Java](https://www.baeldung.com/java-record-keyword)  
[About Java Collections](https://www.scaler.com/topics/java/collections-in-java/)  
[A very detailed description of Java Collections](https://www.digitalocean.com/community/tutorials/collections-in-java-tutorial)  
