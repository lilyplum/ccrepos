# package-manager-api
NOTE: Before you start this project you have to finish the Abandoned packages project.

As you previously experienced, Github (the current owner of NPM) started a project to increase the overall quality of the NPM system by eliminating the abandoned packages. You delivered a proof of concept for this project which was so promising that you’ve been selected for the following round: you have to create a prototype for a package manager web app.

What are you going to learn?
* Express.js as RestAPI web server
* GET/POST/PUT/DELETE http methods on the server side
* Node.js file handling basics (read and edit JSON files)

## Tasks

### Create the endpoints
Create the webserver's Rest API GET part. Need endpoints for the list of all packages, show details of each package by ID.

* When a GET request is sent to the endpoint /api/package, the response body is an array of all the package objects (in JSON format).
* When a GET request is sent to the endpoint api/package/1, the response body is the package object with the id 1 (and so on with the other IDs - in JSON format).

### Add new Package
Create the webserver's Rest API POST part. Accept POST request on the endpoint /api/package with a new package object. (Using the same object schema.) The ID should be a unique number which is set by the server and it should be the largest numbered ID in the array.

* When a POST request is sent to the api/package endpoint, it adds the requests body as a new object to the pkgs.json file's array on the server side.
* Even if the request contains an ID the server is ignoring it. The ID of the new object is the largest number in the array.
* When the POST request is successful the response's body is a text DONE.

### Update Package
Create the webserver's Rest API PUT part. Accept PUT request on the ID endpoint (eg.: /api/package/1) with the package changed details as object. (Using the same object schema.) Every time a PUT request is received the date of the request should be added to the package object's releases array with a new version number except the version number set manually for the current date. (If the latest one is 8.11.0 and the version number is unset then the new date should be 8.11.1)

* When a PUT request is sent to the ID endpoint (eg.: /api/package/1), the server finds the object with the ID in the pkgs.json file's array and updates the changed details on the server side.
* When the PUT request doesn't contain a new object (with the actual date) in the release array, a new object is added automatically to the package object's release array with the actual date and a new version number. The new version number is the latest version number's last number updated with 1.
* When the PUT request is successful the response's body is a text DONE.

### Delete Package
Create the webserver's Rest API DELETE part. Accept DELETE request on the ID endpoint (eg.: /api/package/1) and delete the package object from the pkgs.json file's array.

* When a DELETE request is sent to the ID endpoint (eg.: /api/package/1), the server finds the object with the ID in the pkgs.json file's array and deletes it.
* When the DELETE request is successful the response's body is a text DONE.

### General requirements
* The starter repo contains a pkgs.json file use the data from it.
* Only HOFs (filter, reduce, map) are used instead of for loops.

### Hints
* Use npm init to initialise the project and then npm install express to install express.js and it's dependencies
* For file reading, don't use the require() built-in function. Require is a synchronous function and is called only once, which means the calls receive a cached result. If the file is updated you can't re-read it using this method.
* Use Postman app to send the requests to your server

### Backkground materials
[ExpressJS routing](https://expressjs.com/en/starter/basic-routing.html)  
[ExpressJS params](https://expressjs.com/en/guide/routing.html#route-parameters)  
[ExpressJS serve static files](https://expressjs.com/en/starter/static-files.html)  
[Writing files with Node.js](https://nodejs.dev/en/learn/writing-files-with-nodejs/)  
[HTTP request methods](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods)  
[Using Postman](https://learning.postman.com/docs/introduction/overview/)