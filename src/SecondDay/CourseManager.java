package SecondDay;

public class CourseManager {
    public void add(Course course){
        System.out.println(course.courseName+" Eklendi.");
    }
    public void update(Course course){
        System.out.println(course.courseName+" Güncellendi.");
    }
    public void remove(Course course){
        System.out.println(course.courseName+" Silindi.");
    }
    Course[] getAll(){
        Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı(JavaScript)",10," 1.5 ay sürecek kurs..",1);
        Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı(C# + ANGULAR",10,"2 ay sürecek kurs..",1);
        Course course3 = new Course(3,"Yazılım Geliştirici Yetiştirme Kampı(Java + React)",10,"Kurs...",2);
        Course course4 = new Course(4,"Programlamaya Giriş için Temel Kurs",10,"Güzel bir kurs",2);

        Course[] courses = {course1,course2,course3,course4};
        return courses;

    }
}
