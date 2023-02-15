package Opgave;

public class Kid {
    String name;
    int yearOfBirth;

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", Age=" + yearOfBirth +
                '}';
    }

    void writeText (String text){
    System.out.println(text);
}
}
