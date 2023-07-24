# Jest the beginning
Software testing is a method of determining whether the actual software product meets the expected requirements and ensuring that the software product is free of defects. The goal of software testing is to find errors, gaps, or missing requirements in comparison to the actual requirements.

With a JavaScript library like React, one of the best tool for testing is jest. The jest package is as useful as the create-react-app script, as it already contains the latest packages from it. In this project, you will setup the environment for testing your front-end code.

What are you going to learn?
* Testing JavaScript code
* Coverage

## Tasks

### Test declareWinner
The declareWinner function determines the winner of a fight between 2 fighter objects with name, health, and damagePerAttack attributes. Create a test file for declareWinner with tests that cover every case for every function.

* There is a test where the fighter in the first parameter wins
* There is a test where the fighter in the second parameter wins

### Test findUnique
The findUnique function finds the odd one out from an array of elements. Create a test file for findUnique with tests that cover every case for every function.

* There is a test where the first number of the array is the odd one
* There is a test where the second number of the array is the odd one
* There is a test where the odd one is not the first or second number of the array
* There is a test for invalid input expecting an error message of 'Invalid input'

### Test monkeyTalk
The monkeyTalk function returns your input string in the form of monkey talk. Words starting with vowels transform into Eek, else they get transformed into Ook. The returned string gets the first letter capitalized, all the punctuation marks removed and a period at the end of it. Create a test file for monkeyTalk with tests that cover every case for every function.

* There is a test where an empty string returns the correct value
* There is a test where a string with a single word returns the correct value
* There is a test where a string with multiple words starting with vowels and consonants returns the correct value
* There is a test where a string with multiple punctuation marks returns the correct value

### Test palindromeChainLength
The palindromeChainLength function returns the number of iterations needed to get a palindrome by adding the reverse of the number to the number. There are number that cannot be made into a palindrome. Create a test file for palindromeChainLength with tests that cover every case for every function.

* There is a test for the reverseNumber function
* There is a test for the isPalindrome function
* There is a test where it takes 0 iterations to get a palindrome
* There is a test where it takes 1 iteration to get a palindrome
* There is a test where it takes large number (e.g. 24) iterations to get a palindrome
* There is a test where the number cannot be made into a palindrome and throws an error

### OPTIONAL TASK: Visualization
Visualize the code coverage

* Jest is configured to generate an HTML report

### General requirements
Test coverage is 100%

### Hints
* First step you need to setup your package.json (check background materials)
* The maxDiff function already has tests you can check out
* You can run tests with npm test in the CLI
* [Lychrel](https://en.wikipedia.org/wiki/Lychrel_number) numbers for the palindrome task
* Check out what type of coverage reports are supported out of the box by jest. (HTML)

### Backkground materials
[Software testing](Software-testing.md)  
[Jest overview](https://jestjs.io/docs/getting-started)  
[Matchers](https://jestjs.io/docs/expect)  
