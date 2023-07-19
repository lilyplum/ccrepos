# Getting Started with Create React App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `npm run eject`

**Note: this is a one-way operation. Once you `eject`, you can't go back!**

If you aren't satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you're on your own.

You don't have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn't feel obligated to use this feature. However we understand that this tool wouldn't be useful if you couldn't customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: [https://facebook.github.io/create-react-app/docs/code-splitting](https://facebook.github.io/create-react-app/docs/code-splitting)

### Analyzing the Bundle Size

This section has moved here: [https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size](https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size)

### Making a Progressive Web App

This section has moved here: [https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app](https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app)

### Advanced Configuration

This section has moved here: [https://facebook.github.io/create-react-app/docs/advanced-configuration](https://facebook.github.io/create-react-app/docs/advanced-configuration)

### Deployment

This section has moved here: [https://facebook.github.io/create-react-app/docs/deployment](https://facebook.github.io/create-react-app/docs/deployment)

### `npm run build` fails to minify

This section has moved here: [https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify](https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify)

# Create React App
Did you know that using the create-react-app script creates a working website with content? How awesome! You don't need to set up the starting files, and the package.json manually. You also don't need to worry about missing something when starting work on your cool project. The flip side is that you need to understand what is generated and how it works. Let's take a look at the generated code and manipulate it.

What are you going to learn?
* Use the create-react-app script.
* Read and understand generated code.

## Tasks

### Create the project
Create the starting repository and make some changes to it. The only thing that needs to stay in the page is the React logo and a Welcome to React text.

* Running the npm start/yarn start script in the project repository displays a webpage with a logo and the Welcome to React text.

### Modify the project
Add a button next to the greeting text. The button text should change when the button is clicked.

* There is a button under the Welcome to React text with the text Click me!.
* Clicking the button for the first time changes the button text from Click me! to You clicked me!
* Clicking the button for the second time changes the button text to Stop clicking me!
* Clicking the button when the button text is Stop clicking me! results in no change.
* Not clicking the button for three seconds changes the button text to Click me!.

### Hints
* Start the project using the npx create-react-app <project name> command in the terminal.
* Before placing a component into the DOM by writing <your-component>, import the component into the file in which you want to use it.
* You can use native JavaScript besides JSX in a component.
* IMPORTANT: You should always put the node_modules folder in your .gitignore file.

### Backkground materials
[React Tutorial please make free account](https://scrimba.com/learn/learnreact)  
[JSX in a nutshell](https://legacy.reactjs.org/docs/jsx-in-depth.html)  
[Import keyword in javascript](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/import)  
[How to start with create-react-app](https://www.codecademy.com/article/how-to-create-a-react-app)  
[Handling events](https://react.dev/learn/responding-to-events)  
[Debugging a React Project](https://blog.logrocket.com/debug-react-apps-react-devtools/)