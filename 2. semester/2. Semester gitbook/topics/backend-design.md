# Backend Design

Boilerplate:

{% embed url="https://github.com/2-semester-programmering/spring-jdbc" %}

**Data:** [databaseemployees-departments.md](../exercises/databaseemployees-departments.md "mention")****

## **Learning objectives**

* Retrieving data with the JDBC API designed as a Singleton
* Building GRASP & DRY compliant repositories
* Storing username & passwords in seperate files
* (Advanced)
  * Implement CRUD interface with generics

## Exercises



### 1. View all employees

The customer want a feature, such that they can see all employees in a table, the same way that they can currently view all departments

### Technical Requirements

A new controller & GetMapping

A new model for modelling Employee data

A new view for displaying all employees

A new repository for querying the employee database

### 2. View single employee

The users want a feature, such that they can see a single employee by their employeenumber.

### Technical Requirements

A new controller & GetMapping with request parameter:

https://www.baeldung.com/spring-request-param

A new view for displaying a single employee

A new repository method for querying a single employee by their parameter

### 3. Create new employe

The users want a feature, such that they can fill a form with employee data and create a new employee in the database.

### Technical Requirements

A new controller & PostMapping

A new view with an input form, such that users can post new data & send to database

A new repository method for querying an insert statement with data from POST form

## Advanced: Building a Pokedex

The data can be found here:

{% embed url="https://github.com/2-semester-programmering/dat22v1_assets/blob/main/pokedex.sql" %}
pokedex.sql
{% endembed %}



**Reflect before engineering:**

**1. What are the contents of the data-set?**

**2. What are the semantics (meaning) of the data-set?**

**3. How can we build a model (java class) that represents each entity?**

**Exercises:**

* Create a new database schema for the data
* Create a table for the data
* Insert the data
* Build the following views that displays:
  * How many pokemon exists pr. primary type?
  * What are the average defence for all pokemon?
  * What are the average hp for (primary) grass types?
  * How many fire pokemon has higher hp than the average pokemon?
  * What primary type are the fastest?
