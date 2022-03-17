package FourthDay.T3.business.abstracts;

import FourthDay.T2.entity.Customer;

public interface CustomerCheckService {
    boolean checkRealPerson(Customer customer);
}
