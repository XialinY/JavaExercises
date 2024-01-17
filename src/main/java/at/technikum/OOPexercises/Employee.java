package at.technikum.OOPexercises;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.name = name;
    }

    public void salaryCalc(double percentIncrease) {
        salary = salary * (1 + percentIncrease / 100);
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmployee: " +
                "\nName: " + name +
                "\nJob Title: " + jobTitle +
                "\nSalary:" + salary;
    }
}
