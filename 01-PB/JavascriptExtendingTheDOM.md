# javascript-extending-the-dom

There are several valid ways of creating virtual elements and adding them to the DOM. We'll see some of these ways with
the same simple and a complex examples.

## Using createElement

The browsers' JavaScript API offers a way to create a virtual element that can be attached to the DOM.

### Welcome — example

Let's see the most simple way of creating a new HTMLElement and adding it to the end of the #container:

```javascript
// Create a new paragraph element
const p = document.createElement("p");

// Set it's content
p.textContent = 'Welcome!';

// Append it to the end of the document body
document.querySelector('#container').appendChild(p);
```

### Card element - example

Assume we need a structured card element, like this:

Bootstrap card example

We'll need the following structure:

```javascript
<div class="card">
    <img class="card-img-top" src="https://cdn-images-1.medium.com/max/653/1*wMZnVAEei1xbY1v6sAbYxQ.png">
        <div class="card-body">
            <h5 class="card-title">Card title</h5>
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's
                content.
            </p>
        </div>
</div>
```

To generate this structure, we can write the following:

```javascript
const createCard = function (title, text, image) {
    const container = document.createElement('div');
    container.classList.add('card');

    const topImage = document.createElement('img');
    topImage.classList.add('card-img-top');
    topImage.setAttribute('src', image);
    container.appendChild(topImage);

    const cardBody = document.createElement('div');
    cardBody.classList.add('card-body');

    const cardTitle = document.createElement('h5');
    cardTitle.classList.add('card-title');
    cardTitle.textContent = title;
    cardBody.appendChild(cardTitle);

    const cardText = document.createElement('p');
    cardText.classList.add('card-text');
    cardText.textContent = text;
    cardBody.appendChild(cardText);

    container.appendChild(cardBody);

    return container;
};

const cardElement = createCard(
    'Card title',
    'Some quick example text to build on the card title and make up the bulk of the card\'s content.',
    'https://cdn-images-1.medium.com/max/653/1*wMZnVAEei1xbY1v6sAbYxQ.png');
document.querySelector('#container').appendChild(cardElement);
```

### Fibonacci list — example

Now, create a `<ul>`, set it's class and add some list items to it, style them, attach event listener to them, then add it
to a specific place:

```javascript

const data = [1, 1, 2, 3, 5, 8, 13, 21];  // Fibonacci ❤
const list = document.createElement("ul");  // Create the container ul elements
list.classList.add('fibonacci-list');

for (let dataItem of data) {
    const listItem = document.createElement("li");
    listItem.classList.add(dataItem % 2 === 0 ? 'number-even' : 'number-odd');
    listItem.addEventListener('click', function () {
        this.classList.toggle('selected');
    });

    const listItemContent = document.createTextNode(dataItem.toString());

    listItem.appendChild(listItemContent);
    list.appendChild(listItem);
}

const container = document.querySelector('#fibonacci-container');
container.appendChild(list);
```

Pros:

* Easier to understand due to the declarative, step-by-step code.
* All the creation code can be in one place and on the same language.

Cons:

* You're writing JavaScript, but actually work with HTML. This might be confusing for more complex code.
* Hard to read the whole logic as it mixes element creation, adding attributes, attaching event handlers and many more
  logic.

## Generating the HTML string and using innerHTML

Instead of calling the appendChild method of Nodes, there is another way to define the HTML structure inside an Element:

### Welcome — example

```javascript
document.querySelector('#container').innerHTML = `<p>Welcome!</p>`;
```

This way we explicitly set the HTML inside the #container element.

### Card element - example

Structured card element with innerHTML, like this:

```javascript

const createCard = function (title, text, image) {
    return `
<div class="card">
<img class="card-img-top" src="${image}">
<div class="card-body">
<h5 class="card-title">${title}</h5>
<p class="card-text">${text}</p>
</div>
</div>`;
};

const cardElementHTML = createCard(
    'Card title',
    'Some quick example text to build on the card title and make up the bulk of the card\'s content.',
    'https://cdn-images-1.medium.com/max/653/1*wMZnVAEei1xbY1v6sAbYxQ.png');

document.querySelector('#container').innerHTML = cardElementHTML;
```

### Fibonacci list — example

```javascript

const data = [1, 1, 2, 3, 5, 8, 13, 21];  // Fibonacci ❤
let listItems = '';

for (let dataItem of data) {
    const itemClass = dataItem % 2 === 0 ? 'number-even' : 'number-odd';
    listItems += `<li class="${itemClass}">${dataItem}</li>`;
}

const container = document.querySelector('#fibonacci-container');
container.innerHTML = `<ul class="fibonacci-list">${listItems}</ul>`;

const listItemElements = document.querySelectorAll('.fibonacci-list li');
for (let listItem of listItemElements) {
    listItem.addEventListener('click', function () {
        this.classList.toggle('selected');
    });
}
```

