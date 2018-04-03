##################################################
### Script : ci.sh (14-10-2017)                ###
### CI     : Continious Integration            ###
### Target : Tool dev			       ###
###	     Automated Continious Integration  ###
###	     among local & remote repo	       ###
##################################################





###############################
### Setting up a repository ###
###############################





############
# Step: 01 #
############

echo
echo [ Done ]  Initializing who am I.
git config --global user.email "sakib.rahman.0000@gmail.com"
git config --global user.name "Sakib Rahman"


############
# Step: 02 #
############

echo [ Done ]  Initializing a new Git repo for this project.
echo
git init


############
# Step: 03 #
############

echo
echo [ Done ]  Saving changes to the repository.
git add .


############
# Step: 04 #
############

echo [ Done ]  Committing...
echo
#############################
## follow up simple commit ##
#############################
## Rename 1_GAME_CHEATSHEET_JAVA.md to 1_GAME_DEV_CHEATSHEET_JAVA.md
## Create file.ext
## Update file.ext
## Delete file.ext
## Solved issues
## Default: Commit skipped|forgotten
## CSE360: Change detected, uploading ...
## Completion release! Level 1-2: Getting Started with LibGDX
## DRAWING: cr1.3.04 ConnectTheDots|Generator
## UPLOAD: Analysis report of 1.3.05-Exercise-DrawASprial
## DRAWING: DEBUG to make ACCURATE
## DRAWING: DEBUG to ACCURATE
## DRAWING: debug to accurate
## 💚 DRAWING: cr2018.Mar18.1.3.05

git commit -m "DRAWING: UPLOAD 1.3.06-Demo-DrawingRectangles"

## TODO: Retrieve previous 45 commit. url: https://github.com/sakib-rahman-bangladesh/libgdx-maturity/tree/d90e2305eed6af5bb528e0c9e8f17c96d5e570d9

############
# Step: 05 #
############

# List your existing remotes in order to get the name of the remote you want to change.
echo
echo [ Done ]  checking remote origin.
echo
git remote -v


############
# Step: 06 #
############

# Change your remote's URL from SSH to HTTPS with the git remote set-url command.
echo
echo [ Done ]  Updating remote URL.
git remote set-url origin https://github.com/sakib-rahman-bangladesh/libgdx-maturity
############
# Step: 07 #
############

# Verify that the remote URL has changed.
echo [ Done ]  Verifying remote URL.
echo
git remote -v


############
# Step: 08 #
############

echo
echo 08. Pushing local codebase to remote repo...Repo-to-repo collaboration: git push
echo
git push origin master
git push --all -f https://github.com/sakib-rahman-bangladesh/libgdx-maturity
