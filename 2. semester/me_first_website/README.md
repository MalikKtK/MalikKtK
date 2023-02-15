# My First Website

After creating an empty new Spring project in IntelliJ through the _Spring Initializer Template_: [#3 Hello Spring](https://github.com/StudentsAdministration/03_hello_spring), you should now create your first _Hello World Website_.    

<sup>_Remember that this is a step by step instruction. It does not explain all the concepts in details. This explanaition you will get from your teacher in class._</sup>

You should now have a folder and file structure that looks something like this:    

<img src="https://github.com/clbokea/spring_getting_started/blob/master/img/Screen%20Shot%202017-11-17%20at%2010.58.46.png" width="300px"/>    


If you open your **_src_** folder you will see a **_main_** and a **_test_** folder.    
Delete the:
* **_test_** folder    
And delete the: 
* **_mvnw_** and the **_mvnw.cmd_** files.     

<sup>(you could leave them in the project, but since we are not going to use them we delete them for a better overview)</sup>    

<img src="https://github.com/clbokea/spring_getting_started/blob/master/img/Screen%20Shot%202017-11-17%20at%2011.06.38.png" width="300px"/>     


Now you have a project structure that looks like this:    

<img src="https://github.com/clbokea/spring_getting_started/blob/master/img/Screen%20Shot%202017-11-17%20at%2011.13.55.png" width="500px"/>     

<!-- Don´t be confused by all the folders. They are packages (or just folders) and is not especially important right now. You can for now see the _demo_ folder as your root folder. -->

## Create a normal java class file
In the demo folder create a class and call it HomeController.java.     
<sub><sup></sup></sub>
* Right click the "demo" folder
* chose: New -> Java Class  
* Name: HomeController
* Kind: Class

<img src="https://github.com/clbokea/spring_getting_started/blob/master/img/Screen%20Shot%202017-11-17%20at%2023.12.13.png" width="600px"/>      

### Create an index method in the class
Create a public method called index with a return type of String, and return the string "index".

<img src="https://github.com/clbokea/spring_getting_started/blob/master/img/Screen%20Shot%202017-11-17%20at%2023.19.40.png" width="500px"/>  



Add **_@Controller_** above the class definition and **_@GetMapping("/")_** above the method definition.    


<img src="https://github.com/clbokea/spring_getting_started/blob/master/img/Screen%20Shot%202017-11-17%20at%2023.30.50.png" width="600px"/>      

## Create an index.html file
* right click **_resource -> template_** folder 
* Choose: **_New -> html file_** 
* Name: index
* Kind: Html 5 file
* Delete the ```` <meta charset="UTF-8"> ````  tag
* Add ````  xmlns:th="http://www.thymeleaf.org"   ```` to the ```` <html lang="en">  ```` tag

<img src="https://github.com/StudentsAdministration/03_my_first_website/blob/master/img/newHtml.png" width="600px"/>  

Make your code look like the image above. (do your best :))

### Run the application
push the green start button in the upper right corner.

<img src="https://github.com/clbokea/spring_getting_started/blob/master/img/Screen%20Shot%202017-11-17%20at%2023.49.09.png" width="400px"/> 

Open your browser and type http://localhost:8080    

<img src="https://github.com/clbokea/spring_getting_started/blob/master/img/Screen%20Shot%202017-11-17%20at%2023.53.41.png" width="600px"/>     

_<div align="right">&copy; clbo@kea.dk</div>_
