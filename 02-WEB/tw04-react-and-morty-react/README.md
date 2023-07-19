This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `yarn start`

Runs the app in the development mode.<br />
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.<br />
You will also see any lint errors in the console.

### `yarn test`

Launches the test runner in the interactive watch mode.<br />
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `yarn build`

Builds the app for production to the `build` folder.<br />
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.<br />
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `yarn eject`

**Note: this is a one-way operation. Once you `eject`, you can’t go back!**

If you aren’t satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you’re on your own.

You don’t have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn’t feel obligated to use this feature. However we understand that this tool wouldn’t be useful if you couldn’t customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: https://facebook.github.io/create-react-app/docs/code-splitting

### Analyzing the Bundle Size

This section has moved here: https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size

### Making a Progressive Web App

This section has moved here: https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app

### Advanced Configuration

This section has moved here: https://facebook.github.io/create-react-app/docs/advanced-configuration

### Deployment

This section has moved here: https://facebook.github.io/create-react-app/docs/deployment

### `yarn build` fails to minify

This section has moved here: https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify

# React and Morty
Do you know Rick and Morty? If not, start watching it!

Anyways, the Rick and Morty universe is kinda big with lot of characters and locations. You with your friends decided that you want to make it easier to look up information about each characters and locations. You want to create a React app that with the use of an open-source API, shows information about everything you need. Your friend built the tools for the data fetching, you just need to use the data and build the app.

What are you going to learn?
* Using react custom hooks
* Using paginated data

## Tasks

### Layout
Start with the landing page. When someone enters the web site, they will see a big Rick and Morty logo with 2 buttons under it. The buttons will be the trigger to show the characters or the locations but as default a short description about the page is shown under the buttons.

* When the page opens up, we see a Rick and Morty logo
* Under the logo there are two button, one for Characters and one for Locations
* Until one of the buttons are clicked, there is a description describing the website functionality


### Characters
Create a component where the characters are listed. Since the data is paginated, make it possible to jump between the pages.

* If we click on the Characters button, a list of characters shows up
* The list contains character cards, one card shows the given character image, name and species
* At the end of the list there is a pagination bar where we can switch between pagination pages


### Locations
Create a component where the locations are listed. Since the data is paginated, make it possible to jump between the pages.

* If we click on the Locations button, a list of locations shows up
* The list contains location cards, one card shows the given planet name and type
* At the end of the list there is a pagination bar where we can switch between pagination pages


### Character Display
Create a single character component that shows more specific information about a character. When someone click on a character in the pagination list the component shows up.

* When we click on a character in the list, more infomration shows up from the character


### Location Display
Create a single location component that shows more specific information about a location. When someone click on a character in the pagination list the component shows up.

* When we click on a location in the list, more infomration shows up from the location


### Test cases
Create tests for every cases where the user can interact with the application. Check that the interface works properly when you click on the character and location card.

* There are test-cases that check whether the page loads successfuly
* There are test-cases that check whether more information shows up from the character, when we click on a character in the list
* There are test-cases that check whether more infomration shows up from the location, when we click on a location in the list
* All the tests pass


### OPTIONAL TASK: Show more by scrolling
It is easier to jump between pagination pages by just scrolling down. When the user scrolls down to the bottom of the list of characters/locations, the next list of characters/locations shows up at the bottom of the list and the user can continue to scroll down.

* When a list of characters/locations shows up and we scoll down to the bottom of the list, new characters/locations show up at the bottom of the list


### Hints
* Before you start the project, type npm install/yarn install in the terminal. That will create the node_modules folder for you.
* When you start the project, take a look at the console. The starter code log out the objects that you will get and how you can get the data.
* You don't need to understand what is going on in the given custom hooks, they are just aid you to have data that you can work with.
* If you want to get characters to present, use the useCharacters from api/useData.js. The requested data is too big to get in one JSON therefore a pagination list is returned. A pagination list has more pages with different objects. In this case one page contains 20 characters from page no. 1. If you want to get more characters from other pages, you just need to change the parameter of the useCharacters hook to the page number you want to get.
* The JSON you will get has 2 property: info that contains information about the pagination you requested and results that contains the characters from the pagination. It is true to the useLocations hook also. If you want to see an example of the JSON you get, you can find the documentation of the webpage you get the data from. YOU DON'T NEED TO CARE ABOUT THE API! Everything you need from the API is already writen. Just use the custom hooks from the useData.js file.

### Backkground materials
[Custom hooks](https://react.dev/learn/reusing-logic-with-custom-hooks)  
[What is JSON?](https://en.wikipedia.org/wiki/JSON)  
[What is pagination for?](https://www.interaction-design.org/literature/article/split-the-contents-of-a-website-with-the-pagination-design-pattern)  
[Characters JSON example](https://rickandmortyapi.com/documentation/#character)  
[Locations JSON example](https://rickandmortyapi.com/documentation/#location)  
[Jest](https://jestjs.io/docs/tutorial-react)  
[Mocking modules with jest](https://jestjs.io/docs/mock-functions#mocking-modules)
[Mocking the data fetching with a module](https://www.npmjs.com/package/axios-mock-adapter)