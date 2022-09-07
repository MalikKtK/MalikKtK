---
description: nifr@kea.dk February 202, ed. clbo@kea.dk August 2022
---

# Ex: Spring introduction

Solution (comes in a few days):&#x20;

{% embed url="https://github.com/2-semester-programmering" %}
Solution
{% endembed %}

### FAQ

Exercises can be done in groups. Not mandatory. Should be done using the Spring Framework

### 1.1 Exercise: Hello Spring

Create an endpoint that greets the user with a friendly message

### 1.2 Exercise: Echo

Create an endpoint that echo’s the users GET parameter from the URL. E.g: `http://localhost:8080/echo?input=HelloWorld` display a message `HelloWorld` on screen.

### 1.3 Exercise: ErDetFredag?

Create an endpoint to mimic www.erdetfredag.dk with plain text.

#### 1.3.1 Hint: Steps

* Create a Spring project with Spring initializer. Remember to include Spring Web.
* Create a package called controllers in the src folder
* Create a package called services in the src folder
* In the services folder create a class that serves the purpose of calculating the day of the week
* Call the service-class from the controller
