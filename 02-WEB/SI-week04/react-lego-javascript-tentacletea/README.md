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

# React Lego
You've always wondered how awesome would it be to work as an influencer.

But it's not that easy as you think. You need to know all the trends and you need to follow which platforms are the most popular according to your followers.

You are a frontend free-lancer who got an offer from an influencer who wants a website where he can see all the information that he needs to know about the platforms he uses.

You asked your friend to make the backend part of the job and you undertook the frontend part. You got a sample JSON format from your friend about the objects that you need to present in the page.

What are you going to learn?
* Creating reusable React components
* Conditional rendering
* Passing data between components
## Tasks

### Extract Header in different component
Extract the code which displays Social Media Dashboard and Total followers: 33 in a different component.

* In the App.js file the html tag <div className="header"> is replaced by a react component with the name `<Header>`
* In the App.js file the <Header> component has a parameter with the name users which receives all the users
* The Header component shows the sum of all the followers belonging to all the users (30294 when you open the page for the first time)

### Extract the card displaying user information in a different component
Extract the `<section className="platform">` in a different component

* In the App.js file the html tag `<section className="platform">` is replaced by a react component with the name <Card>
* In the App.js file the <Card> component has a parameter with the name user which receives a user object and a parameter with the name icon which receives the value from data.icon

### Display all users
Display all the users from the data variable in a separate card

* When loading the page for the first time 4 cards are displayed
* For the users which have more then 9999 followers the last 3 digits are replaced with k (the 3rd card displays 11k followers)
* When the difference property of a user is negative only the ▼ is displayed and the difference value is displayed without the minus sign (▼ 144 for the 4th card)
* When the difference property of a user is positive only the ▲ is displayed and the difference (▲ 12 for the 1st card)
* When the difference property of a user is positive the 3rd row inside the card is of green color
* When the difference property of a user is negative the 3rd row inside the card is of red color

### Increase / Decrease the followers for a user
Implement the event handlers for the buttons with + and - label to increase/decrease the total followers

* When clicking the button with the label + from the 1st card the displayed followers changes from 9999 to 10k
* When clicking the button with the label - from the 2nd card the displayed followers changes from 1044 to 1043
* When clicking the button with the label + from the 3rd card the Total followers: from the Header component changes from 30294 to 30295

### Add new card
Implement the code inside the AddNewCard component so that when a user presses the Create New Card button a new card is added

* When the user types megatron in the first input, 2 in the second input, -1 in the third input and presses the button with the label Create New Card a 5th card is added and the Total followers: inside the Header component increases from 30294 to 30296
* After a new card is created the values from input boxes are cleared
* If the 2nd or 3rd input content is not a number or the 1st input is empty when pressing the Add New Card button a new card is NOT added but the values from the inputs are still cleared

### Hints
* once you start the project you first need to install the react library with npm install
* once all the react libraries are installed, you can start the project with npm start

### Backkground materials
[Functional Components](https://www.robinwieruch.de/react-function-component/#react-stateless-function-component)  
[React Conditional Rendering](https://legacy.reactjs.org/docs/conditional-rendering.html)  
[Introduction to JSX](https://legacy.reactjs.org/docs/introducing-jsx.html)  
[Display lists in React](https://daveceddia.com/display-a-list-in-react/)  
[Use the key prop on lists in React](https://egghead.io/lessons/react-use-the-key-prop-when-rendering-a-list-with-react-b31bfa42)  
[Update an array state in React](https://javascript.plainenglish.io/how-to-add-to-an-array-in-react-state-3d08ddb2e1dc)  
[Debugging a React project](https://blog.logrocket.com/debug-react-apps-react-devtools/)