package com.example.BAfaM.company.Employee;

import com.example.BAfaM.company.Company;
import com.example.BAfaM.company.Employee.Core.Position;
import com.example.BAfaM.company.Employee.Core.Staff;

public class Director extends Staff {

  public Director(Company company) {
    super(Position.Director, company);
    setFix(50_000.);

  }

  @Override
  public double getMonthSalary() {
    double variable = company.getIncome() * 0.0015;
    return getFix() + variable;
  }

}
