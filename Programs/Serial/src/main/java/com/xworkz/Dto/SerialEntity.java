package com.xworkz.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="serialtable")
@Entity
public class SerialEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="serialName")
    private String serialName;
    @Column(name="noOfCharacters")
    private int noOfCharacters;
    @Column(name="trps")
    private double trps;
    @Column(name="whichChannel")
    private String whichChannel;
    @Column(name="mainCharacter")
    private String mainCharacter;


    public SerialEntity(String serialName,int noOfCharacters,double trps,String whichChannel,String mainCharacter){
        this.serialName=serialName;
        this.mainCharacter=mainCharacter;
        this.noOfCharacters=noOfCharacters;
        this.trps=trps;
        this.whichChannel=whichChannel;
    }
}
