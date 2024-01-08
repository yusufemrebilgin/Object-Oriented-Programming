package week04;

import java.util.Scanner;

public class WorkerTest {
    public static void main(String[] args) {

        Worker worker1 = new Worker();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the name of worker 1: ");
            worker1.setName(scanner.nextLine());
            System.out.print("Please enter the salary of worker 1: ");
            worker1.setSalary(scanner.nextFloat());
        }
        catch (Exception e) {
            System.out.print(e.getMessage());
        }

        Worker worker2 = new Worker("Defne", 30000);
        Worker worker3 = new Worker("Mehmet", 35000);

        System.out.println("\n\nCounter: " + Worker.counter);
    }
}
