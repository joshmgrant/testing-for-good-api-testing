package com.example.saucelogs;

import com.example.saucelogs.sauce.SauceController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class SaucelogsApplicationTests {

	@Autowired
	private SauceController controller;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}

}
