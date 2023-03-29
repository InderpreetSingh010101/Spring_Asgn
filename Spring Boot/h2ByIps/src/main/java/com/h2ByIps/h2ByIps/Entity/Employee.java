package com.h2ByIps.h2ByIps.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")

public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    public int empID ;

     public String empName ;
     public String empDesignation ;

     public Employee(){
         super();
     }

     public Employee(int empID , String empName , String empDesignation){
         this.empID = empID ;
         this.empDesignation = empDesignation ;
         this.empName = empName ;
     }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                '}';
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
}
