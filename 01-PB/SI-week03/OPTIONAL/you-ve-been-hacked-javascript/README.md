# You've been hacked !

## Story

A group of unknown people hacked the `HR Web Site`. They changed some of the content on the site.
While the security team is trying to find and eliminate the hacker code, your task is to restore the site to its previous state.
Unfortunately, any changes you make in the `html` code have no effect. They may even destroy the original functionality of the site, so the only way to fix this is through writing your own code in the `script.js`.
The hackers managed to deactivate the `document.getElementById`, `document.getElementsByTagName`, `document.getElementsByClassName`, and `document.getElementsByTagNameNS`, so the only way to modify the site is by changing the properties of the variables which contain a reference to `html` elements.

## What are you going to learn?

- Manipulate the DOM.
- Access nested HTML objects in JavaScript.

## Tasks

1. Change the `placeholder` from `Enter bank account of hacker here` to `possible number` by accessing the variable `numberInput`.
    - The input below the text `Input some text` has the placeholder text `possible number`.

2. Change the button label from `Calculate the person with the highest hacking score` to `Calculate highest salary` by accessing the variable `calculateHighestSalaries`.
    - The button under the five horizontal inputs has the label `Calculate highest salary`.

3. Change the value of all salaries which have the value `-999999` to `12823` by accessing the `salaryList` variable.
    - In table of the employees and salaries there are three rows with a value of `12823`.

4. Change the button label from `Find all matching hackers` to `Find all matching inputs` by accessing the `employeeList` variable. Make the design of the button similar to the rest of the buttons on the page.
    - The last button in the page has the label `Find all matching inputs`.
    - The last button in the page has the same look as the rest of the buttons in the page. (That is, blue background and white text.)

5. Change all names in the last table from `Hacker n` to the values in the `originalEmployeeData` list by accessing the `employeeList` variable.
    - The last table includes the names `John Smith`, `Phyllis Duncan`, `Alexandra Cummings`, `Ruth Martin`, `Charissa Kinney`, `Jared Noel`, `Mark Osborne`, `Andrew Johnson`, `Macy Masse`, and `David Mcdonald`.

6. Change the area that contains the words `Hackers to do not allow you to calculate the salaries anymore` to contain the HTML code from `index.html` beneath the `div` with `id=salariesInput`.
    - Under the `Calculate Net` button, there are five inputs and a `Sum salaries` button.
    - Clicking the `Sum salaries` button calls the `sumSalaries` function, which displays the sum of the values from the previous inputs.

## General requirements

None

## Hints

- Add lots of HTML code at once by modifying the `innerHtml` property.
- See all properties of a DOM object in the console by typing `console.dir(variableWhichContainsHtmlObject)`.

## Background materials

- <i class="far fa-exclamation"></i> [JavaScript Tutorial For Beginners videos](https://www.youtube.com/watch?v=qoSksQ4s_hg&list=PL4cUxeGkcC9i9Ae2D9Ee1RvylH38dKuET)
- <i class="far fa-book-open"></i> [Article on "How to get started with web development"](https://dev.to/fabcodingzest/how-to-get-started-with-web-development-front-end-part-1-5c6h)
- SoloLearn's [JS tutorial](https://www.sololearn.com/Play/JavaScript)
- [javascript.info](https://javascript.info/)
- If you see yourself more as a cat person, do not miss [JSForCats](http://jsforcats.com)
