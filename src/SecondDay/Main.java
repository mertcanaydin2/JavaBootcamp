package SecondDay;

public class Main {
    public static void main(String[] args) {

        CourseManager courseManager = new CourseManager();
        for (Course course:courseManager.getAll()
             ) {
            courseManager.add(course);
            courseManager.update(course);
            courseManager.remove(course);

        }
        InstructorManager instructorManager = new InstructorManager();
        for (Instructor instructor: instructorManager.getAll()
             ) {
            instructorManager.add(instructor);
            instructorManager.update(instructor);
            instructorManager.remove(instructor);
        }
    }
}
