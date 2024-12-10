package com.xworkz.Resto.Entity;

import lombok.*;

import javax.persistence.*;
@Data
@EqualsAndHashCode
@NoArgsConstructor
@NamedQuery(name="findEmailById",query ="")
@NamedQuery(name="findAll", query="select rt from RestoEntity rt")
@Table(name="RestaurentTable")
@Entity
public class RestoEntity {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="Name")
    private String restaurentName;
    @Column(name = "Rating")
    private short rating;
    @Column(name="Address")
    private String address;
    @Column(name = "Owner")
    private char ownerFemaleOrMale;
    @Column(name="OpenClose")
    private boolean open;
    @Column(name="AvgPrice")
    private double eachMenuAvgPrice;
    @Column(name="Mob")
    private long mobNo;
    @Column(name="OpeningHours")
    private float openingHours;
    @Column(name = "Review")
    private String review;

    public RestoEntity(String name,short rating,char ownerFemaleOrMale,String adress,
                       boolean open,double eachMenuAvgPrice,long mobNo,float openingHours,String review){
        this.address=adress;
        this.eachMenuAvgPrice=eachMenuAvgPrice;
        this.open=open;
        this.mobNo=mobNo;
        this.ownerFemaleOrMale=ownerFemaleOrMale;
        this.openingHours=openingHours;
        this.rating=rating;
        this.restaurentName=name;
        this.review=review;

    }


}
