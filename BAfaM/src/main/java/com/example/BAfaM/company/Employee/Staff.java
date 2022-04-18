package com.example.BAfaM.company.Employee;

import com.example.BAfaM.company.Company;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Staff
{
  private double fix;

  private double variable;

  protected Position position;

  protected Company company;

  protected static int idCounter = 1;

  protected int staffId;

  public Staff(Position position, Company company)
  {
    this.position = position;
    this.company = company;
    staffId = idCounter++;
  }

  public double getMonthSalary()
  {
    return 0;
  }

  @Override
  public String toString()
  {
    return "\n" + staffId + " - " + position + " - " + getMonthSalary();
  }

}
