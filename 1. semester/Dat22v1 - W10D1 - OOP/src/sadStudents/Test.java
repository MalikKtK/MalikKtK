package sadStudents;

public class Test {
    public static void main(String[] args) {
        SadStudent student = new SadStudent("Malik");


        for (int i = 0; i < 7; i++) {
            student.danceLikeCrazy();
        }
        for (int i = 0; i < 7; i++) {
            student.shoutLikeCrazy();
        }
        for (int i = 0; i < 2; i++) {
            student.ignoreTeacherInspirationalMoves();
        }
        for (int i = 0; i < 2; i++)
            student.lookLikeAZombie();

        System.out.println(student);
        if (student.ExpectedExamGrade == 10) {
            System.out.println("Congratz, you look like a smart kid!");
        }
    }
}