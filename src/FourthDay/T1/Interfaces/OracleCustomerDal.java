package FourthDay.T1.Interfaces;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void Add() {
        System.out.println("Oracle veritabanına eklendi.");
    }
}
