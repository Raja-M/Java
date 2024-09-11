package com.tgnews.tgnews.controller;

import com.tgnews.tgnews.entity.TgnContent;
import com.tgnews.tgnews.service.TgnContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContentManagerController {


	@Autowired
	private TgnContentService tgnContentService;

	@PostMapping("/contentadd")
	//public ResponseEntity<TgnContent> postContent(@RequestBody TgnContent tgnContent){
	   public TgnContent postContent(@RequestBody TgnContent tgnContent){
		System.out.println(tgnContent);
		TgnContent tc = tgnContentService.saveTgnContent(tgnContent);

         return tc;

	}

	@PutMapping("/contentupdate")
	public TgnContent updateConentById(@RequestParam(name = "id") long reqContentId, @RequestBody TgnContent tgnContent)throws Exception{

		//TgnContent tc = new TgnContent();
		//tc.setContentid(reqContentId);
		//tc.setContenttitle("title1");
		//	tc.setContentbody("newsbody");

		TgnContent tc = tgnContentService.updateTgnCotent(reqContentId, tgnContent);
		return tc;


	}


}
