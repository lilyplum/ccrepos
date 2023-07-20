# JavaScript Objects

An object is a data structure in JavaScript that can store keyed data collections and more complex entities. We use keys
to separate the different values that we want to store in an object. We can use them to set, retrieve, modify or delete
that value.

The base structure of an object is the following. Inside curly brackets, write a key, then define the value after a
colon and separate these key-value pairs with commas.

```javascript
let object = {
    "key 1": "value1",
    "key 2": "value2",
};
```

The spaces in the property names are for representational purposes, to make it visible that they're always string
values. Usually, it's better to avoid whitespaces and special characters in property names.

## Properties

We call the keys of the objects properties. Properties are always strings. If they are not a string value at the time of
reference, they will be converted to one. When properties have any whitespace character in them or start with a number,
we must wrap them with double-quotes. Otherwise, we get a syntax error upon creation. Otherwise, we can omit the double
quotes. For readability purposes, it's best to keep them consistent and straightforward.

### Property names can be any string. There is no such limit to avoid keywords, like what function and variable names have.

You should keep in mind that objects in contrast to arrays do not have a defined order of their values.

Property existance
You can test whether a property is defined in an object with the in keyword.

```javascript
let customObject = {
    bar: 33,
    bah: 55,
};
"bar" in customObject; // true
"foo" in customObject; // false
```

## Values

Property values can be any data type, even functions. When an object has a function property, we call it a method. We
can set already existing variables as the properties of the objects.

```javascript
let author = {
    id: 42,
    name: {
        last: "Adams",
        first: "Douglas",
    },
};
```

### Property shorthand

When we define a property from a variable and want to give the same name as the already existing variable, we can use
the property shorthand syntax. It saves us the keystrokes of having to type out the same name as the property name and
the reference twice.

```javascript
let count = 23;
// instead of the following declaration:
let countOrinary = {
    count: count,
};
// we can simply write:
let countShorthand = {
    count,
};
```

### Access Values

We can access property names in two different ways, with the dot notation, and with square brackets.

In the dot notation, we write the variable name, add a dot next to it, and write the property name. It only works if the
property name is a single word, does not contain special characters, and does not start with a number.

The other method that works in every case is to write the property name string in square brackets immediately after the
variable name.

```javascript
let book = {
    title: "The Hitchhiker's Guide to the Galaxy",
};
// access values:
book.title;
book["title"];
```

### Modify values

We can modify the object properties. First, we have to access the necessary property, and then with the assignment
operator (= sign), we can set the new value.

```javascript
let car = {
    age: 4,
};
car.age = 5;
```

### Remove values

We can remove properties from an object with the delete keyword.

```javascript
let a = {
    b: 23,
    c: 42,
};
delete a.c;
```

## Other objects

These are the basic rules of a plain object or an Object. There are many other kinds of objects in JavaScript:

* Array to store ordered data collections
* Date to store the information about the date and time
* Error to store the information about an error