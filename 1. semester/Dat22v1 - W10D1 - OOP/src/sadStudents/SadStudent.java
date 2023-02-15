package sadStudents;

public class SadStudent {
    String name;
    int LevelOfEngagement;
    int ExpectedExamGrade;

    public SadStudent(String name, int expectedExamGrade) {
        this.name = name;
        this.ExpectedExamGrade = expectedExamGrade;
    }

    public SadStudent(String name) {
        this.name = name;
        this.ExpectedExamGrade = 0;
    }


    void danceLikeCrazy() {
        this.LevelOfEngagement += 10;
        this.ExpectedExamGrade += 1;
    }

    void shoutLikeCrazy() {
        this.LevelOfEngagement += 10;
        this.ExpectedExamGrade += 1;
    }

    void lookLikeAZombie() {
        this.LevelOfEngagement -= 10;
        this.ExpectedExamGrade -= 1;
    }

    void ignoreTeacherInspirationalMoves() {
        this.LevelOfEngagement -= 10;
        this.ExpectedExamGrade -= 1;
    }


    @Override
    public String toString() {
        return "Student: " + name +
                ", LevelOfEngagement: " + LevelOfEngagement +
                ", ExpectedExamGrade: " + ExpectedExamGrade;
    }
}