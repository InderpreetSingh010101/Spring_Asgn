package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.*;


//Create an Employee entity having following fields:
// id, firstName, lastName, salary, age which maps to the table columns given in above.

@Entity
@Table(name = "employee_embed")
public class Employee {



    @Id
      private int id ;



    @Column(name = "first_name")
   private String firstName ;
    @Column(name = "last_name")
    private String lastName ;

    private  int age ;
  @Embedded
    private Salary salary ;

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
