package week02;

public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    public Worker() {}
    public Worker(String name, int socialSecurityNumber, float wage, int workingHours) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.wage = wage;
        this.workingHours = workingHours;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\n" + "Social Security Number: " + socialSecurityNumber);
    }

    public void displaySalary() {
        System.out.println("Salary: " + wage * workingHours);
    }
}
