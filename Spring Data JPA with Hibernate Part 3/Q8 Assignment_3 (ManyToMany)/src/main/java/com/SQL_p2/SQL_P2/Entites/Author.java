package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.*;

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



    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book" , joinColumns = @JoinColumn(name = "author_id" , referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "bookTable_id" , referencedColumnName = "book_id"))
    private Set<Book> bookSet ;

    public void setSubjects(Set<Subjects> subjects) {
        this.subjects = subjects;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public Set<Subjects> getSubjects() {
        return subjects;
    }

    public Set<Book> getBookSet() {
        return bookSet;
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
}
