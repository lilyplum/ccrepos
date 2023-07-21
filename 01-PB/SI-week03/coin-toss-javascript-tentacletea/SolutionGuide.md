# Step-by-step guide for the Coin-Toss project in JavaScript

## 1. Add the JS

The project can be viewed by opening the index.html file in a web browser. The browser reads the html code from this
file and presents 2 images of a coin along with the text Coin Flip. We want to also add some js code for the browser to
run. In order to do this we open the index.html file in a text editor and add the following code in the text editor
anywhere inside the head section of the document.

```html

<script src="coin-toss.js" defer></script>
```

The end result of the index.html should look something like this:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Coin Toss</title>
    <link rel="stylesheet" href="coin-toss.css">
    <script src="coin-toss.js" defer></script>
</head>
<body>
<div class="container">
    <p>Coin Flip</p>
    <img src="coin-tails.png">
    <img src="coin-heads.png">
</div>
</body>
</html>
```

We now instructed the browser to also execute the js inside the file coin-toss.js. Most probably the file is not
existent in your project so let's create it. A good practice when adding js code to a html file is to write a small
console.log('hello world') inside the js and than open the index.html in a web browser, followed by opening the
developer tools console and verify in the console tab the text hello world is present. If it is not present the most
common errors are that you either wrote a different file name compared to the on the script tag in the html file OR you
haven't created the js file in the same directory where the index.html file is stored.

## 2. Create a variable to store the `<p>` tag

When running js code in the browser we can create variables that store html elements. Let's store the <p> tag in a
variable and then display it. To do this we will write the following code in the js file

```javascript
const message = document.getElementById('message');
console.log(message);
```

Now when we open the index.html file and inspect the developer tools => console tab we should see printed the `<p>` tag.
Unfortunatelly this will not happen and most probably you will only see in the developer console the message null (we
were expecting to see the <p> message). The reason this is happening is because of the location we placed
the `<script src="coin-toss.js"></script>` inside the index.html file. It is in the <head> section of the file and because
of this js can only access html elements that have been written before it. The solution is to add
the `<script src="coin-toss.js"></script>` after the `<p id="message">Coin Flip</p>` in the index.html. After we do this,
the index.html should look like this:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Coin Toss</title>
    <link rel="stylesheet" href="coin-toss.css">
</head>
<body>
<div class="container">
    <p id="message">Coin Flip</p>
    <script src="coin-toss.js"></script>
    <img src="coin-tails.png">
    <img src="coin-heads.png">
</div>
</body>
</html>
```

Now, when we open the index.html file in a web browser and inspect the developer tool => console tab we should see
something like this (this is how it is displayed in the chrome browser, in other browsers it might look different)

```html
<p id="message">Coin Flip</p>
```

There is a slight problem still, if we want to store in a variable the <img> tag we need again to remember to move the
script tag further down in the index.html file. So why not move it at the end of the file ? While we could do this and
it would work it is not the best practice in the industry. So then what is the best practice ? It is to place
any `<script>` tag (and `<link>` also) in the <head> section of the html file. In order to also be able to store html
elements in js the defer keyword was created for the `<script>` tag. It has the following functionality: it does not
matter where the `<script>` tag has been placed, when the browser reads the html code it will remember to place it at the
very end of the file. Our best practice aligned code inside the html file should look like this AND still display the
message `<p id="message">Coin Flip</p>` inside the the developer tools console window.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Coin Toss</title>
    <link rel="stylesheet" href="coin-toss.css">
    <script src="coin-toss.js" defer></script>
</head>
<body>
<div class="container">
    <p id="message">Coin Flip</p>
    <img src="coin-tails.png">
    <img src="coin-heads.png">
</div>
</body>
</html>
```

## 3. Create variables to store the 2 img tags

Let's also create variables to store the 2 img tags. In order to store in a variable an html element we use the
document.getElementById('message') function. Let's unpack how it works. document - contains the whole index.html code (
and lot's of other things which is beyond the scope of this tutorial). .getElementById('message') - by adding this
suffix to the document keyword we are telling js to retrieve an html element that has the id with the value message.
Now, if we want to store the `<img>` elements in 2 variables we need to add an unique id attribute to each of the images.
Let's go back to the index.html code and add the id attributes. In the end, the index.html code should look like this:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Coin Toss</title>
    <link rel="stylesheet" href="coin-toss.css">
    <script src="coin-toss.js" defer></script>
</head>
<body>
<div class="container">
    <p id="message">Coin Flip</p>
    <img id="tails" src="coin-tails.png">
    <img id="heads" src="coin-heads.png">
</div>
</body>
</html>
```

Now that we have a way unique ids for the `<img>` tags we can write the code to store & print in the console the img
elements. In the end the coin-toss.js should be something like this

