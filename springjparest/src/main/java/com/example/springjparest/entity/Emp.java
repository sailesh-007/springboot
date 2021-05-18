package com.example.springjparest.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Table(name = "employee")
@Entity
public class Emp {


    @Id
    Long id;
    @Column(name = "f_name")
    String firstName;
    @Column(name = "l_name")
    String lastName;

    Double salary;

    Integer age;

    String title;


}
