# git-basics
## Version controlling
Version control systems are basically a way of storing information about changes in code. They keep track of every modification to the code, including the person responsible for it and precise time.

Additional information about version control can be found here: What is version control

## ntroduction
```
Git (/ɡɪt/) is a version control system that is widely used for software development and other version control tasks. It is a distributed revision control system with an emphasis on speed, data integrity and support for distributed, non-linear workflows. Git was initially designed and developed in 2005 by Linux kernel developers (including Linus Torvalds) for Linux kernel development.
```
Source: Git (software) on Wikipedia

So Git is a version control system to keep track of changes across a set of files in a folder on your computer. It lives in a hidden folder called .git and it keeps track of all changes specified, as you work.

Every change, or commit, has a unique ID (or hash) linked to its parent. Furthermore, you can create branches, which have a different history than your master branch, with their own commits; these can then be merged back into the master.

To exclude some file types from version control, you can create a .gitignore file (note the dot in the beginning of the filename) to list what you want to leave out from all future commits. These files include virtual environments, IDE-specific build files, and so on. The simplest way to get an inclusive .gitignore file is to generate one on gitignore.io -- just enter the development environment you want (eg, Python), hit Create, and save the output into the .gitignore file in your project folder.

github.com is not git; it is simply a convenient website to backup and share your repositories, via the git protocol.

## Installation - Windows
On Windows systems, you will need to download the installer from this page. During the installation, take these steps (for unlisted steps just go with the default settings):

* it is recommended to have Git installed at default location (disk C)
* at Select Components section, uncheck Git GUI Here under Windows Explorer integration
* at Adjusting your PATH environment section, select Git from the command line and also from 3rd-party software
* at Choosing HTTPS transport backend section, select Use the OpenSSL library
* at Configuring the line ending conversions section, select Checkout Windows-style, commit Unix-style line endings
After installation is completed, open Windows PowerShell (Windows + S, type PowerShell) and enter the command git. You should see some information regarding Git, mostly the available commands, some manuals, etc.

## Installation - Linux and MacOS
On Unix systems, you will need to install git by running these commands in a terminal:
```
$ sudo apt-get update
$ sudo apt-get install git-all
```
This will make sure you have the latest sources for the software to be installed, and then install git for your system, if it's not already present.

Please note that you will have to provide your system password for sudo commands.

## Preamble
Below you will find the list of the most common git commands and the typical workflow for contributing to an existing project.

The commands to be typed in the terminal will show up like this:
```
$ git log
```
(The $ indicates the prompt)

Please note that the text in <angle brackets> should be replaced with your own text. Aditionally, text in [square brackets] is optional, i.e. you can skip it.

The sample output of a command will show up like this:
```
commit 21316f2eb86c30402ff5cd4598c910906c1d32ad (HEAD -> master)
Author: alexsincai <alex.sincai@yahoo.co.uk>
Date: Tue Feb 25 10:22:04 2020 +0200
```
Added Readme
### Starting a project by cloning its repository
In Codecool, most repositories will be automatically created for you. Thus, to work on your project, get your project's repo URL (usually from GitHub) and clone it with issuing the git clone <URL> command in a parent directory (it will create the project directory inside that parent directory).

Proceed to make all required changes. Add the changed files with git add <filename(s)>, commit with the relevant message (git commit -m "<message>"), and push the changes (git push).

To recap:

1. git clone <URL>
2. Make the necessary changes
3. git add <files>
4. git commit -m "<descriptive message>"
5. git push
## Contributing to an existing project
If you contribute to an already existing project (like when you work in a teamwork or you decide to contribute to an open source project) the above list is extended by a couple of things.

After cloning the repository create a new branch with git checkout -b <new branch name> and then get all the content -- you do this using git pull.

After making the necessary changes, adding and committing, go to the github page of the project, click the "Pull requests" tab, and hit the "New pull request" button. Compare the base: master with the compare: <branch name> and click "Create pull request". Fill in the details, and click "Create pull request" again.

If you see any conflicts, resolve them, otherwise wait for the repo owner (or one of your teammates) to merge your changes.

To recap the whole process:

