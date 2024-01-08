package week04;

public class Worker {
    private String name;
    private float salary;
    static int counter = 0;

    public Worker() {
        counter++;
    }

    public Worker(String name, float salary) {
        this.name = name;
        if (salary > 0.0f)
            this.salary = salary;
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        if (salary < 0.0f)
            throw new IllegalArgumentException("Salary amount must be greater than zero");
        this.salary = salary;
    }
}
