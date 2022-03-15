package FourthDay.T2;

import FourthDay.T2.Abstract.BaseCustomerManager;
import FourthDay.T2.Concrete.NeroCustomerManager;
import FourthDay.T2.entity.Customer;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.Save(new Customer(1,"Mertcan","Aydın","1998","12345"));
    }
}
