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
@Entity
@Table(name="channeltable")
public class ChannelEntity {



    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="channelName")
    private String channelName;
    @Column(name="trp")
    private double trp;
    @Column(name="noOfSerials")
    private int noOfSerials;
    @Column(name="channelSponser")
    private String channelSponser;



    public ChannelEntity(String channelName, double trp, int noOfSerials, String channelSponser) {
             this.channelName = channelName;
             this.trp = trp;
             this.noOfSerials = noOfSerials;
             this.channelSponser = channelSponser;
         }

}
