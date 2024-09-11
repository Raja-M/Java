package com.test.controller;

import com.test.entity.TgnContent;
import com.test.service.TgnContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {


	@Autowired
	private TgnContentService tgnContentService;

	@GetMapping("/content")
	public List<TgnContent> content(){

		List<TgnContent> tc = tgnContentService.fetchTgnContentList();


		return tc;


	}
	@GetMapping("/contentid")
	public TgnContent contentById(@RequestParam(name = "id") long reqContentId)throws Exception{

		//TgnContent tc = new TgnContent();
		//tc.setContentid(reqContentId);
		//tc.setContenttitle("title1");
	//	tc.setContentbody("newsbody");
		
		return tc;


	}
}
