package FourthDay.T3.business.concretes;

import FourthDay.T2.Concrete.CustomerCheckManager;
import FourthDay.T2.entity.Customer;
import FourthDay.T3.business.abstracts.CustomerService;
import FourthDay.T3.dataAccess.abstracts.CustomerDao;

import java.util.List;

public class CustomerManager implements CustomerService {
    private CustomerCheckManager customerCheckManager;

    public CustomerManager(CustomerCheckManager customerCheckManager) {
        this.customerCheckManager = customerCheckManager;
    }

    CustomerDao customerDao = new CustomerDao();

    @Override
    public void add(Customer customer) {
        if(customerCheckManager.checkIfRealPerson(customer)){
            System.out.println("User Registered : " +customer.getFirstName()+" "+customer.getLastName());
            customerDao.add(customer);
        }
        else {
            System.out.println("Invalid User");
        }
    }

    @Override
    public void update(Customer customer) {
        System.out.println("User Updated : "+customer.getFirstName() + " "+ customer.getLastName());
        customerDao.update(customer);
    }

    @Override
    public void remove(Customer customer) {
        System.out.println("User Deleted : "+customer.getFirstName()+ " "+customer.getLastName());
        customerDao.remove(customer);
    }


    @Override
    public List<FourthDay.T3.entities.concretes.Customer> getAll() {
        return customerDao.getAll();
    }
}
