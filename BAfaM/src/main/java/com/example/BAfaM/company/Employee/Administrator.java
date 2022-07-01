package com.example.BAfaM.company.Employee;

import com.example.BAfaM.company.Company;
import com.example.BAfaM.company.Employee.Core.Position;
import com.example.BAfaM.company.Employee.Core.Staff;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Administrator extends Staff {

  double coefficient = 1.0;

  public Administrator(Company company) {
    super(Position.Administrator, company);
    setFix(50_000.);

  }

  public Administrator(Position position, Company company) {
    super(Position.Administrator, company);
    setFix(40_000.);
  }

  @Override
  public double getMonthSalary() {
    Date nowDate = new Date();
    if(nowDate.getMonth() >= 4 && nowDate.getMonth() < 6 || nowDate.getMonth() >= 9) {
      setCoefficient(1.5);
    }
    else if(nowDate.getMonth() >= 6 && nowDate.getMonth() < 8 ) {
      setCoefficient(2.0);
    }

    double variable = (company.getIncome() * 0.0010) * coefficient;
    return getFix() + variable;
  }

}
