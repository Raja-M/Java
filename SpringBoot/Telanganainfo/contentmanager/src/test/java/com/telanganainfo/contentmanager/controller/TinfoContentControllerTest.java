package com.telanganainfo.contentmanager.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.telanganainfo.contentmanager.entity.TinfoContent;
import com.telanganainfo.contentmanager.error.TinfoContentNotFoundException;
import com.telanganainfo.contentmanager.service.TinfoContentService;

@WebMvcTest(TinfoContentController.class )
class TinfoContentControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private TinfoContentService tinfoContentService;
	
	private TinfoContent tinfoContent;
	
	@BeforeEach
	void setup() {
		tinfoContent = new TinfoContent();
		tinfoContent.setContentid(1L);
		tinfoContent.setContenttitle("Test Content Title");
	}
	@Test
	void saveTinfoContent() throws Exception {
		
		TinfoContent inputTinfoContent = new TinfoContent();
		inputTinfoContent.setContentid(1L);
		inputTinfoContent.setContenttitle("Test Content Title");
		
		Mockito.when(tinfoContentService.saveTinfoContent(inputTinfoContent )   )
			    .thenReturn(tinfoContent);
		
		mockMvc.perform( post("/tinfocontent")
				.contentType(MediaType.APPLICATION_JSON)
				.content( "{\n" +
			        "\t\"contentid\": 1, \n" +
			        "\t\"contenttitle\": \"Test Content Title\" \n" +        
			         "}")).andExpect(  status().isOk());
		
	}
	@Test
//	@Disabled
	void fetchTinfoContentByContentId() throws Exception {
		
		Mockito.when(  tinfoContentService.fetchTinfoContentByContentId(1L))
		        .thenReturn(tinfoContent);
		
	
		mockMvc.perform( get(  "/tinfocontent/1")
				.contentType(MediaType.APPLICATION_JSON)					
				).andExpect(  status().isOk());
	}
}
