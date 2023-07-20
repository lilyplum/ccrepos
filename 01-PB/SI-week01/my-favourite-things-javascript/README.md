No starter code is provided. Start from scratch!
# My favourite Things
There are so many great movies, series, books etc. around us, that it's hard to remember which are the best one's when someone asks it from us.

It's time to organise your favourite things!

What are you going to learn?
* Objects
* Arrays
* access to values
## Tasks

### Your favourite book
Create a variable (preferably with const keyword): myFavBook. Add an object as the variable's value with the following keys: title, author, year, description.

* There is a myFavBook variable which has the following keys: title, author, year, description and the key's filled with an existing book's details.1

### Your favourite movie
Create a variable (preferably with const keyword): myFavMovie. Add an object as the variable's value with the following keys: title, director, year, description, actors. The actors key's value should be an array which contains at least five objects with the same key's. Each object within the actors key's array should contains the following keys: actorName, roleName.

* There is a myFavMovie variable which has the following keys: title, director, year, description and the key's filled with an existing movie's details.
* The myFavMovie variable's object also contains an array (as the actors key's value). This array has at least five objects with the same keys. These object keys are the following: actorName, roleName. Each object contains the movie's actor.2

### Your favourite series
Create a variable (preferably with const keyword): myFavSeries. Add an object as the variable's value with the following keys: title, directors, seasons, description, actors.

* The actors, directors and the seasons keys' value should be an array.
* The actors array should contains at least five object with the same key's. Each object within the actors key's array should contains the following keys: actorName, roleName.
* The directors array should contains at least one string (the name of the director).
* The seasons array should contain at least two objects which have the same keys. (If your favourite series has only one season then the seasons array can have one element of course.) Each object within the seasons array should contain the following keys: episodes (the number of the episodes), startYear,endYear.
* There is a myFavSeries variable which has the following keys: ``title, directors, seasons, description, actors` and the key's filled with an existing series's details.
* The myFavSeries variable's object also contains an array (as the actors key's value). This array has at least five objects with the same keys. These object keys are the following: actorName, roleName. Each object contains the series's actor.
* The myFavSeries variable's object also contains an array (as the directors key's value). This array has at least one string, the series director(s) name.
* The myFavSeries variable's object also contains an array (as the seasons key's value). This array has at least two (if two are applicable) objects with the same keys. These object keys are the following: episodes a number (of the episodes), startYear endYear. Each object contains the series's season.3
### Your favourites
Create a variable (preferably with const keyword): myFavs. Add an object as the variable's value with the following keys: book, movie, series. Add all three previous variables as the value of these keys. (Don't copy paste them!)

* There is a myFavs variable which has the following keys: ``book, movie, series` and the key's filled with the three already existing variables as values.3
### Console log some details
Console log the following values (without copy-paste-ing their value into the console log method's brackets):

* Your favourite book's author
* Your favourite movie's first actor's roleName
* Your favourite series's last season's endYear


* The following values are console logged when running the javascript file with Node.js in terminal:
  * Your favourite book's author
  * Your favourite movie's first actor's roleName
  * Your favourite series' last season's endYear
* The values not copy-paste-ed from the previously created variables.
* The values accessed by the myFavs variable for the console log.3
### Console log the episodes
Console log your favourite series' last season's all episodes as numbers. (eg.: 1, 2, 3 ... 12)

* Your favourite series' last season's all episodes are console logged as numbers when running the javascript file with Node.js in terminal.
* Simple for loop is used for the console log.
* The value accessed by the myFavs variable for the console log.

### Console log the directors
Console log the directors of your favourite series if the length of the directors array more than one.

* Your favourite series' last season's directors console logged when running the javascript file with Node.js in terminal.
* An if else statement is created to check the length of your favourite series' directors array. If the length is more than one the directors names are console logged (with a for loop). The loop's code is written even the length is only one.

### Hints
* Be really careful with the syntax! Your code won't work if you miss a bracket a quote-mark or a comma.
* Use template literals for the console log's. eg:
```javascript
console.log(`

My favourite book's author is: ${myFavs.book.author}

`);
```
### Backkground materials
[Object Basics](https://developer.mozilla.org/en-US/docs/Learn/JavaScript/Objects/Basics)  
[Working with Objects](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Working_with_Objects)  
[Working with Arrays](https://www.digitalocean.com/community/tutorials/understanding-arrays-in-javascript)  
[Template literals](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Template_literals)  
[Git basics](GitBasics.md)  
