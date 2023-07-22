const mongoose = require("mongoose");

const { Schema } = mongoose;

const UserSchema = new Schema({
    name: String,
    username: String,
    email: String,
    adress: {
        name: String,
        catchPhrase: String,
        bs: String,
    },
    phone: String,
    website: String,
    company: {
        street: String,
        suite: String,
        city: String,
        zipcode: String,
        geo: {},
    },

})

module.exports = mongoose.model("User", UserSchema)