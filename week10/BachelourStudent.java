package week10;

public class BachelourStudent extends Student implements ProjectScoreBehaviour {
    public BachelourStudent(int id, float midtermGrade, float finalGrade) {
        super(id, midtermGrade, finalGrade);
    }

    @Override
    float computeTotalScore() {
        return super.computeBaseScore() + projectScore();
    }

    @Override
    public float projectScore() {
        return 20.0f;
    }
}
