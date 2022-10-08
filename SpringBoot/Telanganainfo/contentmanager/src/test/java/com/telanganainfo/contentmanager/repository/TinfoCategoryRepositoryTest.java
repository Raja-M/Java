package com.telanganainfo.contentmanager.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;

import com.telanganainfo.contentmanager.entity.TinfoCategory;

@SpringBootTest
class TinfoCategoryRepositoryTest {
	
	@Autowired
	private TinfoCategoryRepository tinfoCategoryRepository;
	

	@Test
//	@Disabled
	@Order(1)
	@DisplayName("tinfo Category Save ")
	@Description("Tinfo Category save record test " )
	public void saveTinfoCategory() {
		
		TinfoCategory tinfoCategory = new TinfoCategory();
//		tinfoCategory.setCategorytid(1L);
		tinfoCategory.setCategorydescription("Test");
		tinfoCategory.setCategorycreatedby(1);
		tinfoCategory.setCategoryupdatetime( "2022-10-8 20:01:52"); 
		
		TinfoCategory tinfoCategorySaved = tinfoCategoryRepository.save(tinfoCategory);
		System.out.println(" tinfoCategorySaved : " + tinfoCategorySaved.getCategorydescription());
		assertEquals(  tinfoCategorySaved.getCategorydescription(), "Test");
		
		List<TinfoCategory> tinfoCategoryList = tinfoCategoryRepository.findAll();
		System.out.println(" CategoryList : " + tinfoCategoryList);
		assertTrue(tinfoCategoryList.size() > 0);

	}
	
	@Test
	@Order(2)  // order not working so moved function code to above function.
	public void printAllCategories() {
		List<TinfoCategory> tinfoCategoryList = tinfoCategoryRepository.findAll();
		System.out.println(" CategoryList : " + tinfoCategoryList);
		assertTrue(tinfoCategoryList.size() >= 0);
	}
	

}
