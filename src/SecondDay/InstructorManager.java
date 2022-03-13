package SecondDay;

public class InstructorManager {
    public void add(Instructor instructor) {
        System.out.println(instructor.name+" "+instructor.lastName + " Eklendi.");
    }

    public void update(Instructor instructor) {
        System.out.println(instructor.name +" "+instructor.lastName+ " Güncellendi.");
    }

    public void remove(Instructor instructor) {
        System.out.println(instructor.name+" "+instructor.lastName + " Silindi.");
    }

    public Instructor[] getAll() {
        Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
        Instructor instructor2 = new Instructor(2, "Mertcan", "Aydın");
        Instructor[] instructors = {instructor1, instructor2};
        return instructors;
    }
}

