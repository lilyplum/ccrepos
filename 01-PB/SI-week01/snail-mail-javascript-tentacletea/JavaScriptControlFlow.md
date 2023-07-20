# JavaScript Control flow
The order in which individual statements (i.e., the lines of code) are executed is called control flow. The basic rule of control flow is that it goes line by line, starting from the first line.

We call control structures those language elements that can alter this default control flow. They offer a means for the control flow to go in different directions based on some parameters.

There are three main types of control structures conditionals, loops, and jumps.

## Conditionals
Conditionals can be used to pick a code block based upon the truth value of their conditions.

### If/else
If the condition of the if statement evaluates to true, the code in the body is executed, otherwise, it runs the code in the else block, if any.
```js
const number = 17;
if (number < 0) {
    console.log("The number is negative");
} else if (number < 10) {
    console.log("The number has one digit");
} else {
    console.log("The number has more than one digit");
}
```
Note that you can omit the curly brackets around the code at if and else if it's just one statement. It's good practice always to write them out, though. For this reason, there is no separate keyword for the else if case. It's just a combination of the two.

### Loops
Loops repeat a block of code based upon a condition. In JavaScript, the most common looping keyword is for.

### For..of
The for...of construct creates a loop iterating over collections like Array, Map, or Set. For each property, JavaScript executes the specified statements.
```javascript
const foodList = [
    { type: "Pizza", kind: "Margherita" },
    { type: "Cheese", kind: "Cheddar" },
];

for (let food of foodList) {
    console.log(`I'd like to eat ${food.kind} ${food.type}!`);
}
```
### Foreach method
Arrays have a method called forEach that has similar functionality to for..of. It takes a callback parameter, iterates over all items, and calls the callback function on each list item. One more similarity that it does not execute other code until it reached all elements.
```javascript
const foodList = [
    { type: "Pizza", kind: "Four Seasons" },
    { type: "Cheese", kind: "Gouda" },
];

foodList.forEach((food) => {
console.log(`I'd like to eat ${food.kind} ${food.type}!`);
});
```
### For..in
The for...in construct iterates a variable over all properties of an object. For each property, JavaScript executes the specified statements.
```javascript
const foodObj = {type: "Pizza", kind: "Margherita"};
for (let prop in foodObj) {
    console.log(`${prop}: ${foodObj[prop]}`);
}
```
### For
A for loop repeats until a specified condition evaluates to false.
```javascript
for (let i = 1; i < 4; i++) {
console.log(i);
}
```
The for loop declaration consists of three expressions enclosed by parentheses and separated by semicolons. The first one is the initialization of the loop counter (variable), which runs only once and before the second expression. The second expression is a condition that checks whether or not the loop should continue. The third expression modifies the loop variables. This syntax appears in many other programming languages like C.

This version can perform better on really huge arrays, but it makes the code harder to read. The other for variants are more common in JavaScript.

### While
for loops are a good choice if you know in advance the exact amount of iterations you'll need to do. In other cases, when you need to iterate until the work is done, a while loop can be a more straightforward choice.

while starts the loop again and again if the condition after the keyword is truthy.
```javascript
let n = 42;
let iterationCount = 0;
while (n !== 1) {
iterationCount++;
if (n % 2 === 0) {
n = n / 2;
} else {
n = 3 * n + 1;
}
}
console.log(`Collatz-conjecture finished after ${iterationCount} steps.`);
```
## Jumps
Jumping statements modify the code execution.

* break: exits from the current loop
* continue: skips to the next value of the loop iteration
* return: exits from the current function, can pass a value to the caller
You can use them in any of the loops above, except forEach method of the arrays.

## Handling errors
The try-catch structure lets you inform the interpreter that something can go wrong in a specific part of your code, and you can implement error handling specifically for those parts.

When something goes wrong, the JavaScript code can throw error objects that you can catch. When an error is thrown, the code execution is stopped in that block, and it continues in the next catch block. Without an outer try block, these errors are not handled and can cause your code to stop or malfunction.

Note that the situation is a bit different in asynchronous code. We'll look into it later.

### Empty values
JavaScript has two different values to mark a missing value: null and undefined.

When a variable is assigned without a value or a function does not return a value explicitly, their result will be undefined.

null should represent an intentional absence of a value.

These values are not Error-s, but without proper handling, they can lead to errors.

Before accessing properties or using the function call operator on objects that can be empty, you should make sure that they have an appropriate value. We usually call this null checking.
```javascript
const author = null
if (author && author.name) {
    console.log(author.name, "is an author")
}
```

### TypeError
When JavaScript can not perform an operation, it throws a TypeError object. A typical example is when a value is not of the expected type.

Typical examples:

* an operand or argument passed to a function is incompatible with the type expected by that operator or function
* when attempting to modify a value that can not be changed
* when attempting to misuse a value.
```javascript
try {
// NOTE: intentional error, don't do this in your code.
    null(); // TypeError: null is not a function
} catch (err) {
    console.error("Something bad happened!", err);
}
```
### ReferenceError
The ReferenceError object represents an error when the code tries to reference a non-existent variable.
```javascript
try {
    let a = undefinedVariable; // ReferenceError: "undefinedVariable is not defined"
} catch (err) {
    console.error("Something bad happened!", err);
}
```