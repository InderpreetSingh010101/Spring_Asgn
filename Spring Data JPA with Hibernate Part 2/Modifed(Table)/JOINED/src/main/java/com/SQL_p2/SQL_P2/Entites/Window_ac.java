package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "window_ac1")
@PrimaryKeyJoinColumn(name = "id")
public class Window_ac extends Airconditioner{
    private String window_ac_sno ;

    public void setWindow_ac_sno(String window_ac_sno) {
        this.window_ac_sno = window_ac_sno;
    }

    public String getWindow_ac_sno() {
        return window_ac_sno;
    }
}
