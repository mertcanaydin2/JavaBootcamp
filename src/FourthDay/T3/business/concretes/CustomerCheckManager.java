package FourthDay.T3.business.concretes;

import FourthDay.T2.entity.Customer;
import FourthDay.T3.business.abstracts.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkRealPerson(Customer customer) {
        return true;
    }
}
