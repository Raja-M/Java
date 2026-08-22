package com.telanganainfo.contentmanager.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telanganainfo.contentmanager.entity.TinfoUser;

@Repository
public interface TinfoUserRepository extends JpaRepository<TinfoUser, Long>{
	
	public TinfoUser findByUserfirstname(String userfirstname); 
	
	public TinfoUser findByUserfirstnameIgnoreCase(String userfirstname); 
	
	public List<TinfoUser> findByUserfirstnameContaining(String username);
	
	public List<TinfoUser> findByTinfoUserContactCityContaining(String usercity);
	
	// JPQL  you can do u.firstname etc., and return appropriate entity class.
	@Query("select u  from TinfoUser u where u.tinfoUserContact.email = ?1")
	public List<TinfoUser> getByTinfoUserEmail(String email);
	
	// Native SQL   you can do u.firstname etc., and return appropriate entity class.
	@Query(
//			value = "select *  from tinfouser u where u.useremail = ?1",
			value = "select *  from tinfouser u where u.useremail = :emailid",
			nativeQuery = true
			)
//	public List<TinfoUser> getByTinfoUserEmailNative(String mailid);

	public List<TinfoUser> findAll(){
		return "select *  from tinfouser "
	}
	public List<TinfoUser> getByTinfoUserEmailNative( name @Param("emailid") String mailid);
	
	
	@Modifying
	@Transactional
	@Query(
			value="update tinfouser "
					+ "set useremail = :emailid "
					+ "where userfirstname = :fname",
			nativeQuery = true			
			)
	int updateUseremailByUserfirstname(@Param("emailid") String mailid, @Param("fname") String firstname);
}
