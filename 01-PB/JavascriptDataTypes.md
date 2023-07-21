# JavaScript Data types
When you operate on variables, you need to know what kind of data you are dealing with. The simplest types of data that JavaScript supports are text, number, and logical value. Data types are an essential concept since JavaScript has a different set of methods for different variables.

When you define a variable, you do not need to tell in advance what kind of variable you will put in there, and the variable types are dynamic. Operations you define on variables will decide what to do with the data when the runtime executes that line of code.

## String
Strings are a sequence of characters that represent text. Strings are quoted with single or double quotes, and there is no difference between them. It's good practice to keep them consistent. Many people prefer double-quotes.
```javascript
const greeting = "Hello!";
```
Strings are immutable, which means when you created them, you can not change their content. You need to create a new one to modify it.

You can use a plus sign to concatenate more strings together.

Strings have a length property that stores the number of characters inside them.

You can access individual characters from a string with a number inside square brackets, 0 is the first character, e.g.: greeting[2]; // => l.

There are many operations that you can use on strings, some of the most common ones:

* .indexOf(substring): returns the start index of the given substring, or -1 if not found
* .toUpperCase(): returns a string with the uppercase variant of the characters inside the string
* .toLowerCase(): returns a string with the lowercase variant of the characters inside the string
* .trim(): returns a string without leading and ending whitespace characters
* .slice(beginIndex, endIndex): returns a substring based on the given indices
* .split(separator): splits the string based on the given separator pattern
### Template
You can create string templates with backtick characters and use other variables or calculate code inside.
```javascript
const name = "World";
const greeting = `Hello ${name}!`;
```

## Number
JavaScript represents numbers in floating-point. The implementation details are not necessary for now. The thing to note here is that it works fine for integer numbers but might show strange results for calculations that look simple, like 0.1 + 0.2 // 0.30000000000000004.

Numbers support standard mathematical operations between two numbers: addition (+), subtraction -, multiplication (*), power (**), division (/), remainder (%).

Single numbers support increment (++) and decrement (--) by one.

Numbers support general relational operators as well as <, <=, >, >=. For equality check, you should use triple equal sign ===. We'll get into the reasons later.

The operator precedence is similar to the one you got used to in Math classes, and you can use parentheses to override the operation order.

There is a number, NaN, which is short for not a number. A bit controversial, I know. To check equality with NaN, you'll need to use isNaN(numberToCheck) on the number.

Another unique number is Infinity, which can be positive or negative. It can occur when you divide by zero or calculate a too large number.

JavaScript supports converting strings to numbers.

* parseInt(stringOfNumber, base): reads an integer number from the string into the given mathematical numeric base
* parseFloat(stringOfNumber): reads a number from the string into a floating-point number
## Boolean
Logic values are true and false. Boolean algebra defines the operations in these values.

The logical operators are:

* AND (&&): the result of this operator is true if both operands are truthy
* OR (||): the result of this operator is true if any operands are truthy
* NOT (!): returns the opposite logical value
The logical primitive value is true. But these operators work on other data types. In numbers 0 and NaN are falsy values. In strings, the empty string is the falsy value, and all others are truthy.

## Empty values
In JavaScript, two primitive values represent a missing value.

When you declare a variable without setting an initial value, you'll get undefined.

It's hard to tell whether undefined was set accidentally to that value or not. null is a value that represents the intentional absence of any value.

These are both falsy values for logical operators.