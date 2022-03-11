package sadStudents;

public class Test {
    public static void main(String[] args) {
        SadStudent student = new SadStudent("Daniel");

        // Engage in shenanigans
        student.danceLikeCrazy();
        for (int i = 0; i < 5; i++) {
            student.shoutLikeCrazy();
        }
        student.lookLikeAZombie();
        for (int i = 0; i < 5; i++) {
            student.shoutLikeCrazy();
        }
        student.ignoreTeacherInspirationalMoves();
        student.danceLikeCrazy();


        System.out.println(student);
    }
}