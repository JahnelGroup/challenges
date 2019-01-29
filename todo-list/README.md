# Todo List Challenge

The Todo List Challenge is to build a simple web application that allows users to maintain a list of tasks. 

## Outline

The development of this app will take place in three phases, **Phase I**, **Phase II** and **Phase III**. Each Phase adds more functionality and increased level of complexity.

* **Phase I** we implement a proof-of-concept (POC) that someone can actually use and get a feel for the product. It gives them something to explore and see what they like and dislike, helping them potentially adjust their requirements. 

* **Phase II** we take the POC and implement a minimum-viable-product (MVP) to provide real value. A simple backend is created and the tasks are saved to a data store. 

* **Phase III** we take the MVP and implement a completed polished application. We add support for multiple task lists and user accounts so each user has their own lists. 

## Deliverables

To complete this challenge you are expected to create a GitHub repository with all your source code and documentation. It should be descriptive and self explanatory that anyone can pull the code down and run the application locally. 

## Phase I (Proof of Concept)

Your goal is create a proof-of-concept where each user visit to the page show a temporary task list that allows the addition and removal of tasks. There is no persistent storage or backend server. 

### Functional Requirements

* Task List
  * Upon loading the app for the first time the user should be presented with a single empty task list
  * If the user refreshes the page then the entire task list is expected to be cleared
* Create Task
  * When the user enters a task in the textbox and clicks the add button or hits the enter key it should get added to the list
* Delete Task
  * The user should have the ability to remove a task from the task list 
* Out-of-scope
  * The user does not need the ability to edit a task in this Phase

### Non-functional Requirements
* The app will be [client-side](https://en.wikipedia.org/wiki/Client-side) only and will not connect to any mid-tier or data store server
* The app must be web based and rendered in a [web browser](https://en.wikipedia.org/wiki/Web_browser)
* The app does not need to be [cross browser compatible](https://medium.com/@sarahelson81/what-is-cross-browser-compatibility-and-why-we-need-it-b41423c3501a)
* The app does not need to be [responsive](https://medium.com/swlh/everything-you-need-to-know-about-responsive-web-design-54c2059a7e99)
* You do not need to use a [JavaScript Framework](https://raygun.com/blog/popular-javascript-frameworks/) but can if you want

## Phase II (Minimum Viable Product)

Your goal is to enhance the product by adding features and providing persistent storage. Users visiting the site should be able to create, read, update and delete tasks that persist when the browser is closed and then reopened. 

### Functional Requirements

* Persistent Task List
  * Changes to the Task List must be persisted between user visits
  * If the user refreshes the page then the entire task list should be preserved
  * It's expected that the application maintain one overall Task List, meaning every user visitng the site should interact with the same Task List
* Edit Task
  * The user should have the ability to edit a Task and save the changes
  * During the editing process the user should be able to cancel the action
* Complete Task
  * The user should have the ability to mark tasks as complete
  * The visibile indication that a task is complete should be a strike-through in the font of the Task
  * The user should have the ability un-mark a task as complete thereby removing the strike-through

### Non-Functional Requirements

* The app must implement [persistent storage](https://en.wikipedia.org/wiki/Persistence_(computer_science)) (i.e., [RDBMS](https://en.wikipedia.org/wiki/Relational_database_management_system)) to retain the [State](https://en.wikipedia.org/wiki/State_(computer_science)) of To-do Tasks
* The app must implement a [server-side](https://en.wikipedia.org/wiki/Server-side) component that receives requests and processes them against the persistent storage

## Phase III

Your goal is to have different task lists for different users. Additionally you will allow each user to have more than one task list. 

### Functional Requirements

* User Identification
 * Passwords are not required and users can be preloaded in the application. 
 * Users need a way to identify themselves upon visitng the site - they can either type their username in a textbox or selected it from a drop down. 
 * No task list should ever be shown until the user has identified themselves. 
* User Specific Task List
 * Users can only see their task list and cannot see those of others
 * Changes to their task list should not alter the state of any other user task list
* Multiple Task Lists
 * Users should have the ability to create/delete entire Task Lists and all functionality of add/editing/deleting tasks within those lists should apply
 * If a user attempts to delete a Task List with tasks then they should be prompted for confirmation before deleting the list
 * If a user attempts to delete a Task List with no task then no confirmation is required and the list is deleted

### Non-Functional Requirements

* Your persistent storage must be enhance to store user information
* Your server-side implementation should perform user identification and present the user only with information that they own. 

## Sample Circut

Here are few sample projects to draw inspiration:

* [apache/mysql/php](https://github.com/JahnelGroup/php-samples/tree/master/apache-mysql-php)
* [node-express-mysql](https://github.com/JahnelGroup/nodejs-samples/tree/master/node-express-mysql)
* [firebase todo-list](https://github.com/JahnelGroup/firebase-samples/tree/master/todo-list)
* [spring-cli-todo-list](https://github.com/JahnelGroup/spring-cli-samples)
* [spring-boot-thymeleaf](https://github.com/JahnelGroup/spring-boot-samples/tree/master/spring-boot-thymeleaf)
