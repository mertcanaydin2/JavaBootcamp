package ThirdDay.LastHW;

public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(1,"Engin","Demiroğ","deneme@gmail.com","12345","Development");

        Student student1 = new Student(1,"Mertcan","Aydın","canmert547@gmail.com","12345","12345","Türkiye");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);
        instructor1.setFirstName("Ali");
        instructorManager.update(instructor1);
        instructorManager.remove(instructor1);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.remove(student1);


    }
}
