package com.xworkz.bookRunner;

import com.xworkz.bookDto.BookDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookRunner {


        public static void main(String[] args) {
            EntityManagerFactory eMF = Persistence.createEntityManagerFactory("book");
            EntityManager entityManager = eMF.createEntityManager();
            EntityTransaction eT = entityManager.getTransaction();

            try {
                eT.begin();
                BookDto book = new BookDto();
                book.setId(4);
                book.setTitle("Bhagvadgite");
                book.setAuthor("Ved vyaas");
                book.setGenre("charitre");
                book.setPublishedYear(5000);
                book.setPages(500);
                book.setPublisher("Prabhu Paad");
                book.setLanguage("kannada");
                book.setIsbn("934569800");
                book.setPrice(300);
                entityManager.persist(book);
                eT.commit();
                System.out.println("data saved");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                entityManager.close();
                eMF.close();
            }
        }

    }

