package com.test.repository;

import com.test.entity.TgnContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TgnContentRepository  extends JpaRepository<TgnContent, Long>{
	
	public TgnContent findByContenttitle(String contentTitle);
		public TgnContent findByContenttitleIgnoreCase(String contentTitle);
	
	public Page<TgnContent> findByContenttitleContaining(String contentTitle, Pageable pageable);


	
}
