This project is for study purposes

It is a project using the Java programming language.

BDD using Cucumber and Gherkin.

Using POM (Page Object Model) as design pattern.

Recommended IDE:
IntelliJ IDEA 2025.2 (Community Edition)
https://www.jetbrains.com/idea/download/other/

--If you want to setup and understand the structure of this project, watch this video:
---https://www.youtube.com/watch?v=At_wrl2Nh8M



What is BDD?
https://www.youtube.com/watch?v=BOImAqe59pE
https://cucumber.io/docs/bdd/

What is POM?
https://www.youtube.com/watch?v=M4Jz9U7nW_w
https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/

Recommended IDE:
IntelliJ IDEA 2025.2 (Community Edition)

Git Clients:
https://git-scm.com/downloads/guis?os=windows

Git Commands:
-Getting Started-
Command 	                                    Description
git init	                                    Creates a new local Git repository in the current directory.
git clone <url>	                                Creates a local copy of a remote repository from a specified URL.
git config --global user.name "[name]"	        Sets the author name to be used with your commits.
git config --global user.email "[email]"	    Sets the author email address to be used with your commits.

-Staging and Committing Changes-
Command 	                                    Description
git status	                                    Shows the status of files in the working directory and staging area.
git add <file>	                                Stages a specific file for the next commit.
git add .	                                    Stages all untracked and modified files in the current directory and subdirectories.
git commit -m "[message]"	                    Records the staged changes as a new commit with a descriptive message.
git diff	                                    Shows the difference between unstaged changes in the working directory and the last commit.

-Branch Management
Command 	                                    Description
git branch	                                    Lists all local branches in the repository.
git branch <name>	                            Creates a new branch with the specified name.
git checkout <name> or git switch <name>	    Switches to a different branch.
git checkout -b <name> or git switch -c <name>	Creates a new branch and immediately switches to it.
git merge <name>	                            Merges changes from the specified branch into the current active branch.
git branch -d <name>	                        Deletes a local branch (only if it has been merged).

-Syncing with Remote Repositories
Command 	                                     Description
git remote add origin <url>                      Connects the local repository to a remote server.
git push origin <branch>	                     Uploads local branch commits to the remote repository.
git pull	                                     Fetches changes from the remote repository and merges them into the current local branch.
git fetch	                                     Downloads changes from the remote repository but does not merge them, allowing for inspection first.

-Undoing Changes
Command 	                                     Description
git reset --hard	                             Discards all local changes and commits, resetting the working directory to the last known state of the current branch.
git checkout -- <file> or git restore <file>	 Discards local changes to a specific file.
git revert <commit>	                             Creates a new commit that undoes the changes made by a previous commit.
git stash	                                     Temporarily saves (stashes) changes that are not ready to be committed, allowing you to switch contexts.
