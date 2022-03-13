package ThirdDay.LastHW;

public class UserManager {
    public void add(User user){
        System.out.println(user.getFirstName()+" Eklendi.");
    }

    public void update(User user){
        System.out.println(user.getFirstName()+" Olarak Güncellendi.");
    }

    public void remove(User user){
        System.out.println(user.getFirstName()+" Silindi.");
    }
}
