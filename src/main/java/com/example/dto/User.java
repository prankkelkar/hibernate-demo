package com.example.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "User")
public class User {
    private String name;
    @Id
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
