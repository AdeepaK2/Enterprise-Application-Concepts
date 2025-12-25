
// Example of Singleton Design Pattern in Java
public class Singleton {
    public static void main(String[] args) {
        DatabaseConnection db=DatabaseConnection.getInstance();
    }
}

class DatabaseConnection{
    private static DatabaseConnection instance;

    private DatabaseConnection(){
        // private constructor to prevent instantiation
    }

    public static DatabaseConnection getInstance() {
      if(instance ==null){
          instance=new DatabaseConnection();
      }
      return instance;
    }
}


