package FourthDay.T3.business.abstracts;

import FourthDay.T2.entity.Customer;

import java.util.List;

public interface CustomerService {
    void add(Customer customer);

    void update(Customer customer);

    void remove(Customer customer);

    List<FourthDay.T3.entities.concretes.Customer> getAll();
}
