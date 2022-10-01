package com.telanganainfo.contentmanager.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.telanganainfo.contentmanager.entity.TinfoContent;

@DataJpaTest
class TinfoContentRepositoryTest {
	
	@Autowired
	private TinfoContentRepository tinfocontentrepository;
	
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
		TinfoContent tinfoContent = tinfocontentrepository.findById(20L).get();
		assertEquals( tinfoContent.getContenttitle(), "TestRepo Content Title");
	}
	
}
