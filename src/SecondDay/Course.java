package SecondDay;

public class Course {
    int id;
    String courseName;
    double price;
    String detail;
    int instructorId;

    public Course(int id, String courseName, double price, String detail, int instructorId) {
        this.id = id;
        this.courseName = courseName;
        this.price = price;
        this.detail = detail;
        this.instructorId = instructorId;
    }
}
