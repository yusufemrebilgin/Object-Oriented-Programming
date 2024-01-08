package week10;

public class StudentApp {
    public static void main(String[] args) {
        BachelourStudent bachelourStudent = new BachelourStudent(11, 65f, 87f);
        System.out.println("Bachelour Student Total Score: " + bachelourStudent.computeTotalScore());

        MasterStudent masterStudent = new MasterStudent(22, 77f, 88f, 15);
        System.out.println("Master Student Total Score: " + masterStudent.computeTotalScore());

        PhDStudent phDStudent = new PhDStudent(33, 88f, 90f, 15, 22);
        System.out.println("PhD Student Total Score: " + phDStudent.computeTotalScore());
    }
}
