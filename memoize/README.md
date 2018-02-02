# Memoize Challenge

In programming there is the concept of an expensive operation which take a
long time to perform. A common of example of this a round-trip to the database
for retrieving or storing information. There are many ways to overcome this and
this challenge presents you with the opportunity to explore them.

## Requirements:

The **UserService** class is the primary component that your application will use to
retrieve user's from the database. It has two methods:

* **findById(Long id)** - Returns a user by their primary id

* **findByName(String name)** - Returns a user by their name

## First Challenge:

Your first challenge is to remember users that are retrieve from the database and return them
from memory on subsequent calls rather than going back to the database.

```java
  // First Invocation - should hit the database and return the user
  userService.findById(1L);

  // Second Invocation - should not hit the database, rather it should return immediately from memory
  userService.findById(1L); // from memory
```

## Second Challenge:

To complicate the solution the UserService allows you to retrieve users by their id as well as name. If a user
was returned by id first, a subsequent request for that same user by their name should not hit the database either.

```java
  // First Invocation - should hit the database and return the user
  userService.findById(1L); // returns Steven

  // Second Invocation - should not hit the database, rather it should return immediately from memory
  userService.findByName("Steven"); // from memory because Steven's ID is 1
```
