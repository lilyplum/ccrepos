# Javascript IO
IO is an abbreviation for input and output. In programming, we often need to get data into our code to run calculations, and we usually want to write the generated result to a separate location.

JavaScript code can run in different environments. Currently, we only talk about its most used environment, the web browser.

The browser environment can not read or write to files of the user's computer directly. But we can use the developer console to print out data.

## Print messages
The console object gives access to the browser console, and it has many methods to print out data.

We can separate the messages based on their information content. Browsers indicate different extra markups for these functions. For example, write error messages on a red background might even add stack trace information.

Some functions and those most common use-cases:

* log: general message
* info: marks that some notable event happened
* warn: notifies that something is not how it's supposed to be, but it did not cause direct problems
* error: description of the error that happened
* debug: additional low-level details for developers to make it easy to investigate issues
These methods take any number of values that they print to the console.
```javascript
console.log("Number of days since I wrote to the console:", 23);
console.info({ name: "Bond" });
```
## Write data to the clipboard
The Google Chrome developer console has a built-in copy function to copy data directly to the clipboard. It should not be used in the JavaScript application code but can be used in the developer console to extract results during development.
```javascript
let result = 42;
copy(result);
```
## JSON format
Another way to get data into our code or send data out is through network requests. We can not immediately send out our javascript object, and we need a data format that can travel through these requests. The most widely used format is JSON. It's a plaintext representation of the JavaScript objects. We'll discuss how to send network requests later.

JSON is short for JavaScript Object Notation. The basic building blocks are:

* number: floating-point value with or without decimal dot
* string: character sequence between double quotes
* boolean: literal true/false
* array: an ordered list of nested building blocks between square brackets ([]) separated by commas
* object: unorganized key-value pairs. The keys are strings in double-quotes; the values are any other of the building blocks. Surrounded by curly brackets ({}) and separated by commas
* empty value: literal null
Its syntax is similar to the general javascript format of these blocks.

JSON object has two methods to convert between JSON string and JavaScript objects; parse creates javascript object, stringify creates JSON string.
```javascript
JSON.parse(
'[{"type": "apple", "price": 23.5}, {"type": "mango", "price": 42}]'
);
JSON.stringify([
    { type: "apple", price: 23.5 },
    { type: "mango", price: 42 },
]);
```
Note that the conversion can run into errors. It would be best if you always wrapped them in a try-catch block.