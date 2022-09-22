package com.telanganainfo.contentmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telanganainfo.contentmanager.entity.TinfoContent;
import com.telanganainfo.contentmanager.entity.TinfoUser;
import com.telanganainfo.contentmanager.service.TinfoContentService;

 
@RestController
public class TinfoContentController {
	
	@Autowired
	private TinfoContentService tinfoContentService;
	
	@GetMapping("/tinfocontent")
	public List<TinfoContent> fetchTinfoContent( ) {
		
		 List<TinfoContent> tc = tinfoContentService.fetchTinfoContentList();
		 
	 
		 return tc;
	}
	
	@GetMapping("/tinfocontent/{id}")
	public TinfoContent fetchTinfoContentById( @PathVariable("id") Long contentId) {
		return tinfoContentService.fetchTinfoContentById( contentId);
	}
	
	@PostMapping("/tinfocontent")
	public  TinfoContent saveTinfoContent(@RequestBody TinfoContent tinfoContent ) {
		
		return tinfoContentService.saveTinfoContent(tinfoContent);
		
	}
		 
	@PutMapping("/tinfocontent/{id}")
	public TinfoContent	updateTinfoContent( @PathVariable("id") Long contentId,
										   @RequestBody TinfoContent tinfoContent) {
 
		return tinfoContentService.updateTinfoCotent(contentId, tinfoContent);
		 
	}
	
	@DeleteMapping("/tinfocontent/{id}")
	public String	deleteTinfoContent( @PathVariable("id") Long contentId ) {
		 
		return tinfoContentService.deleteTinfoCotent(contentId );
		 
	}
		 
		 
		 
	
	
	 
}
