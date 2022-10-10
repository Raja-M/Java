package com.telanganainfo.contentmanager.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.telanganainfo.contentmanager.entity.TinfoUser;
import com.telanganainfo.contentmanager.entity.TinfoUserContact;

 

@SpringBootTest
class TinfoUserRepositoryTest {

	@Autowired
	private TinfoUserRepository tinfoUserRepository;
	
	@Test
	public void saveTinfoUserWithGuardian() {
		
		TinfoUserContact tinfoUserContact = new TinfoUserContact();
		tinfoUserContact.setEmail("userTest@email.com");
		tinfoUserContact.setPhone(9999999999L);
		tinfoUserContact.setPhonecountrycode(91);
		tinfoUserContact.setAddresshousenumber("1234");
		tinfoUserContact.setAddressstreet("Test Street");
		tinfoUserContact.setCity("Test City");
		tinfoUserContact.setState("Test State");
		tinfoUserContact.setCountry("Test Country");
		tinfoUserContact.setZipcode("99999-99");
		
		TinfoUser tinfoUser = new TinfoUser();
//		tinfoUser.setUserid(998L);
		tinfoUser.setUserfirstname( "testUser");
		tinfoUser.setUserrole("trole");
		tinfoUser.setUsercreatetime( "2022-10-09 19:22:32");
		tinfoUser.setUserstatus("A");
		tinfoUser.setTinfoUserContact(tinfoUserContact);
		
		TinfoUser tinfoUserSaved =  tinfoUserRepository.save(tinfoUser);
		
		System.out.println("TinfoUser Saved city : " +   tinfoUserSaved.getTinfoUserContact().getCity());
		assertEquals( tinfoUserSaved.getTinfoUserContact().getCity() , "Test City");		
	}
	
	@Test
	public void printAllUsersByCity() {
		
		List<TinfoUser> tinfoUsers = tinfoUserRepository.findByTinfoUserContactCityContaining("Test");
		System.out.println(" User Count by city : " + tinfoUsers.size());
		assertTrue(tinfoUsers.size() > 1 );	
	}
	
	@Test
	public void printAllUsersByEmail() {
		
		List<TinfoUser> tinfoUsers = tinfoUserRepository.getByTinfoUserEmail("userTestUpdatedemail@email.com");
		System.out.println(" User Count by email : " + tinfoUsers.size());
		assertTrue(tinfoUsers.size() > 1 );	
	}
	
	@Test
	public void printAllUsersByEmailNative() {
		
		List<TinfoUser> tinfoUsers = tinfoUserRepository.getByTinfoUserEmailNative("userTestUpdatedemail@email.com");
		System.out.println(" User Count by email : " + tinfoUsers.size());
		assertTrue(tinfoUsers.size() > 1 );	
	}
	
	@Test
	public void updateUseremailByUserfirstname() {
		
		int Res = tinfoUserRepository.updateUseremailByUserfirstname("userTestUpdatedemail@email.com" , "testUser");
		System.out.println(" Update email by name result : " + Res);
		assertTrue(Res > 1 );	
	}
	
	@Test
	public void printUsersWithContent() {
		
		List<TinfoUser> tinfoUser = tinfoUserRepository.findAll();
		
		System.out.println(" User with Content List : " + tinfoUser);
	}
	
}
