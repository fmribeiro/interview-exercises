package employee;

import employee.model.Employee;
import employee.persistence.EmployeeDAO;
import employee.report.ReportFormatter;

public class ClientModule {
  private EmployeeDAO employeeDAO;
  private ReportFormatter reportFormatter;

  private void hireNewEmployee(Employee employee){
    employeeDAO.saveEmployee(employee);
  }

  private void terminateEmployee(Employee employee){
    employeeDAO.deleteEmployee(employee);
  }

  private void printEmployeeReport(Employee employee){
    reportFormatter.getFormattedValue();
  }

  public static void main(String[] args) {

  }

}
