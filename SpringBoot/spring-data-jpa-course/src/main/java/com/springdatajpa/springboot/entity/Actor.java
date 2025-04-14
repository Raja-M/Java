package com.springdatajpa.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
@Entity
public class Actor {

    @Id
    private Long actor_Id;
    private String first_Name;
    private String last_Name;
    private String last_Update;

    public Long getActor_Id() {
        return actor_Id;
    }

    public void setActor_Id(Long actor_Id) {
        this.actor_Id = actor_Id;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getLast_Update() {
        return last_Update;
    }

    public void setLast_Update(String last_Update) {
        this.last_Update = last_Update;
    }
}
