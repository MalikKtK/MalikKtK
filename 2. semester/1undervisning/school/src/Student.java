import java.util.ArrayList;

public class Student {

    // Data, attributter, Fields - Tilstand
    private long cpr;  // 221080-8888  3112808888
    private String name;
    private int age;

    private ArrayList<Course> courses;

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(Course cours) {
        this.courses.add(cours);
    }

    public Student(long cpr, String name, int age) {
        this.setCpr(cpr);
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    // Methods - handlinger

    public long getCpr() {
        return cpr;
    }

    public void setCpr(long cpr) {
        if(cpr == 1234){
            this.cpr = cpr;
        }
        else {
            this.cpr =9999;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
