package ThirdDay.Inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer individualCustomer = new IndividualCustomer();
        CustomerManager customerManager = new CustomerManager();
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        UnionCustomer abc = new UnionCustomer();

        corporateCustomer.customerNumber = "890123";

        individualCustomer.customerNumber = "1234567";

        abc.customerNumber = "54321";

        Customer[] customers = {individualCustomer,corporateCustomer,abc};
        customerManager.addMultiple(customers);

    }
}
