No starter code is provided. Start from scratch!

# Ask NASA
With the JavaScript Fetch API-based GET request, you can connect to publicly available servers and get structured data. Did you know that NASA has a lot of open APIs? In this project, you will start working with an open API and requesting data from the NASA API.

Your task is to get data from the APOD API and recreate their website with some more functionality.

What are you going to learn?
* Create a GET request
* Get data from an open NASA API

## Tasks

### Today's post
A new image is uploaded to the APOD server every day. Create a page that displays these pictures with other information.

* When opening the page, an image is displayed with a title and an explanation.
* Images are displayed using `<img>`, YouTube videos are displayed using `<iframe>`.
* The data matches the information on https://apod.nasa.gov/apod/astropix.html.


### Everydays post

Create an input where we can see images from previous days.

* There is an input where the previous date can be picked.
* When picking an older date, the data on the page changes.
* If the date 2020 September 2 is chosen, the data matches the information on https://apod.nasa.gov/apod/ap200902.html

### OPTIONAL TASK: Gallery
Create a gallery where multiple images are displayed next to each other. If the user clicks one of the images, the information about the picture is displayed.

* On the landing page, there is a Gallery menu point that redirects to an image gallery.
* The gallery contains earlier images next to each other.
* When clicking one of the images, the image and related information is displayed in a bigger modal


### General requirements

### Hints
* Familiarize yourself with Fetch API first.
* Use the DEMO_KEY API Key or create your own Nasa API Key for the project to get data. If you use the demo key, it has a strict limitation regarding the number of requests you make. For more information, see the API documentation.
* If a YouTube link appears instead of the thumbnail, convert the link to an embedded one. You do not need to use the YouTube API.
### Backkground materials
[JavaScript Fetch API](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch)  
[JavaScript Fetch API Examples](https://www.digitalocean.com/community/tutorials/how-to-use-the-javascript-fetch-api-to-get-data)  
[Nasa APIs](https://api.nasa.gov/)  
