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


# Jest kidding
Testing is an important part of software development. It takes time to write tests but it speeds up the long term development.

Front-end Testing is testing the Graphical User Interface (GUI), functionality and usability of a website or an application. For Example: If there is an input for a surname in the frontend of an application, numbers should not be accepted. Another example would be checking the alignment of GUI elements.

With a JS framework like React or Vue.js, one of the best tool for testing is Jest. The jest package is as useful as the create-react-app script, as it already contains the latest packages from it. In this project, you will setup the environment for testing your front-end code.

In this project you will get a simple project. It displays some jokes, you can change the category that the jokes from, and you can get some random jokes. You need to write as many tests as you can.

What are you going to learn?
* Testing React projects

## Tasks

### First steps
Since Jest is not installing automatically the jsdom we need to install it.

* The latest version of jsdom is installed.1

### App components rendering
Create tests for every component render.

* There is a test that tests whether the page loads successfully
* Before each test the data is mocked, and the App component is rendered in a wrapper
* There is a test that tests whether the App component has an App class
* There is a test that tests whether there is a button for Random jokes
* There is a test that tests whether there is a Jokes component
* There is a test that tests whether there is a dropdown menu
* There is a test that tests whether the dropdown menu contains options fetched from axios2

### App components interaction
Create tests for every component interaction.

* Before each test the data is mocked, and the App component is rendered in a wrapper, and the url is set in a variable from the Jokes component
* There is a test that tests whether the button changes the url variable in the Jokes component
* There is a test that tests whether the dropdown menu value's changing changes the url variable in the Jokes component to the correct url3

### Jokes component tests
Create tests for the Jokes component.

* Before each test the data is mocked, and the Jokes component is rendered in a wrapper with a mock url
* There is a test that tests whether there is a div with a card-container class
* There is a test that tests whether there is same amount Joke component renders as fetched from the data

### Joke component tests
Create tests for the Joke component.

* Before each test the data is mocked
* There is a test that tests whether there is a div with a joke-card class
* There is a test that tests whether there are 2 spans, 1 with joke-id class, 1 with joke-joke class
* There is a test that tests whether the text in the Joke component shows the correct data5

### Hints
* It's very important to finish step 1 and install Jsdom before you start working on this project!
* With frontend testing, it's really important that the tests are made by the users perspective. When you create a unit test for your component, you need to aim what the users see and trigger that event that makes changes in a component. For example, you want to test that a counter works as it needs to. Think like a user and how you wanna use that counter as a user. You click a button that raises the counter number. So, you want to trigger the button click event and test whether the counter works well.
* When you make tests for functions, and then change the function's name, you need to rewrite all the tests that use this function.
* It's important to mock the data fetching. Mocking the data fetching means that you replace the data that we fetch with data you build up for tests. With a process like this you can test your frontend separately from other dependencies (e.g. a third-party api or a server side).

### Backkground materials
[Install Jsdom](https://www.npmjs.com/package/jsdom)  
[Jest overview](https://jestjs.io/docs/tutorial-react)  
[Testing Library](https://testing-library.com/docs/react-testing-library/intro/)  
[Testing react projects](https://legacy.reactjs.org/docs/testing-environments.html)  
[Mocking modules with jest](https://jestjs.io/docs/mock-functions#mocking-modules)  
[Mocking the data fetching with mirage.js](https://miragejs.com/quickstarts/react/test-a-component-with-react-testing-library/)
[Front-end testing](https://dev.to/christopherkade/introduction-to-front-end-unit-testing-510n)