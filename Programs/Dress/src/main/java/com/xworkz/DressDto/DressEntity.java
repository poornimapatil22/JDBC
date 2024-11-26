package com.xworkz.DressDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dresstable")
public class DressEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="dressType")
    private String dressType;
    @Column(name="cost")
    private int cost;
    @Column(name="dressCount")
    private int dressCount;
    @Column(name="dressPattern")
    private String dressPattern;
    @Column(name="dressBrand")
    private String dressBrand;
}
