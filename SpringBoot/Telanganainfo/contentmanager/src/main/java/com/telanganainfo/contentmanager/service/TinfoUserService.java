package com.telanganainfo.contentmanager.service;


import java.util.List;

import com.telanganainfo.contentmanager.entity.TinfoUser;

public interface TinfoUserService {

	public TinfoUser saveTinfoUser(TinfoUser tinfouser);

	public List<TinfoUser> fetchTinfoUserList();

}
