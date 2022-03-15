package FourthDay.T2.Abstract;

import FourthDay.T2.entity.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
    @Override
    public void Save(Customer customer) {
        System.out.println("Veritabanına kaydedildi. : "+customer.getFirstName());
    }
}
