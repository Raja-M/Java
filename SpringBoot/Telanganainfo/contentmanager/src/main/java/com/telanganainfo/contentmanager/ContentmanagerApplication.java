package com.telanganainfo.contentmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:application-context.xml"})
public class ContentmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentmanagerApplication.class, args);
		System.out.println("ContentManager Service started");
	}

}
