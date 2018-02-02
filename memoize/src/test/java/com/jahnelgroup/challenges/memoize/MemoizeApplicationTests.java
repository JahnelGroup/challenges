package com.jahnelgroup.challenges.memoize;

import com.jahnelgroup.challenges.memoize.user.UserRepository;
import com.jahnelgroup.challenges.memoize.user.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemoizeApplicationTests {

	@Spy JdbcTemplate jdbcTemplateSpy;

	UserService userService;

	@Before
	public void before(){
		userService = new UserService(new UserRepository(jdbcTemplateSpy));
	}

	@Test
	public void todo() {
	}

}
