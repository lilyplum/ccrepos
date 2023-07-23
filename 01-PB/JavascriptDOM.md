# javascript-dom

When you use javascript in the browser then you usually want to change your website dynamically. It can be the
difference between a site which gets successful and one which nobody uses. Below you can read about the ways to do it.

## What is DOM

http://htmldog.com/guides/javascript/intermediate/thedom/

If you have read the page above then you can select elements (DOM elements aka HTML nodes) from the page from your
javascript code. But how to manipulate them?

These are the main types of manipulation:

* Changing content of an element
* Managing attributes of an element
* Adding new element
* Removing element

Let's see how to do that!

## Changing content of an element

First of all you always need the element you would like to change. As you saw above you can query one or multiple
elements from the page.

If you selected one element then you can use specific functions/properties of it. To change the content you can change
the innerHTML or textContent property:

```javascript
const header = document.getElementById('header');
const newHeaderText = 'New text to show <strong>inside</strong> the element.';

header.innerHTML = newHeaderText;  // New text to show <strong>inside</strong> the element.
// or
header.textContent = newHeaderText;  // New text to show &lt;strong&gt;inside&lt;/strong&gt; the element.
```

?> You might find the innerText property too, which looks like a more clever textContent. Sorry to disappoint you, but
innerText is not standard, we recommend to avoid it!

If you selected multiple ones then you have to iterate through them first. Easiest structure for this (similar to python
for .. in ..) is the for .. of .. loop:

```javascript
const elements = document.querySelectorAll('.btn');
for (let element of elements) {
    element.innerHTML = 'New text to show inside an elements which has class "btn"';
}
```

When you select elements, then you can search on the whole page calling functions (like getElementById) on the document
global object or you can search inside an element, for example:

```javascript
let header = document.getElementById('header');
let buttonsInsideHeader = header.querySelectorAll('.btn');
```

## Adding new element

There are several ways to extend the DOM.

You can read about them on the JavaScript - [Extending the DOM page](JavascriptExtendingTheDOM.md).

## Removing element

What you need is the remove function.

```javascript
let header = document.getElementById('header');
header.remove();
```

## Changing attribute of element

You can use the [setAttribute](https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute) function to change an attribute. For example:

```javascript
let header = document.getElementById('header');
header.setAttribute('id', 'coolHeader');
```

There are special attributes:

1. Class can have multiple values separated with space. To change it you should use the contains, add, remove, replace
   or toggle function of the classList property. For example: header.classList.add('new-class'); - [details](https://developer.mozilla.org/en-US/docs/Web/API/Element/classList)
2. Data attributes are attributes which start with data-. Usually we use them from javascript and so they have a
   separate property dataset - [details](https://developer.mozilla.org/en-US/docs/Learn/HTML/Howto/Use_data_attributes)

## You can be sure you understood this page if:

* What does DOM stand for?
* How to select elements from the DOM with javascript?
* How to change the DOM (= DOM manipulation) with javascript?
* How to check if an element has a class?
* How to change one class on an element to another class?
* How to use a previously set "data-" attribute?

## You can test your knowledge by:

1. Creating a page where you have an element with a special id and other elements which have the same class.
2. Write selectors to query elements from the page by id or class
3. Write some functions to manipulate these elements (change, add, remove)