package com.telanganainfo.contentmanagersecurity.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.telanganainfo.contentmanagersecurity.entity.TinfoUserContact;
import com.telanganainfo.contentmanagersharedlib.CommonUtil;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@RestController
public class MainController {
	
	@Autowired
	private WebClient webClient;
	
	@GetMapping("/api/home")
	public String visitHomePage( Principal principal ) {
		CommonUtil commonUtil = new CommonUtil();
		String welcomeMsg = commonUtil.getWelcomMsg();	
		
		return principal.getName() + welcomeMsg;	
	}

    @GetMapping("/api/users")
    public String[] users(
            @RegisteredOAuth2AuthorizedClient("api-client-authorization-code")
                    OAuth2AuthorizedClient client){
        return this.webClient
                .get()
                .uri("http://127.0.0.1:8090/api/users")
                .attributes(oauth2AuthorizedClient(client))
                .retrieve()
                .bodyToMono(String[].class)
                .block();
    }
}
