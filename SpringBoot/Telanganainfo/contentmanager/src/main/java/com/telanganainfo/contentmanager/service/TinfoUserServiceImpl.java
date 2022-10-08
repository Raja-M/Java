package com.telanganainfo.contentmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telanganainfo.contentmanager.entity.TinfoUser;
import com.telanganainfo.contentmanager.repository.TinfoUserRepository;

@Service
public class TinfoUserServiceImpl implements TinfoUserService {
	
	@Autowired
	private TinfoUserRepository tinfoUserRepository;

	@Override
	public TinfoUser saveTinfoUser(TinfoUser tinfoUser) {
		// TODO Auto-generated method stub
		return tinfoUserRepository.save(tinfoUser );
	}

	@Override
	public List<TinfoUser> fetchTinfoUserList() {
		// TODO Auto-generated method stub
		return  tinfoUserRepository.findAll();
	}

	@Override
	public TinfoUser fetchTinfoUserById(Long userid) {
		// TODO Auto-generated method stub
		return  tinfoUserRepository.findById(userid).get() ;
	}

	@Override
	public TinfoUser updateTinfoUser(Long userid, TinfoUser tinfoUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTinfoUser(Long userid) {
		// TODO Auto-generated method stub
		tinfoUserRepository.deleteById(userid);
		return "User id : " + userid + " Deleted successfully !!" ;
	}

	@Override
	public TinfoUser fetchTinfoUserByUserfirstname(String userfirstname) {
		// TODO Auto-generated method stub
		TinfoUser tinfoUser = tinfoUserRepository.findByUserfirstnameIgnoreCase(userfirstname);
		
		return tinfoUser;
	}
	

}
