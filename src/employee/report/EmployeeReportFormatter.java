package employee.report;

import employee.model.Employee;
import employee.model.FormatType;

public class EmployeeReportFormatter extends ReportFormatter{
   private Employee employee;
   private FormatType formatType;

   public EmployeeReportFormatter(Employee employee, FormatType formatType){
      super();
      this.employee = employee;
      this.formatType = formatType;
   }

   public void getFormattedEmployee(){
      if(formatType.equals(FormatType.CSV)){
         convertObjectToCSV(employee);
         System.out.println("Formatting csv");
      }
      if(formatType.equals(FormatType.XML)){
         convertObjectToXML(employee);
         System.out.println("Formatting xml");
      }
   }
}
