# hops-and-hofs
One of the essential ingredients in beer is hops. There are several types and they can be combined, but the purpose of each is the same. Keep the beer simple but amazing.

The same can be said for the HOFs (Higher-Order Functions) for programming as well.

The HOCBA's (Highest Order Craft Beer Award) jury ask you to help them with a small tool to group and arrange the top 20 craft beers into different categories and to select the category winners.

What are you going to learn?
* Callbacks
* Higher-Order Functions
* Shallow copy
* Modern JS syntax

## Tasks

### Load Beers Button
Add the proper parameters to the buttonComponent function which should return a `<button>` with the text Load the beers and with the loadBeers id.

* A `<button>` with Load the beers text and loadBeers id is shown in the browser.

### Render the Beers into the HTML
Fill the click event listener's clickHandler callback function. When clicking on the Load the Beersbutton render the array of beers into the index.html file's #root div element with the beerComponent in the script.js and remove the button from the DOM.

* Clicking on the Load the beers button shows all the beers listed in the data.js with the beerComponent's HTML code in a section HTML element.
* Clicking on the Load the beers button also removes the button itself from the DOM.
* Only map, join, insertAdjacentHTML and the click event listener's clickHandler's callback are used for the task.

### Sort by score
Add sorting functionality to the list. Create a button with the text Sort by Score. Display it at the same time as the beer list. Re-render the whole list sorted by score when the button clicked. Keep the original data (array) untouched.

* Clicking on the Load the beers button shows a <button> with the text Sort by score and with the sortByScore id.
* The buttonComponent used for the Sort by score button.
* Clicking on the Sort by score button removes the beer list from the DOM then adds it sorted by the beers array object's score keys value.
* The original beers array is not modified.
* Only spread operator, sort, join, insertAdjacentHTML and the click event listener's clickHandler's callback are used for the task.

### Reverse sort by score
Add reverse sorting functionality to the list. Update the Sort by score button. Clicking on it toggles the list order.

* Every second click on the Sort by score button removes the beer list from the DOM then adds it reversed.
* The original beers array is not modified.

### Filter the Strong IPAs
Create a button with text Strong IPAs. Display it at the same time as the beer list. Rerender the list but only with IPAs which have ABV larger or equal than 6%. If the list is sorted by score the IPA list should remain sorted as well.

* Clicking on the Load the beers button shows a <button> with the text Strong IPAs and with the filterStrongIPAs id.
* The buttonComponent used for the Strong IPAs button.
* Clicking on the Strong IPAs button removes the beer list from the DOM then adds it back but only with IPAs which have ABV larger or equal than 6%.
* When the list is sorted by score the filtered list remains sorted.
* Clicking on the Strong IPAs button also removes the button itself from the DOM.
* Only filter, join, insertAdjacentHTML and the click event listener's clickHandler's callback are used for the task.

### Reset filtered list
Add reset functionality to the list. Create a button with the text Reset filter. Display it at the same time as the beer list is filtered to the Strong IPAs. Re-render the whole list when the button clicked. If the list is sorted by score the list should remain sorted as well.

* Clicking on the Strong IPAs button shows a `<button>` with the text Reset filter and with the resetFilter id.
* The buttonComponent used for the Reset filter button.
* Clicking on the Reset filter button removes the filtered beer list from the DOM then adds it back unfiltered.
* When the list is sorted by score the beer list remains sorted.
* Clicking on the Reset filter button also removes the button itself from the DOM and adds the Strong IPAs button back.

### Declare Winner
Declare the winner in the Light Ale category. Create a button with the text Best Light Ale. Display the beer (independently from the list) which has type Ale, its ABV is lower than or equal to 6% and has the highest score shown when the button is clicked. Display it with the winnerComponent's HTML code. The component has a close button which removes the component from the DOM.

* Clicking on the Load the beers button shows a `<button>` with the text Best Light Ale and with the bestLightAle id.
* Clicking on the Best Light Ale button shows the beer which has type Ale, its ABV is lower than or equal to 6% and has the highest score shown winnerComponent's HTML code in a section HTML element.
* Clicking on the Best Light Ale button also removes the button itself from the DOM.
* Clicking on the component's Close button removes the component from the DOM and restores the Best Light Ale button.
* Only reduce, insertAdjacentHTML and the click event listener's clickHandler's callback are used for the task.

### General requirements
* Loops weren't used in the code at all.
* Only one click event listener used in the project on the (global) window object.

### Hints
* This project shows you not only the functional programming patterns, but also prepares you for the modern JS syntax which is used in modern JS libraries and frameworks such as React.js and Angular.
* You could solve most parts of the project with loops, but this time you have to work without them. If that's easier for you you can solve the tasks with loops then you can turn/change them HOFs.
* Callback functions - concept is simple "give a function to another function as argument and let that function decide when to call it" using them could be confusing, but you already meet them when you use the addEventListener method. Practice them carefully before you jump into the project.
* There are two js files in the starter code's frontend folder. Thedata.jscontains the array of the beers and the script.js contains a beerComponent function (and a load event listener).
* Use arrow functions and use the features of the arrow functions.
* Use object destructuring as often as you can.
* Use the ternary operator where you can.

### Backkground materials

[Callback functions](https://developer.mozilla.org/en-US/docs/Glossary/Callback_function)  
[Functional programming](https://www.geeksforgeeks.org/functional-programming-paradigm/)  
[Higher Order Functions in JS](https://dmitripavlutin.com/javascript-higher-order-functions/)  
[map()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/map)  
[filter()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter)  
[reduce()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/reduce)  
[Copy objects](https://medium.com/nerd-for-tech/how-to-copy-objects-in-javascript-4a44740b04a5)
[spread operator](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Spread_syntax)
[object assign](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/assign)
[Arrow functions vs functions](https://dmitripavlutin.com/differences-between-arrow-and-regular-functions/)
[Object destructuring](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment#object_destructuring)
[Ternary Operator](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Conditional_Operator)