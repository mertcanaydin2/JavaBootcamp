package ThirdDay.LastHW;

public class Student extends User{
    private String cardNo;
    private String adress;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Student(){

    }

    public Student(String cardNo, String adress) {
        this.cardNo = cardNo;
        this.adress = adress;
    }

    public Student(int id, String firstName, String lastName, String eMail, String pass, String cardNo, String adress) {
        super(id, firstName, lastName, eMail, pass);
        this.cardNo = cardNo;
        this.adress = adress;
    }
}
