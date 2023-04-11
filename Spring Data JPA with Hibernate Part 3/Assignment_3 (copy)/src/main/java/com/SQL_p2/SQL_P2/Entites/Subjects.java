package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.*;

@Entity
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subject_id ;
    private String subject_name ;
@ManyToOne
@JoinColumn(name = "id")
    private Author author ;



    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public Author getAuthor() {
        return author;
    }
}
