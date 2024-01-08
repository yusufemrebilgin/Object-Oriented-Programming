package week10;

public abstract class Student {
    private int id;
    private float midtermGrade;
    private float finalGrade;

    public Student(int id, float midtermGrade, float finalGrade) {
        this.id = id;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    abstract float computeTotalScore();

    float computeBaseScore() {
        return (float)(midtermGrade * 0.4 + finalGrade * 0.6);
    }
}
