package week10;

public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour {
    int numberOfArticles;

    public PhDStudent(int id, float midtermGrade, float finalGrade, int numberOfConf, int numberOfArticles) {
        super(id, midtermGrade, finalGrade, numberOfConf);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    float computeTotalScore() {
        return super.computeTotalScore() + articleScore();
    }

    @Override
    public float articleScore() {
        return numberOfArticles * 8f;
    }
}
