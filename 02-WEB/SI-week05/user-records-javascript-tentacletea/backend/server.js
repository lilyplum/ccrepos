const mongoose = require('mongoose');
mongoose.set("strictQuery", false);
const fetch = require('node-fetch');
const express = require("express");
const path = require("path");

const app = express();
app.use(express.json());
app.use(express.urlencoded({ extended: false }));

const url = "https://jsonplaceholder.typicode.com/users";
const port = 9001;

const User = require("./db/UserRecords.model");

const connectDB = async () => {
    console.log("Trying to connect to DB");
    try {
        await mongoose.connect("mongodb://localhost:27017/user-records");

        console.log("Connected");
    } catch (error) {
        console.log("Failed to connect to DB", error);
    }
}

const loadApiData = async () => {
    try {
        const response = await fetch(url);
        const data = await response.json();
        return data
    } catch (error) {
        console.log("api error: ", error);
    }
}

const createEntriesToDB = async (data) => {
    console.log("creating entries to DB");

    for (const user of data) {

        await User.create({
            name: user.name,
            username: user.username,
            email: user.email,
            adress: {
                street: user.address.street,
                suite: user.address.suite,
                city: user.address.city,
                zipcode: user.address.zipcode,
                geo: user.address.geo
            },
            phone: user.phone,
            website: user.website,
            company: {
                name: user.company.name,
                catchPhrase: user.company.catchPhrase,
                bs: user.company.bs
            }
        })
    }
}

// app.get("/", (req, res) => {
//     res.sendFile(path.join(`${__dirname}/../frontend/index.html`))
// })

app.get("/api/users", (req, res) => {
    res.send("hello")
})

const main = async () => {
    await connectDB();
    const data = await loadApiData();
    await User.deleteMany();
    await createEntriesToDB(data);
        
    app.get("/", (req, res) => {
        res.send(data)
    })

    const allEntries = await User.find({}).lean();
    console.log(allEntries)

    app.listen(port, _ => console.log(`http://localhost:${port}`));
}

main();