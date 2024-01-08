package week10;

public class MasterStudent extends Student implements ConferenceScoreBehaviour {
    protected int numberOfConf;

    public MasterStudent(int id, float midtermGrade, float finalGrade, int numberOfConf) {
        super(id, midtermGrade, finalGrade);
        this.numberOfConf = numberOfConf;
    }

    @Override
    float computeTotalScore() {
        return super.computeBaseScore() + conferenceScore();
    }

    @Override
    public float conferenceScore() {
        return numberOfConf * 5f;
    }
}
