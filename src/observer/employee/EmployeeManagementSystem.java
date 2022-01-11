package observer.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {

  private final List<IObserver> observerList = new ArrayList<>();
  private final EmployeeDao employeeDao = new EmployeeDao();
  private Employee employee;

  @Override
  public void registerObserver(IObserver observer) {
    this.observerList.add(observer);
  }

  @Override
  public void removeObserver(IObserver observer) {
    this.observerList.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observerList.forEach(iObserver -> {
      iObserver.callMe();
    });
  }

  public void hireNewEmployee(Employee employee) {
    System.out.println("New Hire: " + employee.getName());
    employeeDao.addEmployee(employee);
    notifyObservers();
  }

  public void modifyEmployeeName(Employee employee, String name) {
    employee.setName(name);
    System.out.println("Employee name changed: " + employee.getName());
    notifyObservers();
  }
}
