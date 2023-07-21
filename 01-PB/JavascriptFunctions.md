# JavaScript Functions

Functions are one of the most valuable features in JavaScript. Functions enclose a sequential list of statements, get
some input values to work on, and return the calculation results. It lets you encapsulate logic and separate the code
into smaller building blocks. Functions help with code reusability. When you have repeating logic, you don't need to
redefine it every time, you just need to call a function that implements it.

Without functions, our life would be much harder, and our code would be harder to read and understand.

To use a function, you have to make sure that it's available to the code intended to call it.

## Function structure

Let's look at a simple function definition.

```javascript
function square(number) {
    return number * number;
}
```

One way to define functions is to use the function keyword.

### Function name

When we define a function, they need to have a unique name, that's what we're going to use when we call this function.

### Input parameters

The brackets after the function name can contain zero or more input parameters. When we call the function with
parameters, we can use the values with the name defined here.

### Function body

In this form, the function body must be inside curly brackets. It can contain any javascript code.

We have a return keyword that we can use inside functions, it can pass back a value to the caller so that it can
continue it's code running with the calculated value.

### Call the functions

In the example above, we only defined the function, and we did not call it. To call it, we need to use its name,
immediately followed by brackets. The brackets are required. We can pass multiple parameters separated by commas inside
them.

```javascript
const calculationResult = square(5)
```

## Function expressions

Above I implied that there are other ways to define functions. We can create them by function expressions.

```javascript
const squareExpression = function (number) {
    return number * number
}
squareExpression(5)
```

If function expressions do not have a name, we call them anonymous functions. Otherwise, they can only use that name
locally. We will call function expressions with the name of the variable that we assigned them.

Functions are first-order citizens of the language, so they can be passed forward as function parameters, just like
variables.

### Arrow functions

There is a shorter form to define function expressions, with arrow function expressions.

```javascript
const square = (number) => {
    return number * number
}
```

They are always anonymous. If they only contain one expression that needs to be the return value, we can write them in
an even shorter form.

```javascript
squareEquivalent = (number) => number * number
```