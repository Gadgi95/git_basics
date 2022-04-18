package com.example.BAfaM.company.Employee;

import com.example.BAfaM.company.Company;
import lombok.Getter;
import lombok.Setter;

public class ShopAssistant extends Staff{
  @Setter @Getter
  double tradeTurnover = 0;

  public ShopAssistant(Company company) {
    super(Position.ShopAssistant, company);
    setFix(0);
    setTradeTurnover(Math.random() * (1400000 - 1150000) + 1150000);
    company.setIncome((int)company.getIncome() + (int)getTradeTurnover());
  }


  @Override
  public double getMonthSalary()
  {
    return getTradeTurnover() * 0.05;
  }

}
