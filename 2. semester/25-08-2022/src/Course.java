import java.util.ArrayList;

public class Course {
    private String title;
    private ArrayList<Student> students;


    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students.add(students);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title ='" + title + '\'' +
                '}';
    }
}
