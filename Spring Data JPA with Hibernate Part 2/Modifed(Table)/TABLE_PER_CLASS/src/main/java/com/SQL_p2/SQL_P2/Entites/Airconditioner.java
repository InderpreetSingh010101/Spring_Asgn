package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.*;

// id int PRIMARY KEY,
//ac_type varchar(2),
//amount decimal(8,3) ,
//window_ac_sno varchar(20),
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Airconditioner {
@Id
    private int id ;

    private double amount ;

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
