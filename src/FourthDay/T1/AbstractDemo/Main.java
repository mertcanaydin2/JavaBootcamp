package FourthDay.T1.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomer();
    }
}
