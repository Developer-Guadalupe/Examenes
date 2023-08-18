package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="super_junior")
public class Super_Junior {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="birthday")
    private String birthday;


    //define constructor vacion con la libreroa lombok.NoArgsConstructor
    //define constructor con parametros con la libreria lombok.AllArgsConstructor

    // define getter/setter con la libreria lombok.Data 
}






