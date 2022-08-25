import java.util.ArrayList;

public class Student {
    private String name;
    private final ArrayList grade;

    Student(String name, ArrayList grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    }

