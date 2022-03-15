package FourthDay.T2.Concrete;

import FourthDay.T2.Abstract.BaseCustomerManager;
import FourthDay.T2.Abstract.ICustomerCheckService;
import FourthDay.T2.Abstract.ICustomerService;
import FourthDay.T2.entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;

    }
    @Override
    public void Save(Customer customer){
        if (customerCheckService.checkIfRealPerson(customer)){
            super.Save(customer);
        }
        else
        {
            System.out.println("Mernis Doğrulama Hatası!");
        }
    }
}
