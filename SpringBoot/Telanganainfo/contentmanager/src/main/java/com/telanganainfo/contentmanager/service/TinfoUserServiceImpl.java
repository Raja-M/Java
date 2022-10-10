package com.telanganainfo.contentmanager.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telanganainfo.contentmanager.entity.TinfoUser;
import com.telanganainfo.contentmanager.entity.TinfoUserContact;
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
		
		TinfoUser tinfoUserFetched = tinfoUserRepository.findById(userid).get();
		
		if ( Objects.nonNull(tinfoUserFetched) && Objects.nonNull(tinfoUser)) {
			
			if ( Objects.nonNull(tinfoUser.getUsercreatetime()) &&
				 !"".equalsIgnoreCase(tinfoUser.getUsercreatetime() )
					) {
				tinfoUserFetched.setUsercreatetime(tinfoUser.getUsercreatetime() );
			}
			if ( Objects.nonNull(tinfoUser.getUserfirstname() ) &&
					 !"".equalsIgnoreCase(tinfoUser.getUserfirstname() )
						) {
					tinfoUserFetched.setUserfirstname(tinfoUser.getUserfirstname() );
				}
			if ( Objects.nonNull(tinfoUser.getUserlastname() ) &&
					 !"".equalsIgnoreCase(tinfoUser.getUserlastname() )
						) {
					tinfoUserFetched.setUserlastname(tinfoUser.getUserlastname() );
				}
			if ( Objects.nonNull(tinfoUser.getUsermodifiedtime() ) &&
					 !"".equalsIgnoreCase(tinfoUser.getUsermodifiedtime() )
						) {
					tinfoUserFetched.setUsermodifiedtime(tinfoUser.getUsermodifiedtime() );
				}
			if ( Objects.nonNull(tinfoUser.getUserrole() ) &&
					 !"".equalsIgnoreCase(tinfoUser.getUserrole() )
						) {
					tinfoUserFetched.setUserrole(tinfoUser.getUserrole() );
				}
			if ( Objects.nonNull(tinfoUser.getUserstatus() ) &&
					 !"".equalsIgnoreCase(tinfoUser.getUserstatus() )
						) {
					tinfoUserFetched.setUserstatus(tinfoUser.getUserstatus() );
				}
			
			TinfoUserContact tinfoUserContact = tinfoUser.getTinfoUserContact();
			
			TinfoUserContact tinfoUserContactFetched = tinfoUserFetched.getTinfoUserContact();
			
			if ( Objects.nonNull( tinfoUserContact ))  {
				
				if (  Objects.nonNull(tinfoUserContact.getAddressaptorsuiteno() ) &&
						 !"".equalsIgnoreCase(tinfoUserContact.getAddressaptorsuiteno() )
						) {
					tinfoUserContactFetched.setAddressaptorsuiteno(tinfoUserContact.getAddressaptorsuiteno() );  
				}
				if (  Objects.nonNull(tinfoUserContact.getAddresshousenumber()  ) &&
						 !"".equalsIgnoreCase(tinfoUserContact.getAddresshousenumber() )
						) {
					tinfoUserContactFetched.setAddresshousenumber(tinfoUserContact.getAddresshousenumber() );  
				}
				if (  Objects.nonNull(tinfoUserContact.getAddressstreet() ) &&
						 !"".equalsIgnoreCase(tinfoUserContact.getAddressstreet() )
						) {
					tinfoUserContactFetched.setAddressstreet(tinfoUserContact.getAddressstreet() );  
				}
				if (  Objects.nonNull(tinfoUserContact.getAlternatephone() ) &&
						  (tinfoUserContact.getAlternatephone() > 0 )
						) {
					tinfoUserContactFetched.setAlternatephone(tinfoUserContact.getAlternatephone() );  
				}
				if (  Objects.nonNull(tinfoUserContact.getCity() ) &&
						 !"".equalsIgnoreCase(tinfoUserContact.getCity() )
						) {
					tinfoUserContactFetched.setCity(tinfoUserContact.getCity() );  
				}
				if (  Objects.nonNull(tinfoUserContact.getCountry() ) &&
						 !"".equalsIgnoreCase(tinfoUserContact.getCountry() )
						) {
					tinfoUserContactFetched.setCountry(tinfoUserContact.getCountry() );  
				}
				if (  Objects.nonNull(tinfoUserContact.getEmail() ) &&
						 !"".equalsIgnoreCase(tinfoUserContact.getEmail() )
						) {
					tinfoUserContactFetched.setEmail(tinfoUserContact.getEmail() );  
				}
				if (  Objects.nonNull(tinfoUserContact.getPhone() ) &&
						  tinfoUserContact.getPhone() > 0 )
						 {
					tinfoUserContactFetched.setPhone(tinfoUserContact.getPhone() );  
				}
				if (  Objects.nonNull(tinfoUserContact.getState() ) &&
						 !"".equalsIgnoreCase(tinfoUserContact.getState() )
						) {
					tinfoUserContactFetched.setState(tinfoUserContact.getState() );  
				}
				if (  Objects.nonNull(tinfoUserContact.getZipcode() ) &&
						 !"".equalsIgnoreCase(tinfoUserContact.getZipcode() )
						) {
					tinfoUserContactFetched.setZipcode(tinfoUserContact.getZipcode() );  
				}
				if (  Objects.nonNull(tinfoUserContact.getPhonecountrycode() ) &&
						  (tinfoUserContact.getPhonecountrycode() > 0)
						) {
					tinfoUserContactFetched.setPhonecountrycode(tinfoUserContact.getPhonecountrycode() );  
				}
				 
				tinfoUserFetched.setTinfoUserContact(tinfoUserContactFetched);
					 
			} 
			
				
		}else {
			return null;
		}
		
		return  tinfoUserRepository.save( tinfoUserFetched );
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
	
	@Override
	public List<TinfoUser> findByUserfirstnameContaining(String username){
		
		return tinfoUserRepository.findByUserfirstnameContaining(username) ;
		 
	}
	@Override
	public List<TinfoUser> findByTinfoUserContactCityContaining(String usercity){
		return tinfoUserRepository.findByTinfoUserContactCityContaining(usercity);
	}
	@Override
	public List<TinfoUser> getByTinfoUserEmail(String email){
		return tinfoUserRepository.getByTinfoUserEmail(email);
	}

	@Override
	public List<TinfoUser> getByTinfoUserEmailNative(String mailid) {
		// TODO Auto-generated method stub
		return tinfoUserRepository.getByTinfoUserEmailNative(mailid);
	}

	@Override
	public int updateUseremailByUserfirstname(String mailid, String firstname) {
		// TODO Auto-generated method stub
		return tinfoUserRepository.updateUseremailByUserfirstname(mailid, firstname);
	}
	
	
}
