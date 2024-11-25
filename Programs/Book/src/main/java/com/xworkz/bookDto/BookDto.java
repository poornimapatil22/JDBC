package com.xworkz.bookDto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
    @Table(name = "bookstable")
    public class BookDto {
        @Id
        private int id;

        private String title;
        private String author;
        private String genre;
        private int publishedYear;
        private int pages;
        private String publisher;
        private String language;
        private String isbn;
        private double price;
}
