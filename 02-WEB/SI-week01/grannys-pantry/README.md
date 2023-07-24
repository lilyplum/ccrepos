# Granny's Pantry
Little Red Riding Hood's granny learned the lesson and digitized her pantry, to make ordering online easier. Problem is, she did not receive a full documentation, nor a frontend, so she needs help administrating the items in her pantry.

What are you going to learn?
* Create requests using Postman.
* Create collections of requests using Postman.
* Use variables in Postman.

## Tasks

### Create Postman account
Create an account at Postman. You can download the client or use the app from the browser

* A Postman account is created.

### Create Pantry
Create a Pantry for your email at Pantry. Keep your Pantry id, as it is important later.

* There is an ID for the Pantry.

### Create Workspace
Create a new Workspace in Postman, where you can organize your collection of requests.

* There is at least one workspace in Postman.

### Create a Collection
Create a collection named Granny's Pantry in Postman, for storing requests in this project.

* There is a collection in Postman named Granny's Pantry

### Check your Pantry
Check the details of your Pantry by creating a GET request to https://getpantry.cloud/apiv1/pantry/<YOUR_PANTRY_ID> using Postman. Save this request to your collection, and name it Get details.

* There is a GET request named Get details saved into the collection.
* The response status is 200 OK.

### Create a Basket in the Pantry
Create a new Basket in your Pantry by creating a POST request to https://getpantry.cloud/apiv1/pantry/<YOUR_PANTRY_ID>/basket/<YOUR_BASKET_NAME> using Postman. Save this request to your collection, and name it Create new basket.

* There is a POST request named Create new basket saved into the collection.
* The response status is 200 OK.

### Introducing variables
Create a collection variable for the base URL (https://getpantry.cloud/apiv1/pantry/), named pantry_api_path. Create a collection variable for your Pantry ID, named pantry_id. Create a collection variable for your Basket, named basket_name. Use these variables in all of your requests. When you rewrite your previous ones, make sure they're still functional.

* There is a variable named pantry_api_path for the API path, used in all requests in the collection.
* There is a variable named pantry_id for your Pantry id, used in all requests in the collection.
* There is a variable named basket_name for your Basket, used in all affected requests in the collection.
* Variables are used in all requests.

### Fill hte basket
Fill the Basket by sending a PUT request to https://getpantry.cloud/apiv1/pantry/<YOUR_PANTRY_ID>/basket/<YOUR_BASKET_NAME> using Postman. The request body JSON must contain the {"fruits": ["apple", "banana", "peach"]} expression. Name the request as Fill Basket.

* There is a PUT request named Fill Basket saved into the collection.
* The response status is 200 OK.

### Check the basket
Check the content of the basket by sending a GET request to https://getpantry.cloud/apiv1/pantry/<YOUR_PANTRY_ID>/basket/<YOUR_BASKET_NAME> using Postman. Name the request as Get content of basket.

* There is a GET request named Get content of basket saved into the Collection.
* The response status is 200 OK.

### Delete the basket
Delete the whole basket by sending a DELETE request to https://getpantry.cloud/apiv1/pantry/<YOUR_PANTRY_ID>/basket/<YOUR_BASKET_NAME> using Postman. Name the request as Delete basket.

* There is a DELETE request named Delete basket saved into the Collection.
* The response status is 200 OK.

### Create a new Folder
Create a new Folder in your collection using Postman, and name it Restore Basket. Add the Create new basket , Get content of basket , Fill basket requests to this folder.

* There is a folder named "Restore basket".
* The folder contains the Create new basket, Get content of basket, and Fill basket` requests.

### Restore basket
Lucky we've created variables! Restore the previously deleted basket by running all requests in your Restore Basket folder, without editing anything.

* The API path, Pantry ID, and Basket name are stored in variables, used in all requests.
* By only running the folder, the basket described in the tasks can be restored.

### Test the Collection
Copy the content of postman_tests.js, located in the starter repository, to the Tests of the collection. All tests must pass.

* All tests are copied to the collection tests.
* All tests pass.

### Export the Collection
By exporting your work, anyone can import it and use your collection, which can be extremely useful. Export your collection and put it in your Git repo.

* The collection is exported into a JSON file.
* The collection can be found in the remote repository.

### Backkground materials
[About Workspaces in Postman](https://learning.postman.com/docs/collaborating-in-postman/using-workspaces/creating-workspaces/)  
[Sending the first request using Postman](https://learning.postman.com/docs/getting-started/sending-the-first-request/)  
[Using Collections in Postman](https://learning.postman.com/docs/sending-requests/intro-to-collections/#creating-collections)  
[Setting requests details in Postman](https://learning.postman.com/docs/sending-requests/requests/)  
[Using variables in Postman](https://learning.postman.com/docs/sending-requests/variables/)  
[Creating Folders in Postman](https://learning.postman.com/docs/sending-requests/intro-to-collections/#managing-collections)  
[Exporting Collections in Postman](https://learning.postman.com/docs/getting-started/importing-and-exporting-data/#exporting-collections)  
