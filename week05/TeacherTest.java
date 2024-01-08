package week05;

class TeacherTest {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[] {
                new Teacher(1, Branch.CS),
                new Teacher(2, Branch.ENG),
                new Teacher(3, Branch.MATH),
                new Teacher(4, Branch.PHYSICS)
        };

        for (Teacher t: teachers)
            System.out.println(t);
    }
}
