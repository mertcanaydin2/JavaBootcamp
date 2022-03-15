package FourthDay.T1.Interfaces;

public class CustomerManager {
    ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        customerDal.Add();
    }
}
