package observer.employee;

import java.time.LocalDate;

public class App {

  public static void main(String[] args) {
    //criar departamentos
    //registar departamentos no EMS
    //adicionar metodos para modificar empregado no ems
    IObserver payroll = new PayrollDepartment();
    IObserver hrSystem = new HRDepartment();

    EmployeeManagementSystem ems = new EmployeeManagementSystem();
    ems.registerObserver(payroll);
    ems.registerObserver(hrSystem);

    Employee bob = new Employee("Bob", LocalDate.now(), 4500, true);
    ems.hireNewEmployee(bob);

    ems.modifyEmployeeName(bob, "Francis");
  }
}
