package ThirdDay.LastHW;

public class InstructorManager extends UserManager{

    public void add(User user){
        System.out.println(user.getFirstName()+" Eklendi.");

    }
    public void remove(User user){
        System.out.println(user.getFirstName()+" Silindi.");
    }
}
