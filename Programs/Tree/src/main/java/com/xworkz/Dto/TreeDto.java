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
@Table(name = "treetable")
public class TreeDto {
    @Id
    private  String treeName;
    private double treeHeight;
    private boolean isUnderGround;
    private  boolean isTall;
    private double isBig;
    private double flowersCount;
    private  int id;

}
