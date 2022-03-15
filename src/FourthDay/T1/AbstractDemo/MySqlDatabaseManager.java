package FourthDay.T1.AbstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veriler getirildi : MySql Server");
    }
}
