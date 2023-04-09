package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.*;


//Create an Employee entity having following fields:
// id, firstName, lastName, salary, age which maps to the table columns given in above.

@Entity
@Table(name = "employee")
public class Employee {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    private int id ;
    @Column(name = "empFirstName")
   private String firstName ;
    @Column(name = "empLastName")
    private String lastName ;
    @Column(name = "empSalary")
      private int salary ;
    @Column(name = "empAge")
      private  int age ;

    public Employee() {
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

    public void setSalary(int salary) {
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
