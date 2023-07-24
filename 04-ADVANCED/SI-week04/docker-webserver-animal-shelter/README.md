# Animal shelter

## Story

Your friend and you decided to volunteer for a non-profit animal shelter,
'Furry Friends'. They are very friendly, but not tech-savvy people. They need you to put together a website for the
shelter.

They also would like to be able to view the website from the internal network, while you develop it.

First they would like to see a simple webpage with the following content:

- A heading, containing the name of the shelter
- It must display the logo of the shelter
- A paragraph describing the organization:
  > There are countless stray dogs and cats worldwide.
  > FURRY FRIEND is working locally neutering and provide medical care.
  > We are committed to a sustainable and humane solution to reduce
  > the population of stray animals, and provide a caring home for them.
- A table containing the currently available animals with their image, name and age
- A map displaying the vicinity of the shelter
- Contact information, email, address, phone number:

  <pre>
  John Doe
  john.doe@furryfriends.org
  Budapest, Hajnalka street 3.
  +1-202-555-0125
  </pre>

## What are you going to learn?

 - web development (HTML) basics
 - what webservers do?
 - linux command line basics
 - installing docker
 - using docker as a development tool, (running a webserver)

## Tasks

1. Add required content with appropriate tags in `index.html`
    - heading contains shelter's name
    - page displays shelter's logo
    - page contains paragraph, describing the shelter's mission
    - page contains table with small rectangular images of currently available animals
    - table also contains their name and age in separate columns
    - page contains embedded map's displaying the shelter's address (can be google map or openstreetmap)
    - page contains shelter's contact information

2. Webpage made available on local network through docker
    - docker is installed
    - command to launch a docker image is in a bat or sh file
    - when the command is started, the docker container is running a webserver. Could be: apache aka. httpd, etc...
    - the container's ports are exposed
    - the container's volumes are mapped to the development directory. Bind mounts can be used...

## General requirements

None

## Hints

- While working in a Windows environment, you can utilize Linux commands in different ways:
  - using the `git bash` command line, which is installed by `Git for Windows` and based on MinGW (Minimalist GNU for Windows)
  - by installing `CygWin`, and adding it to the `PATH`
  - by using the WSL (Windows Subsystem for Linux)
  - inside a docker container
  - inside a virtual machine
  - using PuTTY to ssh into a Linux/Unix server.

## Background materials

- <i class="far fa-book-open"></i> [Linux command line intro](https://ubuntu.com/tutorials/command-line-for-beginners#1-overview)
- <i class="far fa-book-open"></i> [Linux command line intro (for Cygwin)](http://www2.imm.dtu.dk/courses/02333/cygwin_tutorial/index.html)
- <i class="far fa-book-open"></i> [What is a webserver?](https://developer.mozilla.org/en-US/docs/Learn/Common_questions/What_is_a_web_server)
- <i class="far fa-video"></i> [HTML in 5 minutes](https://www.youtube.com/watch?v=salY_Sm6mv4)
- <i class="far fa-book-open"></i> [Basic HTML course](https://htmldog.com/guides/html/beginner/)
- <i class="far fa-book-open"></i> [W3schools HTML course (for reference)](https://www.w3schools.com/html/default.asp)
- <i class="far fa-video"></i> [What is docker?](https://www.youtube.com/watch?v=JSLpG_spOBM)
- <i class="far fa-book-open"></i> [Docker - get started](https://docs.docker.com/get-started/overview/)