Let's see exactly the same logic using higher order functions and shortening the code:

```javascript

const data = [1, 1, 2, 3, 5, 8, 13, 21];  // Fibonacci ❤

document.querySelector('#fibonacci-container').innerHTML = `
<ul class="fibonacci-list">
${data.map(item =>
    `<li class="number-${item % 2 === 0 ? 'even' : 'odd'}">${item}</li>`
).join('')}
</ul>
`;

document.querySelectorAll('.fibonacci-list li').forEach(listItem =>
    listItem.addEventListener('click', function () {
        this.classList.toggle('selected');
    })
);
```

### Do you need a video tutorial?

We recommend the 40 minutes long JavaScript Template Literals: JSON to HTML tutorial, if you need more info.

### Problem with innerHTML

Look at this code:

```javascript

document.body.innerHTML += '<br>';
```

This is just adding an extra `<br>` to the end of the DOM, right? What could go wrong?

Modifying innerHTML (+=) causes the content to be re-parsed and DOM nodes to be recreated, losing the handlers you have
attached. So the whole DOM gets destroyed and re-created.

Appending elements as in the appendChild example doesn't cause that behavior, so no re-parsing has to occur, since you
are modify the DOM tree explicitly.

Another good way to handle this is to use insertAdjacentHTML(). For example:

```javascript

document.body.insertAdjacentHTML('beforeend', '<br>')
```

## Using the `<template>` tag

It is possible to create an invisible template in your DOM and reuse is as a blueprint with custom information. This is
mostly useful when the structure is more complex, like in the previous Card example. Here is a revised version:

```javascript

<template id="card-template">
    <div class="card">
        <img class="card-img-top" src="">
            <div class="card-body">
                <h5 class="card-title"></h5>
                <p class="card-text"></p>
            </div>
    </div>
</template>
```

```javascript

const createCard = function (title, text, image) {
    const template = document.querySelector('#card-template');
    const clone = document.importNode(template.content, true);

    clone.querySelector('.card-img-top').setAttribute('src', image);
    clone.querySelector('.card-title').textContent = title;
    clone.querySelector('.card-text').textContent = text;

    return clone;
};

const cardElement = createCard(
    'Card title',
    'Some quick example text to build on the card title and make up the bulk of the card\'s content.',
    'https://cdn-images-1.medium.com/max/653/1*wMZnVAEei1xbY1v6sAbYxQ.png');
document.querySelector('#container').appendChild(cardElement);
```

As there is no nice way of looping this way, the Fibonacci example is not useful to implement this way.

## Using a front-end templating engine

You probably already met with some templating engine, like Jinja2, Markdown or Thymeleaf. There are some engines
available on the front-end too, we'll see an example of using Handlebars.

This example is similar to using the `<template>` tag, with the difference of usage of string interpolation inside the
template.

### Card element - example

```javascript

<!-- Include Handlebars js file before your script -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.0.12/handlebars.min.js"></script>
```

```javascript

<script id="card-template" type="text/x-handlebars-template">
    <div class="card">
        <img class="card-img-top" src="{{image}}">
            <div class="card-body">
                <h5 class="card-title">{{title}}</h5>
                <p class="card-text">{{text}}</p>
            </div>
    </div>
</script>
```

```javascript

const createCard = function (title, text, image) {
    const source = document.getElementById("card-template").innerHTML;
    const templateRenderer = Handlebars.compile(source);

    return templateRenderer({
        image: image,
        title: title,
        text: text,
    })
};

const cardElement = createCard(
    'Card title',
    'Some quick example text to build on the card title and make up the bulk of the card\'s content.',
    'https://cdn-images-1.medium.com/max/653/1*wMZnVAEei1xbY1v6sAbYxQ.png');
document.querySelector('#container').appendChild(cardElement);
```

!> If you also use a server side template engine, like Jinja2, you'll need to define the template inside some rules that
disables the double curly braces interpolation. In Jinja 2 it's the {{ raw }} and {{ endraw }} commands.

### Fibonacci list — example

```javascript

<!-- Include Handlebars js file before your script -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.0.12/handlebars.min.js"></script>
```

```javascript

<script id="fibonacci-template" type="text/x-handlebars-template">
    <ul class="fibonacci-list">
        {{#each items}}
        <li class="number-{{this % 2 === 0 ? 'even': 'odd'}}">{{this}}</li>
        {{/each}}
            </div>
            </script>
```

```javascript

const data = [1, 1, 2, 3, 5, 8, 13, 21];  // Fibonacci ❤

document.querySelector('#fibonacci-container').innerHTML = `
<ul class="fibonacci-list">
${data.map(item =>
    `<li class="number-${item % 2 === 0 ? 'even' : 'odd'}">${item}</li>`
).join('')}
</ul>
`;

document.querySelectorAll('.fibonacci-list li').forEach(listItem =>
    listItem.addEventListener('click', function () {
        this.classList.toggle('selected');
    })
);
```