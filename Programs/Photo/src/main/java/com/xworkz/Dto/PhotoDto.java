package com.xworkz.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="phototable")
public class PhotoDto {
    @Id
    private int id;
    private String whoClicked;
    private boolean isBig;
    private String photoName;
    private boolean photoIsGood;
    private String photoShape;
    private String whichPhoto;
    private int photoSize;
    private double photoCost;
    private boolean photoQuality;
    private int noOfPhotos;

}
