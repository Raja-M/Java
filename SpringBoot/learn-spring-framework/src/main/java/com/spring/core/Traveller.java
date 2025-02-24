package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveller")
public class Traveller {

    private Vechile vechile;

    @Autowired
    //public Traveller( @Qualifier("bike") Vechile vechile) {
    public Traveller( Vechile vechile) {
        this.vechile = vechile;
    }

    public void startJourney(){
        this.vechile.move();
    }
}
