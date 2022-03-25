package com.example.BAfaM.company.Employee;

import com.example.BAfaM.company.Company;

public class Operator extends Staff{

    public Operator(Company company) {
        super(Position.Operator, company);
        setFix(40000.);
    }

    @Override
    public double getMonthSalary() {
        return  getFix();
    }
}
