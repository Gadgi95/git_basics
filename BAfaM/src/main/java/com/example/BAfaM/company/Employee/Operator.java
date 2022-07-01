package com.example.BAfaM.company.Employee;

import com.example.BAfaM.company.Company;
import com.example.BAfaM.company.Employee.Core.Position;
import com.example.BAfaM.company.Employee.Core.Staff;

public class Operator extends Staff {

    public Operator(Company company) {
        super(Position.Operator, company);
        setFix(24_000.);
    }

    @Override
    public double getMonthSalary() {
        return  getFix();
    }
}
