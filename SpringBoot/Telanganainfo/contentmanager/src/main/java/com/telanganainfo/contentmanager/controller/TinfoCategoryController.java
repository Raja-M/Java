package com.telanganainfo.contentmanager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telanganainfo.contentmanager.entity.TinfoCategory;
import com.telanganainfo.contentmanager.service.TinfoCategoryService;

@RestController
public class TinfoCategoryController {
	
	@Autowired
	private TinfoCategoryService tinfoCategoryService;
	
	
	@PostMapping("/tinfocategory")
	public TinfoCategory saveTinfoContent( @Valid @RequestBody TinfoCategory tinfoCategory) {
		return tinfoCategoryService.saveTinfoCategory(tinfoCategory);
		
		
	}

}
