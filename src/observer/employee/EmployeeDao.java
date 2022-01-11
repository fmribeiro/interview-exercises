package observer.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

  Employee employee1 = new Employee("Mike", null, 5000, false);
  Employee employee2 = new Employee("Steve", null, 4500, false);
  Employee employee3 = new Employee("John", null, 6200, false);
  Employee employee4 = new Employee("Joe", null, 7000, false);

  private List<Employee> employees = new ArrayList<>();

  public List<Employee> generateEmployees() {
    employees.add(employee1);
    employees.add(employee2);
    employees.add(employee3);
    employees.add(employee4);
    return employees;
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }
}
