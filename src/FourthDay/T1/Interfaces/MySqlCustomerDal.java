package FourthDay.T1.Interfaces;

public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void Add() {
        System.out.println("MySql Eklendi.");
    }
}
