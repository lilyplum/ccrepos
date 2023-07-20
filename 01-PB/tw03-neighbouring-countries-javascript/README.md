# neighbouring-countries
An international organisation working in diplomatic operations asked you to help with a project. They did some research and realized that most of the time, aggressor countries attack the weakest neighbour. To determine which country is in danger from which, they asked you to create a web-based app.

What are you going to learn?
* Process complex data.
* Handle arrays and objects.
* Create and use algorithms.
* Manipulate DOM.
## Tasks

### List the countries
The data.js file contains all the countries of the world in the countries variable.

* List the common names of the countries in the <select id="all"> element as <option> elements.
* The common names of the countries contained in the countries variable of the data.js file are added to the <select id="all"> element as <option> elements.

### Details of the selected country
Display the details of a selected country. When a country is selected from the countries listed in the <select id="all"> element, the following properties must be displayed in the <main id="country"> element: Flag (as <img> element), Common name (as <h1> element), Region (as <h2> element), Subregion (as <h3> element), Capital city (as <h4> element)

* When a country is selected from the countries listed in the <select id="all"> element, the following properties are displayed in the <main id="country"> element: Flag (as <img> element), Common name (as <h1> element), Region (as <h2> element), Subregion (as <h3> element), Capital city (as <h4> element)
* If no country is selected, the <main id="country"> element contains the Select a country from the list text.
* Each time another country selected, the content of the previously selected one disappears from the <main id="country"> element and the content of the selected one is displayed.

### Neighbour with the largest population
There is a `<button id="population">` next to the `<select id="all">` element. Clicking on this button must display the neighbor country of the currently selected country with the largest population. In the <main id="country"> element, the content of the current country must disappear.) The button must only be displayed after a country is displayed.

* When a country is selected from the list, the `<button id="population">` is displayed.
* When the `<button id="population">` element is clicked, the neighbor country with the largest population is displayed in the <main id="country"> element.
* When the `<button id="population">` element is clicked, the selected country in the `<select id="all">` element changes to neighbour country with the largest population.


### Neighbour with the largest area
There is a `<button id="area">` next to the `<button id="population">` element. Clicking on this button must display neighbor country of the currently selected country with the largest area. In the `<main id="country">` element, the content of the current country must disappear.) The button must only be displayed after a country is visited is displayed.

* When a country selected from the list the `<button id="area">` is displayed.
* When the `<button id="area">` element is clicked, the neighbor country with the largest area is displayed in the <main id="country"> element.

When the `<button id="area">` element is clicked, the selected country in the `<select id="all">` element changes to neighbour country with the largest area.
### Previous and next buttons
Create two new buttons in the `<nav id="toolbar">` element: `<button id="prev">` (with the text Previous country) `<button id="next">` (with the text Next country) The buttons must change the current country. The Next button must be inactive if there is no next country, that is, if the Previous button is not previously clicked. The Previous button must be inactive if there is no previously displayed country. Every visited country must be stored and revisitable using the buttons. The buttons must only be displayed after a country is displayed.

* Two buttons are added to the <nav id="toolbar"> element using JavaScript: `<button id="prev">` (with the text: Previous country), `<button id="next">` (with the text: Next country)
* Every previously displayed country can be navigated to using the buttons.
* The Next button is inactive if there is no next country, that is, if the Previous button is not previously clicked.
* The Previous button is inactive if there is no previously displayed country.
### OPTIONAL TASK: Translations
* Add a `<select>` element to the `<nav id="toolbar">` element using JavaScript for accessing the translations of the common name of the country.
* List the keys of the translation languages (such as deu, est, fin) as <option> elements in the `<select>` element. Every time a country is visited (that is, displayed in the `<main id="country">` element) the content of the <select> element must be updated.

* Every time a country is visited (that is, displayed in the `<main id="country">` element) a <select> element is displayed containing the code of the translatiion languages.
* Selecting a language from the `<select>` element changes the common name of the displayed country in the `<main id="country">` element.
* When changing countries (using the country selector or the buttons), if the language selected in the `<select>` is available in the translations of the new country, the language remains the one selected.

### General requirements
* Inline style (CSS added with style attribute in the HTML document) is not used in the project. Not even with Javascript.
* Inline JavaScript (JS added to the HTML elements as attribute, such as onclick="myFunction()" ) is not used in the project.
### Hints
* You can use the node backend/server.js command from the terminal to run the project. The frontend folder contains all the files you need to check or use.
* After running node backend/server.js, visit http://127.0.0.1:9000 to see the page.
* The head tag of theindex.html file contains a data.js file and a script.js file. The former contains the countries variable. Placing data.jsfirst in the head of the HTML file allows thescript.js to read the countries variable from it. This is similar to placing this variable at the top of the script.js file.
* Try to create reusable functions, arranging the HTML and JavaScript into different functions filled across arguments and parameters.
* You can use an input event listener for select elements and a click event listener for button elements.
### Backkground materials
[Create HTML elements from Array items](https://gomakethings.com/two-more-ways-to-create-html-from-an-array-of-data-with-vanilla-js/)  
[Input event examples](https://www.javascripttutorial.net/javascript-dom/javascript-input-event/)  
[Click event](https://developer.mozilla.org/en-US/docs/Web/API/Element/click_event)  
[Add Bootstrap with <link> / <script> tag](https://getbootstrap.com/docs/5.2/getting-started/introduction/#quick-start)  
[Add Tailwind with <link> / <script> tag](https://tailwindcss.com/docs/installation/play-cdn)  
