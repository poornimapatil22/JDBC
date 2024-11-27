package com.xworkz.Runner;

import com.xworkz.Dto.ChannelEntity;
import com.xworkz.Dto.SerialEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ChannelRunner {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();
            List<ChannelEntity> channelEntityList=new ArrayList<>();
            channelEntityList.add(new ChannelEntity("R.J.music",10,0,"chandan"));
            for(ChannelEntity channelEntities:channelEntityList){
                ChannelEntity channelEntity1=new ChannelEntity();
                channelEntity1.setChannelName(channelEntities.getChannelName());
                channelEntity1.setChannelSponser(channelEntities.getChannelSponser());
                channelEntity1.setNoOfSerials(channelEntities.getNoOfSerials());
                channelEntity1.setTrp(channelEntities.getTrp());
                entityManager.persist(channelEntity1);
                entityTransaction.commit();
                System.out.println("data saved");

            }

        } catch (Exception e) {
            System.out.println("data not saved");
            e.printStackTrace();

        }
        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
