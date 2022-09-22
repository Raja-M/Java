package com.telanganainfo.contentmanager.service;

import java.util.List;

import com.telanganainfo.contentmanager.entity.TinfoContent;

public interface TinfoContentService {
	
	public List<TinfoContent> fetchTinfoContentList();

	public TinfoContent saveTinfoContent(TinfoContent tinfoContent);

	public TinfoContent fetchTinfoContentById(Long contentId);

	public TinfoContent updateTinfoCotent(Long contentId, TinfoContent tinfoContent);

	public String deleteTinfoCotent(Long contentId);
		

}
