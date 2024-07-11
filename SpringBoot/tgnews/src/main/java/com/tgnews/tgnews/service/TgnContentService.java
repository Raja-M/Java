package com.tgnews.tgnews.service;

import com.tgnews.tgnews.entity.TgnContent;
import com.tgnews.tgnews.error.TgnContentNotFoundException;

import java.util.List;


public interface TgnContentService {
	
	public List<TgnContent> fetchTgnContentList();

	public TgnContent saveTgnContent(TgnContent TgnContent);

	public TgnContent fetchTgnContentByContentId(Long contentId) throws TgnContentNotFoundException;

	public TgnContent updateTgnCotent(Long contentId, TgnContent TgnContent);

	public String deleteTgnCotent(Long contentId);

	public TgnContent fetchTgnContentByContentTitle(String contentTitle);
		

}
