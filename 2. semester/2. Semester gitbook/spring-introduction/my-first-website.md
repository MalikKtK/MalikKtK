---
description: This is what we have covered in class this first session with Spring Boot.
---

# My First Website

After creating an empty new Spring project in IntelliJ through the _Spring Initializer Template,_ you should now create your first _Hello World Website_.

_Remember that this is a step by step instruction. It does not explain all the concepts in details. This explanation you will get from your teacher in class._

You should now have a folder and file structure that looks something like this:

![](<../.gitbook/assets/Screen Shot 2017-11-17 at 10.58.46.png>)

If you open your _**src**_ folder you will see a _**main**_ and a _**test**_ folder.\
Delete the:

* _**test**_ folder\
  And delete the:
* _**mvnw**_ and the _**mvnw.cmd**_ files.

(you could leave them in the project, but since we are not going to use them we delete them for a better overview)

![](<../.gitbook/assets/Screen Shot 2017-11-17 at 11.06.38.png>)

Now you have a project structure that looks like this:

![](<../.gitbook/assets/Screen Shot 2017-11-17 at 11.13.55.png>)

### Create a normal java class file

In the demo folder create a class and call it HomeController.java.\


* Right click the "demo" folder
* chose: New -> Java Class
* Name: HomeController
* Kind: Class

![](<../.gitbook/assets/Screen Shot 2017-11-17 at 23.12.13.png>)

#### Create an index method in the class

Create a public method called index with a return type of String, and return the string "Hello World".

![](<../.gitbook/assets/Screenshot 2022-08-03 at 21.12.59.png>)

Add _**@RestController**_ above the class definition and _**@GetMapping("/")**_ above the method definition. As a return value you could write "Hello World" or something else of your own choice.&#x20;

![](<../.gitbook/assets/Screenshot 2022-08-03 at 21.08.28.png>)

Run the application

push the green start button in the upper right corner.

![](<../.gitbook/assets/Screen Shot 2017-11-17 at 23.49.09 (1).png>)

Open your browser and type http://localhost:8080

![](<../.gitbook/assets/Screenshot 2022-08-03 at 21.07.41.png>)

### _Passing a value from the url into a method and returning it back to the browser_

_Create a new method in your HomeController and call it message()_

![](<../.gitbook/assets/Screenshot 2022-08-03 at 22.03.45.png>)

_In line 14 annotate your method with `@GetMapping("message")`_

![](<../.gitbook/assets/Screenshot 2022-08-03 at 22.06.56.png>)

_Now you have created a new endpoint and if you run your application, open your browser, and type in http://localhost:8080/message you will execute your method and it will return "Hello!" to you browsers screen._&#x20;

#### _Pass in a value_&#x20;

_If you want to pass in a value into your method, this should be done like you are used to as a parameter of this method: `message(value goes in here).`_

In this case we want a String to be passed in and the parameter we will call "name".

![](<../.gitbook/assets/Screenshot 2022-08-03 at 22.18.37.png>)

_The return value will now be a concatenation of "Hello" and the passed in name._

_In order for the Spring Boot framework to understand what we are trying to do we will write `@RequestParam` in front of `String name.`_&#x20;

![](<../.gitbook/assets/Screenshot 2022-08-03 at 22.24.02.png>)

This will tell the Spring Boot Framework to look for a parameter in the browsers url called "name".

If you type in `http://localhost:8080/message` and attach "`?name=Claus`" , Claus will be passed in through the `name` parameter in the message method and get returned via the return statement in the method.

**`http://localhost:8080/message?name=Claus`**

Your browser will now show this:

![](<../.gitbook/assets/Screenshot 2022-08-03 at 22.59.29.png>)



_© clbo@kea.dk_
