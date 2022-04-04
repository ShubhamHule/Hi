package com.zensar.webapp.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloRestControllerTest {

	@Autowired // To enable autowiring for MockMvc test class must be annotated with
				// @AutoConfigureMockMvc
	private MockMvc mock; // MockMvc is a class given by spring mvc to do perform testing of spring
							// controller

	@Test
	public void getmessageTest() throws Exception {
		mock.perform(MockMvcRequestBuilders.get("/Hello")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Welcome to Devops"));
	}

	@Test
	public void postCreateMessage() throws Exception {
		mock.perform(MockMvcRequestBuilders.post("/greet").content("Hello"))
				.andExpect(MockMvcResultMatchers.status().isCreated())
				.andExpect(MockMvcResultMatchers.content().string("Message Created Hello"));
	}
}
