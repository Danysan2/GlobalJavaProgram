package com.example.GlobalJava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
public class User {
    @Id
    private String id;
    private String name;
    private String email;


    public User() {

    }
}

