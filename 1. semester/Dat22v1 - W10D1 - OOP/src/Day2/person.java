package Day2;

import java.time.Month;

public class person{
    String name;
    int age;
    int birthDate;
    int date;
    Month birthMonth;
    Month month;
    String birthday;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", date=" + date +
                ", month=" + month +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
