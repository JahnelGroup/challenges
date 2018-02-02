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
 * long time to perform. 
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
