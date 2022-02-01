package com.patika.salarycalculator;

import java.time.Year;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee (String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax;
        if (this.salary > 1000) {
            tax = this.salary * 0.03;
        } else {
            tax = 0;
        }
        return tax;
    }

    double bonus() {
        double bonus;
        if (this.workHours > 40) {
            bonus = 30 * (this.workHours - 40);
        } else {
            bonus = 0;
        }
        return bonus;
    }

    double raiseSalary() {
        double salaryRaise;
        int employmentPeriod = Year.now().getValue() - this.hireYear;
        if (employmentPeriod < 10) {
            salaryRaise = this.salary * 0.05;
        } else if (employmentPeriod > 9 && employmentPeriod < 20) {
            salaryRaise = this.salary * 0.10;
        } else if (employmentPeriod > 19) {
            salaryRaise = this.salary * 0.15;
        } else {
            salaryRaise = 0;
        }
        return salaryRaise;
    }

    public String toString() {
        return "Name: "+name+"\nMonthly Wage: "+salary+"\nWorking Hours: "+workHours+"\nIncome Tax: "+tax()+"\nBonus Pay: "+bonus()+"\nNet Salary: "+(salary+bonus()-tax())+"\nRaise: "+raiseSalary()+"\nNext Wage: "+(salary+raiseSalary());
    }

}


