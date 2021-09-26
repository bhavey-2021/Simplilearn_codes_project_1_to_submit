# Simplilearn_codes_project_1_to_submit

Writeup - LockMe

User Story 

As a user I want a lockme digital locker to store all my  credentials.
As a user I want a registration page to register a new user in the locker.
As a user I want a login page to authenticate to access the application.
As a user I want to login inside the application and store my credentials .
As a user I want to login inside the application and fetch my stored credentials.
As a user I want to delete my file.
As a developer I want to build a registration page to register a user in the digital locker.
As a developer I want to build a login page to authenticate the user.
As a developer I want to provide an option to store user credentials.
As a developer I want to provide an option to fetch user credentials.
As a developer I want to provide an option to delete file.
As a developer I want to provide an option to exit the application.
As a developer I create user interaction with console input.

Concepts used 

Object oriented programing 
Classes 
Methods 
Array list 
List Scanner
Scanner
File handling 
BufferReader
Switch Cases 
Data Structures

Technologies used
Java 
Git Hub 

GitHub Repository  Link : https://github.com/bhavey-2021/Simplilearn_codes_project_1_to_submit.git 


Product Capabilities 
Store and fetch user data 

Number of sprint required 
The project was completed in 1 sprint 

Additional Remarks 
In line no 94 and 153 
File folder= new File("C:\\Users\\bhavey.malhotra\\Desktop\\Eclipse_Java\\PhaseOneProject");
We need to type in the location where the Lockme project will be stored 








Algorithm 

Prints the Welcome to the lockMe app message 
Prints the developer name 
Shows the main menu options → ||Show current files || Register || Login || Exit ||
Takes input from user from command line 
If User selects [Show current files] 
Show the current stored files in the locker database .
Redirecting back to main menu
If User selects [Register] 
Ask for the username they wish to proceed with 
If the username is already there , then ask them to choose a different name 
If the username is new then take it from the user 
Make a new file by the username mentioned by the user 
Ask the user to enter the password 
Redirecting back to the main menu. 
If the user selects [Login] 
Ask for username 
If the username is correct proceed to the next step ; else if the username is wrong redirect to the main menu .
Ask for password iff username is present and correct .
If the password is correct , redirect to the user menu ; else if password is wrong redirect to the main menu .
Show the user menu options →  || Store Credentials || Fetch Credentials || Delete File || Back to menu ||
If user selects [Store Credentials ] 
Print : Welcome to your file locker . Ask the user to enter the website details they wish to store
Once the user has entered the website , ask for the website's username .
Once the user has entered the password for the website , Print : your data has been stored 
Redirect to the User menu.
If user selects [Fetch Credentials ] 
Print : welcome to your data file . Ask them what website data they wish to extract 
If the website entered is not there , print : credentials not stored 
If the website entered is correct , show them the data stored
Redirect them to the User Menu
If user selects [Delete File]
Delete the file with the “username”.txt
Redirect to the Use menu 
If the user selects [Back to main menu] 
Redirect to main menu 
          8. If the user selects [Exit]
Terminate function 
