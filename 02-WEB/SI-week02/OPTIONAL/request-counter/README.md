No starter code is provided. Start from scratch!

# Request counter

This assignment is a list of exercises for practicing Express. You can find multiple features which you can use
separately after the Preparation part. Do not forget to commit after you completed a part.

What are you going to learn?

* Send HTTP requests with GET, POST, PUT and DELETE method.
* Use global variables with Express and display their value on a page.
* Write different behaviors for different HTTP methods on the same endpoint.

## Tasks

### Initialize a Express project

Initialize an empty Express project with a .gitignore file.

* A package.json with Express as one of the requirements is created.
* A views folder is created for your HTML template files.
* A server.js is created, in which you can handle incoming HTTP requests.
* A .gitignore file is created to ignore unnecessary Express, or Javascript files.

### Create the main page

Create a / route for the main page from which users can reach the features of the Request counter.

* The page has a GET-Request link that sends a GET request to the /request-counter route
* The page has a POST-Request button (in a form) that sends a POST request to the /request-counter route
* The page has a Statistics link that navigates to the /statistics route

### Create the Request counter route

Create a /request-counter route that can count incoming HTTP requests.

* The numbers of requests are stored for each HTTP method (GET, POST, DELETE, PUT) in separate global variables.
* After increasing the count this route redirects to main page.

### Create the Statistics page

Create a /statistics route which can show the count results.

* The page has a link which leads back to to home page.
* The page has a table which contains 4 rows (one for each HTTP method) and two columns (one for the method name and one
  for the request count).

### Save counts

Store the request count data in a text file instead of global variable.

* A text file named request_counts.txt is created.
* The request_counts.txt's content is the following. GET: 5 POST: 3 DELETE: 1 PUT: 0

### General requirements

* You can send PUT and DELETE requests with Curl. This way you can try your request counter with all HTTP methods to
  make sure it works.
* You might want to use .ejs files instead of plain .html to be able to pass values to view
* You can consider saving the data to JSON instead of a text file as this is most popular notation for JavaScript

### Hints

### Background materials

[What is express?](https://www.youtube.com/watch?v=pyKOM1whPfM&ab_channel=CodeWithRajRanjan)  
[Express Documentation](https://expressjs.com/)  
[Install Curl](https://howtoinstall.co/package/curl)  
[Example to test DELETE/PUT request](https://www.garron.me/en/bits/curl-delete-request.html)  
[Ports](/02-WEB/Ports.md)  
