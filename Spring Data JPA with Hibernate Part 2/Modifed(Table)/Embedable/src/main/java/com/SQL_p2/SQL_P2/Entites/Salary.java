package com.SQL_p2.SQL_P2.Entites;

import jakarta.persistence.Embeddable;

@Embeddable
public class Salary {
    private int basic_salary ;
    private int bonus_salary ;
    private int tax_amount_salary ;
    private int special_allowance_salary ;

    public void setBasic_salary(int basic_salary) {
        this.basic_salary = basic_salary;
    }

    public void setBonus_salary(int bonus_salary) {
        this.bonus_salary = bonus_salary;
    }

    public void setTax_amount_salary(int tax_amount_salary) {
        this.tax_amount_salary = tax_amount_salary;
    }

    public void setSpecial_allowance_salary(int special_allowance_salary) {
        this.special_allowance_salary = special_allowance_salary;
    }

    public int getBasic_salary() {
        return basic_salary;
    }

    public int getBonus_salary() {
        return bonus_salary;
    }

    public int getTax_amount_salary() {
        return tax_amount_salary;
    }

    public int getSpecial_allowance_salary() {
        return special_allowance_salary;
    }
}
