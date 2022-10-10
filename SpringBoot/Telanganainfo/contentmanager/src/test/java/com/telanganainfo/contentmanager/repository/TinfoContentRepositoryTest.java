package com.telanganainfo.contentmanager.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.telanganainfo.contentmanager.entity.TinfoCategory;
import com.telanganainfo.contentmanager.entity.TinfoContent;
import com.telanganainfo.contentmanager.entity.TinfoUser;
import com.telanganainfo.contentmanager.entity.TinfoUserContact;

import lombok.ToString;



//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
class TinfoContentRepositoryTest {
	
	@Autowired
	private TinfoContentRepository tinfoContentRepository;
	
	@Autowired
	private TinfoUserRepository tinfoUserRepository;
	
/*	@Autowired
	private TestEntityManager entityManager;
	

	@BeforeEach
	void setup() {
		
		TinfoContent tinfoContent = new TinfoContent();
		tinfoContent.setContentid(30L);
		tinfoContent.setContenttitle("TestRepo Content Title");
		
		entityManager.persist(tinfoContent);
		
	}
	
	@Test
	@Disabled
	public void whenFindById_thenReturnTinfoContent() {
		System.out.println(" In whenFindById_thenReturnTinfoContent " );
		TinfoContent tinfoContent = tinfoContentRepository.findById(30L).get();

 //		TinfoContent tinfoContent = tinfocontentrepository.findByContenttitleIgnoreCase( "TestRepo Content Title");
 		System.out.println(" ID : " + tinfoContent.getContentid());
		assertEquals( tinfoContent.getContenttitle(), "TestRepo Content Title");
	}
*/	
	@Test
	@Disabled
	public void saveTinfoContent() {
		
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

//		Cascade = cascadeType.persist will takecare of saving tinfouser.		
//		TinfoUser tinfoUserSaved =  tinfoUserRepository.save(tinfoUser);
//		System.out.println(" TinfoUser userid : " + tinfoUserSaved.getUserid() + " user name : " + tinfoUserSaved.getUserfirstname() );
//		assertEquals( tinfoUserSaved.getUserfirstname(), "testUser" );
		

		TinfoContent tinfoContent = new TinfoContent();
		tinfoContent.setContenttitle("TestRepo Content Title");
		tinfoContent.setContentbody("TestRepo Content Body with conent details ");
		tinfoContent.setContenteditor(tinfoUser);
		tinfoContent.setContentapprover(tinfoUser);
		
		TinfoCategory tinfoCategory = new TinfoCategory();
		tinfoCategory.setCategorycreatedby(1);
		tinfoCategory.setCategorydescription("Politics");
		tinfoCategory.setCategoryupdatetime( "2022-10-09 19:22:32");
		
		tinfoContent.addTinfoCategories(tinfoCategory);
		
		TinfoContent tinfoContentSaved = tinfoContentRepository.save( tinfoContent );
		System.out.println(" TinfoContentSaved Title : " + tinfoContentSaved.getContenttitle());
		assertEquals( tinfoContentSaved.getContenttitle(), "TestRepo Content Title" );
	}	
	
	@Test
	public void fetchAllTinfoContents() {
		List<TinfoContent> tinfoContents = tinfoContentRepository.findAll();
		
		System.out.println( " Tinfo Contents : " + tinfoContents);
	}
	
	@Test
	@Disabled
	public void fetchAllPagesTinfoContents() {
		
		Pageable firstPageWithThreeRecords = PageRequest.of(0, 5);
		Pageable secondPageWithThreeRecords = PageRequest.of(1, 5);
		
		
				
		List<TinfoContent> tinfoContents = tinfoContentRepository.findAll(firstPageWithThreeRecords).getContent();
		
		long totalElements = tinfoContentRepository.findAll(firstPageWithThreeRecords).getTotalElements();
		
		long totalPages = tinfoContentRepository.findAll(firstPageWithThreeRecords).getTotalPages();
		
		System.out.println("Total Elements : " + totalElements );
		
		System.out.println("Total Pages : " + totalPages ) ;
		
		System.out.println( " Tinfo Contents page 1 : " + tinfoContents);
		tinfoContents = tinfoContentRepository.findAll(secondPageWithThreeRecords).getContent();
		System.out.println( " Tinfo Contents page 2 : " + tinfoContents);
		
	}
	@Test
	@Disabled
	public void fetchAllPagesBySortTinfoContents() {
		
		Pageable sortByTitle = PageRequest.of(0, 5, Sort.by("contenttitle"));
		Pageable sortByContentcreatetime = PageRequest.of(0, 5, Sort.by("contentcreatetime").descending().and( Sort.by("contenttitle")));
				
		List<TinfoContent> tinfoContents = tinfoContentRepository.findAll(sortByTitle).getContent();
	
		
		System.out.println( " Tinfo Contents sorted by title page 1 : " + tinfoContents);
		tinfoContents = tinfoContentRepository.findAll(sortByContentcreatetime).getContent();
		System.out.println( " Tinfo Contents sorted by creation time desc and title page 2 : " + tinfoContents);
		
	}
	@Test
	@Disabled
	public void findByPagesContenttitleContaining() {
		
		Pageable firstPageWithThreeRecords = PageRequest.of(0, 5);
		List<TinfoContent> tinfoContents = tinfoContentRepository.findByContenttitleContaining("Test",firstPageWithThreeRecords ).getContent();
		
		System.out.println( " Tinfo Content pages with title : " + tinfoContents);
	}
}
/*
@DataJpaTest
class TinfoContentRepositoryTest {
	
	@Autowired
	private TinfoContentRepository tinfoContentRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	
	@BeforeEach
	void setup() {
		
		TinfoContent tinfoContent = new TinfoContent();
		tinfoContent.setContentid(20L);
		tinfoContent.setContenttitle("TestRepo Content Title");
		
		entityManager.persist(tinfoContent);
		
	}
	@Test
	public void whenFindById_thenReturnTinfoContent() {
		assertEquals( 1, 1);
		/*
		TinfoContent tinfoContent = tinfocontentrepository.findById(20L).get();
		assertEquals( tinfoContent.getContenttitle(), "TestRepo Content Title");
		
	}
	
}
*/
