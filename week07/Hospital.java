package week07;

public class Hospital {
    public static void main(String[] args) {
        Patient p1 = new Patient("Ali");
        Patient p2 = new Patient("Veli");
        Patient p3 = new Patient("Ahmet");
        Patient p4 = new Patient("Mehmet");

        Patient[] patients = {p1, p2, p3, p4};

        for (Patient p: patients)
            System.out.println(p);
    }
}
