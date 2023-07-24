# abandoned-packages
NPM (npmjs.com) Creating a package for Node.js is almost as easy as installing one but maintaining it could be difficult. When a new Node.js version is changing or deprecating built-in methods the packages relied on them have to be updated. Also there are popular packages that just change or remove their methods for other reasons (cleaner code, better performance etc.). Not to mention the packages relied on those updatable/updated packages and so on. A dependency's dependency's dependency… Not too easy to follow, right? Unfortunately, a lot of developers abandon their package projects and whole package dependency chains could fall just like dominoes. In 2020 GitHub acquired the company behind NPM and in 2022 they decided to create a new rule set for the packages. They invited a lot of fresh minded junior developers to create a prototype for a new packaging system and you are one of them. The very first step for this project is to create an API (JSON) server which could list the abandoned and the maintained packages as well.  

What are you going to learn?  
* Create a simple RestAPI webserver with Node.js  
* Serverside routing  
* Working with files in Node.js

## Tasks

### Create Webserver 
Create a webserver using Node.js where the root endpoint (/) shows the latest version of the NPM (from the pkgs.json file).

* When we launch the server, the root endpoint (/) returns an HTML (index.html file) with a `<h1>` tag which contains the text NPM Package Maintenance Portal and a `<h2>` which contains the latest version's date of the NPM.
### List all packages
We need an endpoint to show all the packages.

* When a GET request is sent to the endpoint /api/package, it responds with an array of package objects (in JSON format).

### Packages by Status
We need an endpoint for the different statuses which are set by date. If the date of the dependencies' latest version is newer than the latest version date of the package, it is considered abandoned otherwise the package is considered maintained.

* When a GET request is sent to the endpoint api/status/maintained, it returns an array with all the package objects which date newer than their dependencies' latest version's date (in JSON format).
* When a GET request is sent to the endpoint api/status/abandoned, it returns an array with all the package objects which date older than their dependencies' latest version's date (in JSON format).
* The package named npm doesn't appear on the abandoned nor on the maintained endpoints.
### General requirements
Just the built-in Node.js packages used in the project. No other packages installed.

### Hints
* The NPM version is in the pkgs.json file as well you have to use this file as the source of the data
* For file reading, don't use the require() built-in function. Require is a synchronous function and is called only once, which means the calls receive a cached result. If the file is updated you can't re-read it using this method.
### Backkground materials

[About Client-Server model](https://www.geeksforgeeks.org/client-server-model/)  
[API meaning](https://aws.amazon.com/what-is/api/)  
[Restful API](https://www.techtarget.com/searchapparchitecture/definition/RESTful-API)  
[Endpoints](https://blog.hubspot.com/website/api-endpoint)  
[About JSON](https://www.json.org/json-en.html)