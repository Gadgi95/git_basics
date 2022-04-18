package com.example.BAfaM.company;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class KPI {

  private double turnover;
  private double UPT;
  private double conversion;
  private double salesInPieces;
  private double salesInChecks;
  private double averageFinalPrice;
  private double traffic;
  private double averageCheck;

  public double conversion() {
    if(salesInChecks != 0 && traffic != 0) {
      return salesInChecks * traffic * 100;
    }
    else return 0;
  }

  public double UPT() {
    if (salesInChecks != 0 && salesInPieces != 0) {
      return salesInPieces / salesInChecks;
    }
    else return 0;
  }

  public double averageFinalPrice() {
    if(turnover != 0 && salesInPieces != 0) {
      return traffic / salesInPieces;
    }
    else return 0;
  }


  public double averageCheck() {  //Обработать возможные исключения
    if(UPT() != 0 && averageFinalPrice() != 0) {
      return averageFinalPrice() * UPT();
    }
    else return 0;
  }
}
