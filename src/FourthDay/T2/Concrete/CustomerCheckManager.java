package FourthDay.T2.Concrete;

import FourthDay.T2.Abstract.ICustomerCheckService;
import FourthDay.T2.entity.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
