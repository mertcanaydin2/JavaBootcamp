package FourthDay.T3.dataAccess.abstracts;

import FourthDay.T3.entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    List<Customer> customers;

    public CustomerDao() {
        customers = new ArrayList<Customer>();
    }

    public void add(Customer customer){
        customers.add(customer);
    }

    public void update(Customer customer){

    }

    public void remove(Customer customer){
        customers.remove(customer);
    }

    public List<Customer> getAll(){
        return customers;
    }
}
