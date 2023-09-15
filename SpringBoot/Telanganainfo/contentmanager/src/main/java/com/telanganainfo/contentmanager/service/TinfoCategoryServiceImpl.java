package com.telanganainfo.contentmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telanganainfo.contentmanager.entity.TinfoCategory;
import com.telanganainfo.contentmanager.repository.TinfoCategoryRepository;

@Service
public class TinfoCategoryServiceImpl implements TinfoCategoryService {
	
	@Autowired
	private TinfoCategoryRepository tinfoCategoryRepository;

	@Override
	public  TinfoCategory saveTinfoCategory(TinfoCategory tinfoCategory) {
		// TODO Auto-generated method stub
		return tinfoCategoryRepository.save(tinfoCategory) ;
	}


	

}
