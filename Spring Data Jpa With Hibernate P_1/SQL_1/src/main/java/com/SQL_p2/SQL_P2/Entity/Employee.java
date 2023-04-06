package com.SQL_p2.SQL_P2.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    private String name ;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }

    private int age ;

    private String location ;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }
}
