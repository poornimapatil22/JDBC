package com.xworkz.bookRunner;

import com.xworkz.bookDto.NovelDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class NovelRunner {public static void main(String[] args) {
    EntityManagerFactory eMF = Persistence.createEntityManagerFactory("book");
    EntityManager entityManager = eMF.createEntityManager();
    EntityTransaction eT = entityManager.getTransaction();
    try {
        eT.begin();
        NovelDto novel = new NovelDto();
        novel.setId(1);
        novel.setTitle("java");
        novel.setAuthor("gosling");
        novel.setGenre("progrmming");
        novel.setPublishedYear(1995);
        novel.setPages(320);
        novel.setPublisher("hmmm");
        novel.setLanguage("English");
        novel.setIsbn("9353724643");
        novel.setPrice(409);
        entityManager.merge(novel);
        System.out.println("data saved");
        eT.commit();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        entityManager.close();
        eMF.close();
    }
}

}
