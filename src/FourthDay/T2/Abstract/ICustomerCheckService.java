package FourthDay.T2.Abstract;

import FourthDay.T2.entity.Customer;

public interface ICustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
