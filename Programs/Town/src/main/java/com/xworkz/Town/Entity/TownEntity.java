package com.xworkz.Town.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name="towntable")
public class TownEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "townName")
    private String townName;
    @Column(name="email")
    private String email;
    @Column(name="age")
    private int age;
    @Column(name="phone")
    private long phone;


    public TownEntity(String name,String email,int age,long phone){

        this.phone=phone;
        this.age=age;
        this.email=email;
        this.townName=name;
    }
}
