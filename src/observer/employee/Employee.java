package observer.employee;

import java.time.LocalDate;

public class Employee {

  private String name;
  private LocalDate hireDate;
  private int salary;
  private boolean working = false;

  public Employee(String name, LocalDate hireDate, int salary, boolean working) {
    this.name = name;
    this.hireDate = hireDate;
    this.salary = salary;
    this.working = working;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public boolean isWorking() {
    return working;
  }

  public void setWorking(boolean working) {
    this.working = working;
  }
}
