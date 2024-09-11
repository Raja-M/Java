package com.test;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class TgnewsApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@DisplayName("Demo Test")
	public void contextLoads() {
		System.out.println("Test1");
		String str = "Test String";
		assertEquals( "Test String", str);

	}
	@Test
	@DisplayName("Root Controller Test MVC")
	public void shouldReturnResponseMvc() throws Exception {

		this.mockMvc.perform(MockMvcRequestBuilders.get("/content"))
				.andDo(print())
				.andExpect( status().is(200))
				.andExpect( content().string(containsString("content title")));
	}

	@Test
	@Disabled
	@DisplayName("Root Controller Test Rest")
	public void shouldReturnResponseRestTemplate() throws Exception {
		assert( this.restTemplate.getForObject("http://localhost:8080/content", List.class).contains(  "content title"));


	}

}
