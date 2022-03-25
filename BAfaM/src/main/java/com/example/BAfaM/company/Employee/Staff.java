package com.example.BAfaM.company.Employee;

import com.example.BAfaM.company.Company;
import lombok.Getter;
import lombok.Setter;

public abstract class Staff
{
  @Getter @Setter
  private double fix;

  @Getter @Setter
  private double variable;

  @Getter @Setter
  protected Position position;

  @Getter @Setter
  protected Company company;

  @Getter @Setter
  protected static int idCounter = 1;

  @Getter @Setter
  protected int staffId;

  public Staff(Position position, Company company)
  {
    this.position = position;
    this.company = company;
    staffId = idCounter++;
  }

  public double getMonthSalary() {
    return 0;
  }

  @Override
  public String toString() {
    return "\n" + staffId + " - " + position + " - " + getMonthSalary();
  }

}
