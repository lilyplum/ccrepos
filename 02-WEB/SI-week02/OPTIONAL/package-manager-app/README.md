# package-manager-app

NOTE: Before you start this project you have to finish the Package Manager API project because in this project you have
to use the API endpoints created in that project!
Your Package Manager API receives really good feedback from NPM/GitHub. They are asking you to create a nice UI for the
project.

What are you going to learn?

* Web forms UI/UX
* Autocomplete inputs
* Handle GET/POST/PUT/DELETE http methods on the client side with fetch

## Tasks

### Create a form on the frontend side

Create the web server's UI part. Visiting the /edit/package shows a Form where all the details (keys) of the package
object (schema) turned into editable inputs except the ID. Use the Wireframe/UI design linked in the background
materials.

Visiting the /edit/package shows a form with name `<input>`, a details `<textarea>`, a dependency editor, a version
editor
part and a save `<button>`.

### Store an object

Store the (package schema) object in a global variable which will be sent to the server. Update it each time something
changes in the form.

* An object (package schema) is stored in a global variable.
* Each time a value is changed in the form the object is updated.
* Each time a dependency or a version added or removed the object is updated.

### Dependency editor part of the form

The dependencies could be edited (added, deleted) dynamically. The dependency editor part has a package autocomplete
search which gets the list of the packages by fetching the data from /api/package/ with GET request. The received data
is filtered by the input's value (can be found in the name of the packages).

* Writing at least 3 characters into the "dependency search" input sends a GET request to /api/package/ endpoint and the
  response is filtered by the input's value (can be found in the name of the packages).
* The filtered result shows as a list (package name and latest version).
* Clicking on the list's element adds the package to the dependency list (both visually and to the object as well).
* Clicking on an already added package's delete (X) button removes the package from the dependencies (both visually and
  in the object as well).

### Version editor part of the form

The versions could be edited (added, edited, deleted) dynamically. The version editor part has a button for adding a new
version. Also, the version's number and date are editable as well (input elements).

* Clicking on the add new version button adds a new version to the top of the version list with the current date and
  with a version number whose last number is larger (with 1) than the previous version's number (both visually and to
  the object as well).
* Clicking on an already added version's delete (X) button removes it from the version list (both visually and in the
  object as well).
* The already added versions have two input elements (number and date).
* Changing an already added version's number or date is updating the proper value in the object as well.

### Make the existing packages editable

Use the same UI form for editing the existing packages.

* Visiting the existing package editor (eg.: /edit/package/1), updating the from then clicking on the from's SAVE
  PACKAGE button sends a PUT request to the ID endpoint (eg.: api/package/1).
* When the PUT request is successful only the form is reloaded with the data received from the server.

### Create POST, PUT, DELETE requests

Let's add the event handling and the communication with the server to the frontend.

* Visiting the /edit/package, filling the form then clicking on the form's SAVE PACKAGE button sends a POST request to
  the api/package/ endpoint.
* When the POST request is successful the page is redirected to the existing package editor (eg.: /edit/package/1).

### General requirements

* Only HOFs (filter, reduce, map) are used instead of for loops.
* The index.html's body contains only a div element with root id, all the other HTML code is added from javascript.

### Hints

* To avid reloading the page on send don't use method and action html attributes on `<form>` element. Use submit event
  listener and the event object's preventDefault() method .
* Use input event listener for updating the stored data.
* Save the `<form>` into a variable's function expression as template literals. Add the package's details as parameters

### Background materials

[Figma Design for the Project](https://www.figma.com/file/kzcEsuDtd2PUBLkIuOIciX/PackageManagerApp?type=design&node-id=0-1&mode=design)  
[input event](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/input_event)  
[submit event](https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/submit_event)  
[preventDefault](https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)  
[function expression](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/function)  
[POST request with fetch example](https://www.grepper.com/answers/382036/javascript+fetch+post+form+data)  
[How to use Fetch](https://gomakethings.com/how-to-use-the-fetch-api-with-vanilla-js/)
[How to use fetch in JavaScript: GET, POST, PUT and DELETE requests](https://www.youtube.com/watch?v=hOXWY9Ng_KU&ab_channel=OpenJavaScript)
