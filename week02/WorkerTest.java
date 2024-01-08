package week02;

import java.util.Scanner;

public class WorkerTest {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ali", 34567, 60, 200);
        worker1.displayInfo();
        worker1.displaySalary();

        System.out.println("**************************");

        Scanner scanner = new Scanner(System.in);
        Worker worker2 = new Worker();

        System.out.print("Enter worker name: ");
        worker2.name = scanner.nextLine();
        System.out.print("Enter social security number: ");
        worker2.socialSecurityNumber = scanner.nextInt();
        System.out.print("Enter wage: ");
        worker2.wage = scanner.nextFloat();
        System.out.print("Enter working hours: ");
        worker2.workingHours = scanner.nextInt();
        System.out.println();

        worker2.displayInfo();
        worker2.displaySalary();
    }
}
