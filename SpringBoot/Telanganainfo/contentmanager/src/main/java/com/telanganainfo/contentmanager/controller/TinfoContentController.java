package com.telanganainfo.contentmanager.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telanganainfo.contentmanager.entity.TinfoContent;
import com.telanganainfo.contentmanager.entity.TinfoUser;
import com.telanganainfo.contentmanager.error.TinfoContentNotFoundException;
import com.telanganainfo.contentmanager.service.TinfoContentService;

 
@RestController
public class TinfoContentController {
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	
	@Autowired
	private TinfoContentService tinfoContentService;
	
	private final Logger LOGGER = LoggerFactory.getLogger(  TinfoContentController.class );
	
	
	@GetMapping("/tinfocontent")
	public List<TinfoContent> fetchTinfoContent( ) {
		
		System.out.println( "Welcome message : " + welcomeMessage);
		
		 List<TinfoContent> tc = tinfoContentService.fetchTinfoContentList();
		 
	 
		 return tc;
	}
	
	@GetMapping("/tinfocontent/{id}")
	public TinfoContent fetchTinfoContentByContentId( @PathVariable("id") Long contentId) throws TinfoContentNotFoundException {
		LOGGER.info("In fetchTinfoContentByContentId");
		return tinfoContentService.fetchTinfoContentByContentId( contentId);
	}
	
	@GetMapping("/tinfocontent/contenttitle/{contenttitle}")
	public TinfoContent fetchTinfoContentByContentTitle( @PathVariable("contenttitle") String contentTitle) throws TinfoContentNotFoundException {
		LOGGER.info("In fetchTinfoContentByContentTitle");
		return tinfoContentService.fetchTinfoContentByContentTitle( contentTitle);
	}
	
	
	@PostMapping("/tinfocontent")
	public  TinfoContent saveTinfoContent(@Valid @RequestBody TinfoContent tinfoContent ) {
		LOGGER.info("In saveTinfoContent");
		return tinfoContentService.saveTinfoContent(tinfoContent);
		
	}
		 
	@PutMapping("/tinfocontent/{id}")
	public TinfoContent	updateTinfoContent( @PathVariable("id") Long contentId,
										   @RequestBody TinfoContent tinfoContent) {
		LOGGER.info("In updateTinfoContent");
		LOGGER.error("Updating TinfoContent..... !!");
		return tinfoContentService.updateTinfoCotent(contentId, tinfoContent);
		 
	}
	
	@DeleteMapping("/tinfocontent/{id}")
	public String	deleteTinfoContent( @PathVariable("id") Long contentId ) {
		LOGGER.info("In delete TinfoContent");
		LOGGER.error("deleting TinfoContent..... !!");		 
		return tinfoContentService.deleteTinfoCotent(contentId );
		 
	}	 
}
