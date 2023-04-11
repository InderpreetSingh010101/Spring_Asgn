package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.*;
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_id ;
    private String book_name ;
    @ManyToOne
    @JoinColumn(name = "id")
    private Author author ;

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }
}
