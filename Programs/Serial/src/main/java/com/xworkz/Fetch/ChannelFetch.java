package com.xworkz.Fetch;

import com.xworkz.Dto.ChannelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ChannelFetch {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("serial");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            entityTransaction.begin();
            ChannelEntity channel = entityManager.find(ChannelEntity.class, 2);
            if (channel != null) {
                System.out.println("Channel Name: " + channel.getChannelName());
                System.out.println("TRP: " + channel.getTrp());
                System.out.println("NoOfSerials: " + channel.getNoOfSerials());
                System.out.println("Channel Sponser: " + channel.getChannelSponser());
                entityTransaction.commit();
            } else {
                System.out.println("No channel found with id 1");
            }
        }catch(Exception e){
            System.out.println("Encountering errors");
            e.printStackTrace();
        }
        finally {
           entityManager.close();
           entityManagerFactory.close();
        }
    }
}
