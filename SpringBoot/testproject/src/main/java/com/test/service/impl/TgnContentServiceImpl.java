package com.test.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.test.service.TgnContentService;
import com.test.entity.TgnContent;
import com.test.error.TgnContentNotFoundException;
import com.test.repository.TgnContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TgnContentServiceImpl implements TgnContentService {
	
	@Autowired
	private TgnContentRepository tgnContentRepository;
	
	@Override
	public List<TgnContent> fetchTgnContentList() {
		// TODO Auto-generated method stub
		List<TgnContent> tc = tgnContentRepository.findAll();		
 
		 return tc;
	}

	@Override
	public TgnContent fetchTgnContentByContentId(Long contentId) throws TgnContentNotFoundException {
		// TODO Auto-generated method stub
		Optional<TgnContent> tgnContent = tgnContentRepository.findById(contentId);
		if (!tgnContent.isPresent()) {
			throw  new TgnContentNotFoundException("TgnContent Not Found");
			
			
		}
		return tgnContent.get();
	}

	@Override
	public TgnContent saveTgnContent(TgnContent TgnContent) {
		// TODO Auto-generated method stub
		return  tgnContentRepository.save(TgnContent);
	}
	
	@Override
	public TgnContent updateTgnCotent(Long contentId, TgnContent TgnContent) {
		// TODO Auto-generated method stub		
		
		TgnContent tgnContent = tgnContentRepository.findById(  contentId).get();
		
		System.out.println( " tgnContent.id :" + tgnContent.getContentid() );
		if(Objects.nonNull( TgnContent.getContentid() )&& 
			 (TgnContent.getContentid() > 0 )) {
			tgnContent.setContentid( TgnContent.getContentid());
		}
		
		if(Objects.nonNull( TgnContent.getContenttitle() )&& 
				!"".equalsIgnoreCase( TgnContent.getContenttitle()  )) {
				tgnContent.setContenttitle( TgnContent.getContenttitle());
			}
		
		if(Objects.nonNull( TgnContent.getContentbody() )&& 
				!"".equalsIgnoreCase( TgnContent.getContentbody()  )) {
				tgnContent.setContentbody( TgnContent.getContentbody());
			}
		/*
		if(Objects.nonNull( TgnContent.getContenteditorid() )&& 
				(TgnContent.getContenteditorid() > 0 )) {
				tgnContent.setContenteditorid( TgnContent.getContenteditorid());
			}

		if(Objects.nonNull( TgnContent.getContentapproverid() )&& 
				(TgnContent.getContentapproverid() > 0 )) {
				tgnContent.setContentapproverid( TgnContent.getContentapproverid());
			}
		*/
		tgnContent.setContentcreatetime( TgnContent.getContentcreatetime());
		
		if(Objects.nonNull( TgnContent.getContentupdatetime() )&& 
				!"".equalsIgnoreCase( TgnContent.getContentupdatetime()  )) {
				tgnContent.setContentupdatetime( TgnContent.getContentupdatetime());
			}
		
		if(Objects.nonNull( TgnContent.getContentstatus() )&& 
				 (  TgnContent.getContentstatus() != '\0' )) {
				tgnContent.setContentstatus( TgnContent.getContentstatus());
			}
		
		if(Objects.nonNull( TgnContent.getContentcity() )&& 
				!"".equalsIgnoreCase( TgnContent.getContentcity()  )) {
				tgnContent.setContentcity( TgnContent.getContentcity());
			}
		
		if(Objects.nonNull( TgnContent.getContentmandal() )&& 
				!"".equalsIgnoreCase( TgnContent.getContentmandal()  )) {
				tgnContent.setContentmandal( TgnContent.getContentmandal());
			}
		
		if(Objects.nonNull( TgnContent.getContentplaceid() )&& 
				(TgnContent.getContentplaceid() > 0 )) {
				tgnContent.setContentplaceid( TgnContent.getContentplaceid());
			}
		
		if(Objects.nonNull( TgnContent.getContentpicurl() )&& 
				!"".equalsIgnoreCase( TgnContent.getContentpicurl()  )) {
				tgnContent.setContentpicurl( TgnContent.getContentpicurl());
			}
		
		return  tgnContentRepository.save(tgnContent);
		
	}

	@Override
	public String deleteTgnCotent(Long contentId) {
		// TODO Auto-generated method stub
		  tgnContentRepository.deleteById(contentId); 
		  return "contentId : " + contentId + " Deleted Successfully." ;
	}

	@Override
	public TgnContent fetchTgnContentByContentTitle(String contentTitle) {
		// TODO Auto-generated method stub
		
		TgnContent TgnContent = tgnContentRepository.findByContenttitleIgnoreCase(contentTitle);
//		System.out.println( " Content : " + TgnContent.toString()) ;
		
		return TgnContent;
	}
}
