# Docking

## Story

_“But…. It was working on my laptop…”_ - what you will discover as soon as you start to work in a software company, is that while your code will always work fine on __your__ laptop, most likely it will __not__ be hosted from there…
On your machine it is working like a charm - of course, you have spent months (years…) configuring the environment. Some parts of this environment has nothing to do with your application whatsoever (Excel, Photoshop, CS:GO…), some are necessary, but maybe not optimal (you do not need a complete Windows10 as an OS, but for sure need some of its functionalty) and there are a few “musthave”s - node, your depenedencies and your code for example.
With docker, you can describe the bare minimum of requirements needed for your application to run - and then build a portable image, that contains __all__ the dependencies, and can run __anywhere__.
Do it, so that you can easily deploy it afterwards.

## What are you going to learn?

- Dockerizing your application - make it ready to run anywhere
- Publish your images to an artifact repository - store them on Dockerhub
- Run and manage your images/applications in the cloud - get started with container orchestration
- => Devops basics

## Tasks

1. Describe an image in a `Dockerfile` that is derived `from` node, your whole app is `add`ed, and as a starting `command` runs your app `exposed` to the world on port 3000 - then `build` the image
    - A Dockerfile (without any extension) exists in the project root
    - The Dockerfile starts with the command `FROM node:10`
    - When the build starts the directory is copied and made the work directory with commands `ADD . /appDir` and `WORKDIR /appDir`
    - The Dockerfile contains a `CMD ["npm", "start"]` command, so that the first command, when the image runs in a container starts the server
    - The image exposes port 3000 due to the ‘expose 3000’ command in the Dockerfile
    - After `docker build . -t mybackend` runs, calling ‘docker images’ shows your built image
    - Running the application with `docker run -d -p 3000:3000 mybackend` command makes it runnning and listening on port 3000

2. Describe an image in a `Dockerfile` that is derived `from` nginx, `add` the static content to the proper folder - then `build` the image
    - A Dockerfile (without any extension) exists in the project root
    - The Dockerfile starts with the command `FROM nginx`
    - The Dockerfile includes `COPY app /usr/share/nginx/html`, conforming to the docker-nginx docs
    - After `docker build . -t myfrontend` runs, calling ‘docker images’ shows your built image
    - Running the application with `docker run -d -p 8080:80 myfrontend` command makes it runnning and listening on port 8080

3. `Tag` your images with <username>/my-first-fe and <username>/my-first-be tags, then `publish` them to dockerhub
    - You can see your images at https://hub.docker.com/ when logged in

4. Login to sloppy admin, deploy and manage your images
    - Your app is available on <your-chosen-name>.sloppy.zone
    - The log level on the backend can be changed with environment variables
    - The frontend app is served on two instances to handle the greater load

## General requirements

- You have git and docker cli installed on your computer
- You have an account at github and dockerhub
- You have an account at sloppy.io

## Hints

- You can stop your running docker containers with ‘docker stop’
- When experimenting with docker, you will create a lot of useless images - check out how to delete both the containers and images easily, so you can keep order in your local repository

## Background materials

- <i class="far fa-book-open"></i> [Docker - get started](https://docs.docker.com/get-started/overview/)
- <i class="far fa-exclamation"></i> [Nginx - base image](https://hub.docker.com/_/nginx)
- <i class="far fa-exclamation"></i> [NodeJS - base image](https://hub.docker.com/_/node)
- <i class="far fa-exclamation"></i> [Container orchestration - admin app](https://admin.sloppy.io/)
- <i class="far fa-book-open"></i> [Dockefile reference](https://docs.docker.com/engine/reference/builder/#from)
- <i class="far fa-book-open"></i> [Docker cli reference](https://docs.docker.com/engine/reference/commandline/cli/)
