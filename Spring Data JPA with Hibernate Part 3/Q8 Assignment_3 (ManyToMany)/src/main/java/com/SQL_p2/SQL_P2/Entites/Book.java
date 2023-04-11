package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_id ;
    private String book_name ;
    @ManyToMany(mappedBy = "bookSet")
    private Set<Author> author ;

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    public Set<Author> getAuthor() {
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
