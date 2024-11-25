package com.xworkz.PhotoRunner;

import com.xworkz.Dto.PhotoDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class PhotoTransaction {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("photo");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        try{
            transaction.begin();
            PhotoDto photoDto=new PhotoDto();
            photoDto.setId(6);
            photoDto.setNoOfPhotos(2);
            photoDto.setPhotoCost(500);
            photoDto.setPhotoQuality(true);
            photoDto.setPhotoSize(155);
            photoDto.setBig(true);
            photoDto.setWhichPhoto("God");
            photoDto.setPhotoShape("square");
            photoDto.setWhoClicked("person");
            photoDto.setPhotoIsGood(true);
            photoDto.setPhotoName("god photo");


            entityManager.persist(photoDto);
            transaction.commit();
            System.out.println("data saved");


        }catch (Exception e){
            System.out.println("not saved");
            e.printStackTrace();
        }
        finally {
            entityManager.close();
            entityManagerFactory.close();

        }
    }





}
