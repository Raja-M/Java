package com.telanganainfo.contentmanager.service;

import java.util.List;

import com.telanganainfo.contentmanager.entity.TinfoContent;
import com.telanganainfo.contentmanager.error.TinfoContentNotFoundException;

public interface TinfoContentService {
	
	public List<TinfoContent> fetchTinfoContentList();

	public TinfoContent saveTinfoContent(TinfoContent tinfoContent);

	public TinfoContent fetchTinfoContentByContentId(Long contentId) throws TinfoContentNotFoundException;

	public TinfoContent updateTinfoCotent(Long contentId, TinfoContent tinfoContent);

	public String deleteTinfoCotent(Long contentId);

	public TinfoContent fetchTinfoContentByContentTitle(String contentTitle);
		

}
