package com.telanganainfo.contentmanager.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.telanganainfo.contentmanager.entity.TinfoContent;
import com.telanganainfo.contentmanager.repository.TinfoContentRepository;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TinfoContentServiceTest {
	
	@Autowired
	private TinfoContentService tinfoContentService;
	
	@MockBean
	private TinfoContentRepository tinfoContentRepository;	

	@BeforeAll
	void setUP() {
		TinfoContent tinfoContent = new TinfoContent();
		tinfoContent.setContentid(10L);
		tinfoContent.setContenttitle("Test Content Title");
		
		Mockito.when(tinfoContentService.fetchTinfoContentByContentTitle("Test Content Title" )  )
			    .thenReturn(tinfoContent);
		
	}
	@Test
	@DisplayName("Get Data based on Content Title")
	public void WhenValidContentTitle_ThenContentShouldFound() {
		String contentTitle = "Test Content Title";
		TinfoContent found = tinfoContentService.fetchTinfoContentByContentTitle(contentTitle);
		 
		assertEquals( found.getContenttitle() , contentTitle  );
		
	}
	
}
