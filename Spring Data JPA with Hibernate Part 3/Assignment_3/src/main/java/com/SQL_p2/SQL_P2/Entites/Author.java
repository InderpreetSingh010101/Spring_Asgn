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


    //@OneToMany(mappedBy = "author" , cascade = CascadeType.ALL )
@ElementCollection()
    private Set<String> sub ;

    public Set<String> getSub() {
        return sub;
    }

    public void setSub(Set<String> sub) {
        this.sub = sub;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;


//    public void setSubjects(Set<Subjects> subjects) {
//        this.subjects = subjects;
//    }
//
//    public Set<Subjects> getSubjects() {
//        return subjects;
//    }


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
