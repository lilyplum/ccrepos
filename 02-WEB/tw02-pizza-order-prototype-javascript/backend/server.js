const express = require("express");
const fs = require("fs");
const path = require("path");
const cors = require("cors");
const app = express();

const port = 8000;
const url = "http://localhost:8000";

const pizzaOriginalData = fs.readFileSync("pizza.json");
const pizza = JSON.parse(pizzaOriginalData);

const allergensOrigalData = fs.readFileSync("allergens.json");
const allergens = JSON.parse(allergensOrigalData);

const orderArr = [];

app.use(express.json());
app.use(cors());
app.use('/static', express.static(path.join(__dirname, "..", "frontend")));
app.use(express.urlencoded({ extended: true }));

app.get("/pizza/list", (req, res) => {
    res.sendFile(path.join(__dirname, "..", "frontend", "index.html"));
});

app.get("/api/pizza", (req, res) => {
    res.send(pizza);
});

app.get("/api/allergens", (req, res) => {
    res.send(allergens);
});

app.get("/api/order", (req, res) => {
    res.send(orderArr);
});

app.post("/api/order", (req, res) => {
    const basketItems = JSON.parse(req.body.basket);
    const id = orderArr.length + 1;

    const orderObj = {
        "customer": {
            "id": id,
            "firstname": req.body.firstName,
            "lastname": req.body.lastName,
            "email": req.body.emailAddress
        },

        "adress": {
            "zip": req.body.zip,
            "city": req.body.city,
            "street": req.body.address
        },

        "basket": basketItems
    };

    orderArr.push(orderObj);
    console.log(orderArr);
    res.send(`
    <div>
        <h1> Thank you for your order!</h1>
        <h2> Team Laguna Pantofolaio is happy to make your yummy pizza! <h2>
    </div>
    `);
});

app.get("/api/getPizza", (req, res) => {
    res.json("pizza.json");
    res.end();
})

app.listen(port);

console.log(url);
