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

# Are you hooked ?
ACME corporation wants to transition from pen and paper for keeping track of it's employees data and go digital. Currently a lot of mockups are being produced by the product team and they asked you to add some logic to manipulate the sample data so that the mockups are more realistic for the demo.

What are you going to learn?
* react state hooks
* updating arrays through state hooks

## Tasks

### Filter by name
When you type letters in the name header of the table the rows are filtered to show the ones which have in the their name those characters

Typing Tiger in the name column only displays the row with the name Tiger Nixon

The filter is case insensitive so typing tiger in the name column only displays the row with the name Tiger Nixon

### Increase / Decrease Salary
Pressing the + or - button in each row increases or decreases the salary value by 100 for that specific row only

Pressing the + button in the row with the name Tiger Nixon only increases the salary in that row

Pressing the - button in the row with the name Tiger Nixon only decreases the salary in that row

After decreasing the salary for Tiger Nixon and filtering the table for Tiger Nixon the salary remains changed (does not reset to initial value)

After filtering the table for Tiger Nixon, increasing his salary does not reset the filtered rows

After filtering the table for Tiger Nixon, changing his salary and then removing the filter the salary of Tiger Nixon remains changed



### Matching passwords
When the user enters text in the Enter your password and Verify your password text boxes a message is displayed if the content is not matching

Typing 1234 in the input box Enter your password and 1234 in the input box Verify your password shows the message Access granted

Typing 12 in the input box Enter your password and 1234 in the input box Verify your password shows the message Passwords do not match
### (optional) Password complexity
The entered password must be at least characters long, contain any of the symbols !@#$%^&*, contain a number, a lower case letter and a upper case letter

Typing pass in the input box Enter your password shows the message Password must: be at least 8 characters long & contain a capital letter & contain a number & contain a special symbol

Typing pass1 in the input box Enter your password shows the message Password must: be at least 8 characters long & contain a capital letter & contain a special symbol

Typing pass1A in the input box Enter your password shows the message Password must: be at least 8 characters long & contain a special symbol

Typing pass1A! in the input box Enter your password shows the message Password must: be at least 8 characters long

Typing pass1A!123 in the input box Enter your password shows the message Good choice of password!

Typing `` in the input box Enter your password does not show any message

### Hints
* once you start the project you first need to install the react library with npm install
* once all the react libraries are installed, you can start the project with npm start
* when updating an array through a react hook it is necessary to give as parameter for the setter a new array instead of the current array with a modified object (more info in background materials)

### Backkground materials
[How React hooks work workshop video]()  
[Use State Hook](https://legacy.reactjs.org/docs/hooks-state.html)  
[Upgrading arrays in hooks](https://javascript.plainenglish.io/how-to-add-to-an-array-in-react-state-3d08ddb2e1dc)  
[Debugging a React project](https://blog.logrocket.com/debug-react-apps-react-devtools/)  
[JS String functions](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String)  
