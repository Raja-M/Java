package com.tgnews.tgnews.controller;

import com.tgnews.tgnews.entity.TgnContent;
import com.tgnews.tgnews.service.TgnContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentManagerController {


	@Autowired
	private TgnContentService tgnContentService;

	@GetMapping("/content")
	public List<TgnContent> content(){

		List<TgnContent> tc = tgnContentService.fetchTgnContentList();


		return tc;


	}
}
