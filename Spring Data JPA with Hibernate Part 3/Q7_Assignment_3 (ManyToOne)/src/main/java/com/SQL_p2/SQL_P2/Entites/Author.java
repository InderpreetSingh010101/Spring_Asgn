package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id ;

    private String name ;
    @Embedded
    private Address address ;


    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private Set<Subjects> subjects ;



    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL , fetch = FetchType.LAZY)
   // @JoinColumn(name = "book_id")
    private Set<Book> books  = new HashSet<>();

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setSubjects(Set<Subjects> subjects) {
        this.subjects = subjects;
    }

    public Set<Subjects> getSubjects() {
        return subjects;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addBookSet(Book bk){
        if(bk != null){
            if(books == null){
                books = new HashSet<>() ;
            }
            books.add(bk) ;
        }
    }
}
