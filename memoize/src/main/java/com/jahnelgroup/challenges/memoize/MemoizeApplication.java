package com.jahnelgroup.challenges.memoize;

import com.jahnelgroup.challenges.memoize.user.User;
import com.jahnelgroup.challenges.memoize.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Memoize Challenge
 *
 * In programming there is the concept of 'expensive operations' which take a
 * long time to perform. A common of example of this a round-trip to the database
 * for retrieving or storing information. There are many ways to overcome this and
 * this challenge presents you with the opportunity to explore them.
 *
 * Requirements:
 *
 * The UserService class is the primary component that your application will use to
 * retrieve user's from the database. It has two methods:
 *
 * 		findById(Long id) - Returns a user by their primary ID
 *
 * 		findByName(String name) - Returns a user by their name
 *
 * First Challenge:
 *
 * Your first challenge is to remember users that are retrieve from the database and return them
 * from memory on subsequent calls rather than going back to the database.
 *
 *      // First Invocation - should hit the database and return the user
 * 		userService.findById(1L);
 *
 * 		// Second Invocation - should not hit the database, rather it should return immediately from memory
 * 		userService.findById(1L); // from memory
 *
 * Second Challenge:
 *
 * To complicate the solution the userService allows you to retrieve users by ID as well as name. If a user
 * was returned by id first, a subsequent request for that same user by their name should not hit the database either.
 *
 * 		// First Invocation - should hit the database and return the user
 * 		userService.findById(1L); // returns Steven
 *
 * 		// Second Invocation - should not hit the database, rather it should return immediately from memory
 * 		userService.findByName("Steven"); // from memory because Steven's ID is 1
 */
@SpringBootApplication
public class MemoizeApplication implements ApplicationRunner {

	private Logger logger = LoggerFactory.getLogger(MemoizeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MemoizeApplication.class, args);
	}

	@Autowired
	UserService userService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("======================================");
		System.out.println("Memoize Challenge");
		System.out.println("======================================");

		User steven = userService.findByName("Steven");
		System.out.println(steven);

		User darrin = userService.findByName("Darrin");
		System.out.println(darrin);

		//
		// This should be returned from memory instead of the database.
		//
		User stevenFromMemory = userService.findById(1L);
		System.out.println(stevenFromMemory);
	}
}
