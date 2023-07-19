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

# Route around the page
There is no website where you find all the information in a single webpage. You want to separate your pages from each other to help your users find what they are looking for in your site.

That's why you decided to try React routing. In this project, you will create a blueprint for the layout of a website with three pages, a header, and a footer. With this, you can create a group of components that you can reuse later.

What are you going to learn?
* Understand React.
* Use React routing.
* Create reusable components.

## Tasks

### Landing
Create a landing page that the user encounters first when they reach the website. The page is built using a layout that serves as the base for all the subpages. The layout contains the header and footer. The header is the navigation tool. It must contains all links for the web application (home, about, and contact). The footer must contain the information that the page is an example project. The page content does not need to be more than a title that describes the page.

* Starting the application with the npm start command displays a landing page with a header and footer opening.
* The / route redirects to a page with a title saying This is the home page in the content section of the page.
* The header contains a link to the / route, titled Home; a link to the /about route, titled About, and a link to the /contacts route, titled Contacts.
* The footer contains the phrase This is an example project for practicing React routing.

### About page
Create an About page. Build the page using the same layout as the landing page. The page must contain the same header and the same footer as the landing page. There must be a title on the page.

* The /about route redirects to a page with the same header and footer as the landing page.
* The page contains the title This is the about page.2

### Contacts page
Create a Contacts page. Build the page using the same layout as the landing page. The page must contain the same header and the same footer as the landing page. There must be a title on the page.

* The /contacts redirects to a page with the same header and footer as the landing page.
* The page contains a title This is the contacts page3

### General requirements
* The react-router package is used for routing. For more information, see the Background materials section.

### Hints
* Start the project by creating a new React app using the npx create-react-app <the-application-name> command.
* Use the react-router package for the routing. For more information, see the Background materials.
* Use the App for building the routing up and creating different components for all the pages.
* Create a Layout component for building the basic layout of your pages. You can place the header and footer components in this component, then use the children property to build your pages easily, with a common layout.

### Backkground materials
[React router](https://reactrouter.com/en/main)  
[How React Router works](https://medium.com/@marcellamaki/a-brief-overview-of-react-router-and-client-side-routing-70eb420e8cde)  
[Understanding react routing](https://medium.com/the-andela-way/understanding-the-fundamentals-of-routing-in-react-b29f806b157e)  
