package com.example.BAfaM.company;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class KPI {

  double turnover;
  double conversion;
  double UPT;
  int salesInPieces;
  int salesInChecks;
  double averageFinalPrice;
  double traffic;


//  public double averageCheck() {  //Обработать исключения
//    try {
//      return averageFinalPrice * UPT;
//    } finally {
//
//    }
//    try {
//      return turnover/salesInChecks;
//    } finally {
//
//    }
//  }

}
