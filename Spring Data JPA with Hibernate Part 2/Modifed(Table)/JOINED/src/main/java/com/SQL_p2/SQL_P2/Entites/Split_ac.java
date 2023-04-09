package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "split_ac1")
@PrimaryKeyJoinColumn(name = "id")
public class Split_ac extends Airconditioner {
    private  String split_ac_sno ;

    public void setSplit_ac_no(String split_ac_sno) {
        this.split_ac_sno = split_ac_sno;
    }

    public String getSplit_ac_no() {
        return split_ac_sno;
    }
}
