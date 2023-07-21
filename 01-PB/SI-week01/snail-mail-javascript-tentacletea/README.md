# snail-mail
Your friend recently started an e-commerce business where people can buy little animals like reptilians, snakes, and snails. You have created a basic webshop for the startup.

Before any purchase the customers need to create an account. Unfortunately, 10% of the users give invalid email addresses on the form, and they cannot be reached again. It's your job to fix this problem, and write a basic email validator for the registration page.

A valid email address looks like this: username@do.ma.in. The first part is called username, the second part (after the '@') is the domain. A valid address must follow these rules:

* There is exactly one '@' character in it.
* Neither the username nor the domain can be empty or start with a . character.
* There is at least one . character in the domain, and the top-level domain (the last part of it) must be at least two characters long.
* Use only the already defined variables

What are you going to learn?
* Turn written requirements into code.
* Use conditional statements.
* Use basic string functions.
## Tasks

### At least one '@'
The validator should give an error when there are no '@' characters in the email address.

* Writing the email hello.worldcom, the program prints An email address has to contain a '@' character!.1

### Only one '@'
The validator should give an error when there are more then one '@' characters are in the email address.

* Writing the email he@llo@worldcom, the program prints An email address cannot contain more than one '@' characters!"2

### Username is not empty
The validator should give an error when the username is empty.

* Writing the email @world.com, the program prints The username before the '@' character cannot be empty!3
### Domain is not empty
The validator should give an error when the domain is empty.

* Writing the email hello@, the program prints The domain after the '@' character cannot be empty!3
### At least one '.'
The validator should give an error when there are no . characters in the email address.

* Writing the email hello@worldcom, the program prints An email address has to contain at least one '.' character!3
### At least one '.' in domain
The validator should give an error when there are no . characters in the domain.

* Writing the email hell.o@worldcom, the program prints The domain has to contain at least one '.' character!3
### Top-level domain is not empty
The validator should give an error when the domain ends with a . character.

* Writing the email hello@worldcom., the program prints The top-level domain cannot be empty!3
### TLD is at least two characters long
The validator should give an error when the last part of the domain is less than two characters long.

* Writing the email hello@worldco.m, the program prints The top-level domain has to be at least two characters long!3
### Valid username
The validator should give an error when the username starts with a . character.

* Writing the email .hello@world.com, the program prints The username cannot start with a '.' character!3
### Valid server name
The validator should give an error when the first part of the domain is empty.

* Writing the email he.llo@.world.com, the program prints The domain cannot start with a '.' character!3
### Valid email address
The validator should recognize a valid email address.

* Writing the email hello@world.com, the program prints Valid email address :)3


### Hints
* You will need to install the prompt-sync package with the npm install prompt-sync command while being in the repository's folder in the terminal.
* Use the given count and position values to create the error conditions. You won't need any other values for the solution.
* You won't need it here as the values are given, but in other situations you would have to search the internet for expressions like javascript count number of characters in a string or javascript find last occurrence in a string, and adapt the found code snippets to your needs.
* The position of the last character is lengthOfEmail - 1.
* The positions of neighboring characters differ by 1.
* Be sure to structure your conditions in a logical way (e.g. do not check for a valid server name before confirming that there is at least a `` and a . present).

### Backkground materials
[Conditional Statements](../../JavascriptControlFlow.md)  
[Introduction to NPM](https://www.w3schools.com/nodejs/nodejs_npm.asp)  
[Strings](../../JavascriptDataTypes.md)  
[]()  
[]()  
[]()  
[]()