```javascript
const message = document.getElementById('message');
console.log(message);
const heads = document.getElementById('heads');
console.log(heads);
const tails = document.getElementById('tails');
console.log(tails);
```

When we open the index.html file in a browser and inspect the developer tools console window we should see the text (
this text might differ based on what browser you are using)

```html
<p id="message">Coin Flip</p>
<img id="heads" src="coin-heads.png">
<img id="tails" src="coin-tails.png">
```

## 4. Randomly pick a coin

The next step is to write the js to randomly select heads or tails each time we open the index.html file. To do this,
we will store in a variable a random value that is either 1 or 0. Than based on the variable's content we will either
print in the console You have selected tails ! or You have selected heads. Our js code should look something like
this in the end

```javascript
const message = document.getElementById('message');
console.log(message);
const heads = document.getElementById('heads');
console.log(heads);
const tails = document.getElementById('tails');
console.log(tails);

const randomNumber = Math.floor(Math.random() * 2);
if (randomNumber === 0) {
    console.log('You have selected tails !');
} else {
    console.log('You have selected heads');
}
```

Now when we open the index.html file in a web browser we will besides the html elements the text You have selected
tails ! or You have selected heads (refresh by pressing F5 multiple times to ensure both messages are displayed).

## 5. Change the text of the `<p>` tag to diplay the chosen coin side

If we have variables that contain html elements it means we can change their content and those changes will be
obseved in the web browser. Let's change the text of the <p> tag to display either You have selected heads or You
have selected tails. The process is similar to the way you have used other variables. For example the following code
display the length of a list.

```javascript
const a = [1, 2, 3];
console.log(a.length);
```

Adding the .length suffix to the variable a shows the arrays length. Of course, when the variable a contains a number,
this would not work.

```javascript
const a = 1;
console.log(a.length); // would prind an error
```

So, if we have the variable message that contains an html element by adding the suffix innerText we can change the text
of the paragraph. We do this by writing:

```javascript
message.innerText = 'You have selected tails';
```

This "means" for the js code: in the variable message there is an html element, it has a lot of "abilities", we want to
focus on its ability to contain text so we add .innerText. The = 'You have selected tails' states: I don't know what
your previous text was, I want to add this new text. Our final js final code should look something like this.

```javascript
const message = document.getElementById('message');
console.log(message);
const heads = document.getElementById('heads');
console.log(heads);
const tails = document.getElementById('tails');
console.log(tails);

const randomNumber = Math.floor(Math.random() * 2);
if (randomNumber === 0) {
    console.log('You have selected tails !');
    message.innerText = 'You have selected tails !';
} else {
    console.log('You have selected heads !');
    message.innerText = 'You have selected heads !';
}
```

## 7. Based on the randomly chosen coin side either show the heads or tails image

The final step is to show the image with tails when the value of the variable randomNumber is 0 or the image heads
when the value of the variable randomNumber is 1. The way we will do this is by initially hiding both images via css.
To do this we will add a new class in the coin-toss.css file. The final css file should look something like this:

```css
.container {
    display: flex;
    width: 300px;
    margin: 0 auto;
    height: 100vh;
    justify-content: center;
    flex-direction: column;
    text-align: center;
}

img {
    width: 300px;
    height: 300px;
}

.hide {
    display: none;
}
```

Next we add those classes to the index.html file. The final index.html should look like this:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Coin Toss</title>
    <link rel="stylesheet" href="coin-toss.css">
    <script src="coin-toss.js" defer></script>
</head>
<body>
<div class="container">
    <p id="message">Coin Flip</p>
    <img id="tails" class="hide" src="coin-tails.png">
    <img id="heads" class="hide" src="coin-heads.png">
</div>
</body>
</html>
```

Now, when we open the index.html in a browser we should only see the paragraph You have chosen heads or You have chosen
tails (based on what random number was chosen). The final step is to add js code to remove the class hide from the image
element that was chosen. To do this we will use the suffix .classList.remove('hide') meaning: from the stored html
element in the variable access all the classes (.classList) and from those classes remove the class named hide (
.remove('hide')). Notice that we have used 2 suffixes here: .classList and .remove('hide'), it is very important to note
that we can use the suffix .remove('hide') only after the suffix .classList. Our final js code should look like this:

```javascript
const heads = document.getElementById('heads');
const tails = document.getElementById('tails');
const message = document.getElementById('message');

const randomNumber = Math.floor(Math.random() * 2);

if (randomNumber === 0) {
    tails.classList.remove('hide');
    message.innerText = 'The gods of luck chose tails!';
} else {
    heads.classList.remove('hide');
    message.innerText = 'The gods of luck chose heads!';
}
```

And voila, our app is now working :)