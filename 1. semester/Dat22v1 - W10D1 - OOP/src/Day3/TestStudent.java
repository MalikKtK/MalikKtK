package Day3;

import Day3.Student;

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(2016);
//        s1.name = "Patrick";
        s1.setName("Patrick");
        System.out.println(s1.getName());
        s1.setName("");
        System.out.println(s1.getName());

        s1.setPhone("25 36 79 06");
        System.out.println(s1.getPhone());

        System.out.println("Year: " + s1.getYearOfBirth());
    }
}