1. git clone <URL>
2. git checkout -b <new branch name>
3. git pull
4. Make the necessary changes
5. git add <files>
6. git commit -m "<descriptive message>"
7. git push -u origin <branch name>
8. Create a new pull request with a descriptive message
9. Solve any conflicts
10. Wait for the repo owner / teammate to merge your changes
## Commands
### Setting up
git (and github) needs to know about you. Run these commands to configure it:
```
$ git config --global credential.helper store
$ git config --global user.name "<github username>"
$ git config --global user.email "<github email adress>"
```
git clone
Allows you to clone a remote repository to your machine.
```
$ git clone <remote repository> [<local folder>]
```

```
Cloning into 'git-github-presentation'...
remote: Enumerating objects: 37, done.
remote: Counting objects: 100% (37/37), done.
remote: Compressing objects: 100% (26/26), done.
remote: Total 37 (delta 11), reused 33 (delta 7), pack-reused 0
Unpacking objects: 100% (37/37), done.
```
git add
Let git know about new / modified files

To add a single file:

```
$ git add <file>
```
To add several files:
```
$ git add <file 1> <file 2> ... <file n>
```
To add the current folder:
```
$ git add .
```
Warning! git add . (notice the dot) adds every unstaged file and change in the current folder (except for deletions). Don't use it, unless you know what you're doing and check changes before/after changes with the git status or git diff command.


git commit
Have git track the desired files
```
$ git commit -m "<descriptive message>"
```

git push
This syncs the current local branch to the remote repository, on the same branch
```
$ git push --set-upstream origin <branch>
```

...which can be shortened to
```
$ git push -u origin <branch>
```
Please note that origin is just a label, it can be called anything (but really shouldn't...). "origin" is just the standard name for the remote repo's URL.
```
$ git push
```
git status
See the status of the files (untracked, new, modified, deleted) on the current branch
```
$ git status
```

```
On branch master
Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git checkout -- <file>..." to discard changes in working directory)

modified: README.md

Untracked files:
(use "git add <file>..." to include in what will be committed)

.gitignore

no changes added to commit (use "git add" and/or "git commit -a")
```

git pull
Actually it's a shorthand for executing git fetch and git merge after each other.

git fetch: Syncs changes from a remote repository.

git merge: Incorporates fetched changes into the current branch.
```
$ git pull
```
git reset
git reset allows you to "go back in time" to just before the error appeared, or rather, to the commit specified.
```
$ git reset <commit ID>
```
```
$ git reset --hard <commit ID>
```
```
$ git reset --soft <commit ID>
```
A reset can be soft, mixed (this is the default), or hard. A soft reset adds and commits the changes made for the specified commit; a mixed reset adds the changed files, but does not change them; a hard reset removes all the changes.

```
commit ce2724ded4afeb6b1b89ece009216f25de477ec8 (origin/master, origin/HEAD)
Author: alexsincai <alex.sincai@yahoo.co.uk>
Date: Tue Mar 3 10:21:40 2020 +0200

Beautified code

commit 679e7b6d41a0625d5d8ea9366caca3e3da2ca944
Author: alexsincai <alex.sincai@yahoo.co.uk>
Date: Tue Mar 3 10:00:21 2020 +0200

URL didn't work

$ git reset --hard 679e7b6d41a0625d5d8ea9366caca3e3da2ca944
Unstaged changes after reset:
M area_of_circle.py

$ git log
commit 679e7b6d41a0625d5d8ea9366caca3e3da2ca944 (HEAD -> master)
Author: alexsincai <alex.sincai@yahoo.co.uk>
Date: Tue Mar 3 10:00:21 2020 +0200

URL didn't work
```
git checkout
This sets the HEAD to a specified commit hash or branch

To work on a previous commit:
```
$ git checkout <hash>
```
```
Note: checking out '21e40ae300061b7849417f9bc8de783ebb17c7ba'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by performing another checkout.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -b with the checkout command again. Example:

git checkout -b <new-branch-name>

HEAD is now at 21e40ae Added style
```

To work on a different branch:
```
$ git checkout <branch>
```

```
Switched to branch 'color'
Your branch is up to date with 'origin/color'.
```

You can also create a new branch and work on it with:
```
$ git checkout -b <new branch name>
```
```
Note: checking out '21e40ae300061b7849417f9bc8de783ebb17c7ba'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by performing another checkout.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -b with the checkout command again. Example:

git checkout -b <new-branch-name>

HEAD is now at 21e40ae Added style
```
Tips & Tricks
* [Setup VS Code as git editor](https://code.visualstudio.com/docs/sourcecontrol/overview#_vs-code-as-git-editor)