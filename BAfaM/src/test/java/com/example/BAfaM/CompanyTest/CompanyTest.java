package com.example.BAfaM.CompanyTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.BAfaM.company.Company;
import java.util.Collections;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование класса Company")

public class CompanyTest {

  private Company company;

  @BeforeEach
  public void setUp()
  {
    company = new Company("Test company ");
  }

  @Test
  @DisplayName("Передано пустое значение в добавить сотрудника")
  void testAddEmptyCompany() {
    company.hire(null);
    Set<String> expected = Set.of("Нельзя нанять сотрудника со значениями null");
    assertThrows(Throwable.class, () -> company.hireAll(null));
  }

  public void turnDown() {

  }


}
