package com.telanganainfo.contentmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telanganainfo.contentmanager.entity.TinfoUser;
import com.telanganainfo.contentmanager.repository.TinfoUserRepository;

@Service
public class TinfoUserServiceImpl implements TinfoUserService {
	
	@Autowired
	TinfoUserRepository tinfouserrepository;

	@Override
	public TinfoUser saveTinfoUser(TinfoUser tinfouser) {
		// TODO Auto-generated method stub
		return tinfouserrepository.save(tinfouser );
	}

	@Override
	public List<TinfoUser> fetchTinfoUserList() {
		// TODO Auto-generated method stub
		return  tinfouserrepository.findAll();
	}
	

}
