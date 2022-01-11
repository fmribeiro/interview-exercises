package employee.persistence;

import employee.model.Employee;

public class EmployeeDAO {

  private DatabaseConnectionManager connectionManager;

  public void saveEmployee(Employee employee) {
    System.out.println("Save employee");
  }

  public void deleteEmployee(Employee employee){
    System.out.println("Delete employee");
  }
}
