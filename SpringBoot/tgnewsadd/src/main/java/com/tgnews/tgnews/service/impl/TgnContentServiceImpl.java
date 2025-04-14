package com.tgnews.tgnews.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.tgnews.tgnews.entity.TgnContent;
import com.tgnews.tgnews.error.TgnContentNotFoundException;
import com.tgnews.tgnews.repository.TgnContentRepository;
import com.tgnews.tgnews.service.TgnContentService;
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
	public TgnContent updateTgnCotent(Long contentId, TgnContent inTgnContent) {
		// TODO Auto-generated method stub		
		
		TgnContent tgnContent = tgnContentRepository.findById(  contentId).get();
		
		System.out.println( " tgnContent.id :" + tgnContent.getContentid() );
		if(Objects.nonNull( inTgnContent.getContentid() )&&
			 (inTgnContent.getContentid() > 0 )) {
			tgnContent.setContentid( inTgnContent.getContentid());
		}
		
		if(Objects.nonNull( inTgnContent.getContenttitle() )&&
				!"".equalsIgnoreCase( inTgnContent.getContenttitle()  )) {
				tgnContent.setContenttitle( inTgnContent.getContenttitle());
			}
		
		if(Objects.nonNull( inTgnContent.getContentbody() )&&
				!"".equalsIgnoreCase( inTgnContent.getContentbody()  )) {
				tgnContent.setContentbody( inTgnContent.getContentbody());
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
		tgnContent.setContentcreatetime( inTgnContent.getContentcreatetime());
		
		if(Objects.nonNull( inTgnContent.getContentupdatetime() )&&
				!"".equalsIgnoreCase( inTgnContent.getContentupdatetime()  )) {
				tgnContent.setContentupdatetime( inTgnContent.getContentupdatetime());
			}
		
		if(Objects.nonNull( inTgnContent.getContentstatus() )&&
				 (  inTgnContent.getContentstatus() != '\0' )) {
				tgnContent.setContentstatus( inTgnContent.getContentstatus());
			}
		
		if(Objects.nonNull( inTgnContent.getContentcity() )&&
				!"".equalsIgnoreCase( inTgnContent.getContentcity()  )) {
				tgnContent.setContentcity( inTgnContent.getContentcity());
			}
		
		if(Objects.nonNull( inTgnContent.getContentmandal() )&&
				!"".equalsIgnoreCase( inTgnContent.getContentmandal()  )) {
				tgnContent.setContentmandal( inTgnContent.getContentmandal());
			}
		
		if(Objects.nonNull( inTgnContent.getContentplaceid() )&&
				(inTgnContent.getContentplaceid() > 0 )) {
				tgnContent.setContentplaceid( inTgnContent.getContentplaceid());
			}
		
		if(Objects.nonNull( inTgnContent.getContentpicurl() )&&
				!"".equalsIgnoreCase( inTgnContent.getContentpicurl()  )) {
				tgnContent.setContentpicurl( inTgnContent.getContentpicurl());
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
