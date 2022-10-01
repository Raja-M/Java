package com.telanganainfo.contentmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:application-context.xml"})
public class ContentmanagerApplication {
	
	@Value("${welcome.message}")
	private static String welcomeMessage;

	public static void main(String[] args) {
		SpringApplication.run(ContentmanagerApplication.class, args);
		try {
			System.out.println(welcomeMessage); //  not working here as its static method
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}
