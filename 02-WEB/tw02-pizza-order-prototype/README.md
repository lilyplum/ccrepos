No starter code is provided. Start from scratch!

# Pizza Order Prototype

One day around lunchtime, a black car stops in front of your office. A Sicilian guy wearing a black coat gets out of the
car holding a huge black box in his hands. He walks right into your office. Without saying anything he puts the box down
on a desk and then heads out...

Everyone freezes - fear is in their eyes...

Then you start smelling something... nice... melted cheese... and fresh basil... The box, the box smells like... PIZZA!

You pluck up your courage, open the box, and yes! There are seven different fresh Sicilian pizzas and a letter waiting
for you. The pizzas smell so good that you can't resist eating all of them.

When you pull yourself together from the pleasure of the taste, you open the envelope and start to read the letter:

```
These are my grandma's pizzas.
I want these pizzas online!
You have one week to prove you can do it.

Mario
```

What are you going to learn?

* how to do CRUD operations in Node.js
* HTTP methods
* storing files on the server with Node.js

## Tasks

### Pizza and allergen endpoints

Select your 7 favorite pizza types, store them in a JSON file, and serve (GET) it with an Express.js API server at
/api/pizza endpoint. Each pizza has a list of allergen IDs. Allergens can be listed at /api/allergen endpoint.

Pizza object example:

```
{
id: 1,
name: "Marinara",
ingredients: [ "San Marzano tomato sauce", "garlic", "oregano", "olive oil" ]
price: 3200
allergens: [1,3,9]
}
```

Allergens object example:

```
{
id: 1
name: "gluten"
}
```

* Sending a GET request to /api/pizza lists all seven pizza objects as an array. Sending a GET request to /api/allergen
  lists all the allergen objects as an array.

### Pizza list UI

List the pizzas on a UI at /pizza/list. Make the pizza list filterable by allergens.  
Use this or this nice looking UIs as from Behance for the project.

* Visiting the /pizza/list shows all the pizzas and their details including the name of the allergens.

### Pizza order endpoint

Prepare the order endpoints. Serve the list of orders at /api/order endpoint when a GET request sent, and add new order
to the list when a POST request sent with proper request body (valid order object).

Order object example:

```javascript
{
  id: 1,
  pizzas: [
    {
      id: 1,
      amount: 2
    }
  ],
  date: {
    year: 2022,
    month: 6,
    day: 7,
    hour: 18,
    minute: 47
  }
  customer: {
    name: "John Doe",
    email: "jd@example.com",
    address: {
      city: "Palermo",
      street: "Via Appia 6"
    }
  }
}
```
* Sending a GET request to /api/order lists all the pizza orders.
* Sending a POST request (containing a valid order object) to /api/order adds the order to the order list.

### Pizza oder UX
Extend the UI with order features. Add amount `<input>` and add to order `<button>` to every pizza. Create the order `<form>` which becomes available after at least one pizza added to the order and disappears when all the pizzas are removed.

* Visiting the /pizza/list shows amount `<input>` and add to order `<button>` to every pizza.
* Adding at least one pizza to the order make the customer details `<form>` available.
* Removing all the pizzas from the order make the customer details `<form>` unavailable.

### Hints
* Do not use server-side templating (for example Embedded JavaScript template), use fetch instead and render the HTML with JavaScript on the client side.
* You should disregard database and authentication.
* Keep in mind the UX of the ordering process as well, check the customer journey of food ordering sites and services, and use the best practices in your own solution.

### Backkground materials

[HTTP request methods](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods)  
[Fetch API](https://web.dev/introduction-to-fetch/)  
[Fetch API overview](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API)