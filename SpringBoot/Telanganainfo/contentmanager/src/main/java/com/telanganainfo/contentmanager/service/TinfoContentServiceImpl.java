package com.telanganainfo.contentmanager.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telanganainfo.contentmanager.entity.TinfoContent;
import com.telanganainfo.contentmanager.repository.TinfoContentRepository;

@Service
public class TinfoContentServiceImpl implements TinfoContentService{

		 
		
	
	@Autowired
	private TinfoContentRepository tinfoContentRepository;
	
	@Override
	public List<TinfoContent> fetchTinfoContentList() {
		// TODO Auto-generated method stub
		List<TinfoContent> tc = tinfoContentRepository.findAll();
		
 
		 return tc;
	}
	

	@Override
	public TinfoContent fetchTinfoContentById(Long contentId) {
		// TODO Auto-generated method stub
		Optional<TinfoContent> tinfoContent = tinfoContentRepository.findById(contentId);
		if (!tinfoContent.isPresent()) {
			throw TinfoContentNotFoundException;
			
			
		}
	}

	@Override
	public TinfoContent saveTinfoContent(TinfoContent tinfoContent) {
		// TODO Auto-generated method stub
		return  tinfoContentRepository.save(tinfoContent);
	}


	@Override
	public TinfoContent updateTinfoCotent(Long contentId, TinfoContent tinfoContent) {
		// TODO Auto-generated method stub
 
		
		
		TinfoContent tiContent = tinfoContentRepository.findById(contentId).get();
		
		System.out.println( " tiContent.id :" + tiContent.getContentid() );
		if(Objects.nonNull( tinfoContent.getContentid() )&& 
			 (tinfoContent.getContentid() > 0 )) {
			tiContent.setContentid( tinfoContent.getContentid());
		}
		
		if(Objects.nonNull( tinfoContent.getContenttitle() )&& 
				!"".equalsIgnoreCase( tinfoContent.getContenttitle()  )) {
				tiContent.setContenttitle( tinfoContent.getContenttitle());
			}
		
		if(Objects.nonNull( tinfoContent.getContentbody() )&& 
				!"".equalsIgnoreCase( tinfoContent.getContentbody()  )) {
				tiContent.setContentbody( tinfoContent.getContentbody());
			}
		
		if(Objects.nonNull( tinfoContent.getContenteditorid() )&& 
				(tinfoContent.getContenteditorid() > 0 )) {
				tiContent.setContenteditorid( tinfoContent.getContenteditorid());
			}

		if(Objects.nonNull( tinfoContent.getContentapproverid() )&& 
				(tinfoContent.getContentapproverid() > 0 )) {
				tiContent.setContentapproverid( tinfoContent.getContentapproverid());
			}
		
		tiContent.setContentcreatetime( tinfoContent.getContentcreatetime());
		
		if(Objects.nonNull( tinfoContent.getContentupdatetime() )&& 
				!"".equalsIgnoreCase( tinfoContent.getContentupdatetime()  )) {
				tiContent.setContentupdatetime( tinfoContent.getContentupdatetime());
			}
		
		if(Objects.nonNull( tinfoContent.getContentstatus() )&& 
				 (  tinfoContent.getContentstatus() != '\0' )) {
				tiContent.setContentstatus( tinfoContent.getContentstatus());
			}
		
		if(Objects.nonNull( tinfoContent.getContentcity() )&& 
				!"".equalsIgnoreCase( tinfoContent.getContentcity()  )) {
				tiContent.setContentcity( tinfoContent.getContentcity());
			}
		
		if(Objects.nonNull( tinfoContent.getContentmandal() )&& 
				!"".equalsIgnoreCase( tinfoContent.getContentmandal()  )) {
				tiContent.setContentmandal( tinfoContent.getContentmandal());
			}
		
		if(Objects.nonNull( tinfoContent.getContentplaceid() )&& 
				(tinfoContent.getContentplaceid() > 0 )) {
				tiContent.setContentplaceid( tinfoContent.getContentplaceid());
			}
		
		if(Objects.nonNull( tinfoContent.getContentpicurl() )&& 
				!"".equalsIgnoreCase( tinfoContent.getContentpicurl()  )) {
				tiContent.setContentpicurl( tinfoContent.getContentpicurl());
			}
		
		return  tinfoContentRepository.save(tiContent);
	
		
	}


	@Override
	public String deleteTinfoCotent(Long contentId) {
		// TODO Auto-generated method stub
		  tinfoContentRepository.deleteById(contentId); 
		  return "contentId : " + contentId + " Deleted Successfully." ;
	}
 
	
	

}
