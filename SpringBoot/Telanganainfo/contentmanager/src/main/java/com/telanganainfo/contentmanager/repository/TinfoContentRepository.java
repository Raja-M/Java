package com.telanganainfo.contentmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telanganainfo.contentmanager.entity.TinfoContent;

@Repository
public interface TinfoContentRepository  extends JpaRepository<TinfoContent, Long>{
	
	public TinfoContent findByContenttitle(String contentTitle);
	
	public TinfoContent findByContenttitleIgnoreCase(String contentTitle);
}
