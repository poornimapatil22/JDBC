package com.xworkz.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name="kitchentable")
    public class KitchenDto {
        @Id
        private int id;
        private String colour;
        private int spaceInMeter;
        private String shape;
        private int  noOfThings;
        private boolean isClean;
        private String whoOwns;
        private String kitchenThingsBrand;
        private  String kitchenThingsName;
        private double kitchenThingCost;
        private long kitchenCost;

    }


