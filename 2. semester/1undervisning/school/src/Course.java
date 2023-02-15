import java.util.ArrayList;

public class Course {
     private String title;
     private ArrayList<Student> students;





    public Course(String title) {
        this.title = title;
        students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                '}';
    }
}
