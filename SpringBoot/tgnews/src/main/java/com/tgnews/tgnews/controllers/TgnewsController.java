package com.tgnews.tgnews.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TgnewsController {

    @Value("${variable.environment:none}")
    private String environment;

    private final String welcomeMessage;
    private final Environment env;

    @Autowired
    public TgnewsController(@Value("${WELCOME_MESSAGE:Welcome to tgnews application contoller}") String welcomeMessage,
                            Environment env) {
        this.welcomeMessage = welcomeMessage;
        this.env = env;
    }

    @GetMapping("/")
    public String getStarted(){
        // Prefer explicit environment property if present (e.g. from OS env or launch.json env)
        String fromEnv = env.getProperty("WELCOME_MESSAGE");
        if (fromEnv != null && !fromEnv.isEmpty()) {
            return  fromEnv + " " + environment;
        }
        // Otherwise use the @Value-injected property (which also has a default)
        return welcomeMessage;
    }

}
