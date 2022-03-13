package ThirdDay.LastHW;

public class Instructor extends User{
    private String dprt;

    public Instructor(String dprt) {
        this.dprt = dprt;
    }

    public Instructor(int id, String firstName, String lastName, String eMail, String pass, String dprt) {
        super(id, firstName, lastName, eMail, pass);
        this.dprt = getDprt();
    }

    public Instructor(){

    }
    public String getDprt(){
        return dprt;
    }
    public void setDprt(String dprt){
        this.dprt=dprt;
    }

}
