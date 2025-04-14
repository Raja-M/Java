package com.astrony.SpringSecEx.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String greet(HttpServletRequest httpServletRequest){
        return "Security Example OK " + httpServletRequest.getSession().getId();
    }


}
