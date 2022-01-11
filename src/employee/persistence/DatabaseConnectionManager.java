package employee.persistence;

public class DatabaseConnectionManager {
  private DatabaseConnectionManager databaseConnectionManager;

  public DatabaseConnectionManager getManagerInstance(){
    if(databaseConnectionManager == null){
      databaseConnectionManager = new DatabaseConnectionManager();
    }
    return databaseConnectionManager;
  }

  public void connect(){
    System.out.println("Connenct database");
  }

  public void getConnectionObject(){
    System.out.println("Getting connection object");
  }

  public void disconnect(){
    System.out.println("Disconnect");
  }

}
