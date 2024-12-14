package com.xworkz.xworkzAdminDetails.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="XworkzTable")
public class XworkzEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Integer age;
    private String email;
    private String  password;
    private String confirmPassword;
    private Long mobNo;
}
