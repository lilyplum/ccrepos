# phonebook
You just moved to a new town, and you'd like to get new friends as soon as possible. You've decided to create a phone book application, or at least some parts of it first.

While you were experimenting with a friendly user interface, you attended a cool office party where you collected a few phone numbers. Later on you realized that many numbers are incorrect (maybe the party was too good), so you decided to write a program that selects the good ones, and also checks for their area codes.

What are you going to learn?
* Get user input.
* Concatenate strings.
* Write strings to the console.
* Use arrays.
* Use conditional statements.
* Count items.

## Tasks

### Check the length
You found a few numbers in your phonebook that are shorter than the others so they are possibly wrong numbers. A properly formatted number should be 10 characters long (including dashes). Your task is to separate the good ones from the wrong ones based on the length, and print the two arrays after each other. Formatting and dashes do not matter here.

* The program selects the too short and too long numbers.
* The program prints out first the good phone numbers then the wrong ones.

### Area codes
Print out the array of the area codes and the array of the phone numbers separately.

The area codes are printed as a separate array.

* The phone numbers are printed without the area codes separately.
* Both arrays contain pieces of completely valid phone numbers.

### Unique area codes
Collect the unique area codes.

* The program prints out the array of the area codes without duplicates.
* The array contains area codes of completely valid phone numbers.

### Count area codes
Count how many (valid) phone numbers belong to the given area codes.

* The program counts (without hardcoding the results) the phone numbers belonging to the three given area codes (98, 34, 72) and prints the results.
* The counter only counts valid phone numbers

### OPTIONAL TASK:
Valid pattern
You received another array of phone numbers (see phonebook.js) but most of them look wrong. A valid number should look like nn-nnn-nnn. Your task is to check every phone number in the array and filter those which are not valid.

* The program selects and indicates the wrong numbers not following the pattern.
* The program prints out the good phone numbers first, then the array of the wrong ones.
* The program does not use regular expression pattern matching.

### General requirements

### Hints
* Please use the given array of phone numbers and do not modify it.
* The area number is the first two digits of the (valid) phone number.
* For number validation you can use the isNaN() method on strings. You can read about it in the background materials.
* You should use [string template literals](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Template_literals) when printing, it makes your life easier.
* You can either remove the invalid numbers from the array or just create a new array for the valid ones.
* The last task requires string pattern checking. For such tasks programmers usually use so-called "regular expressions" (a.k.a. regex). Regex is a quite complicated tool, and you are not supposed to use it here. Please check the characters one by one instead.

### Background materials
[Strings and Numbers](/JavascriptDataTypes.md)  
[Control Structures](/JavascriptControlFlow.md)  
