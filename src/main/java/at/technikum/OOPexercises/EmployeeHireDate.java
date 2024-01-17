package at.technikum.OOPexercises;

public class EmployeeHireDate {
    private String name;
    private double salary;
    private int hireDate;

    public EmployeeHireDate(String name, double salary, int hireDate) {
        this.hireDate = hireDate;
        this.salary = salary;
        this.name = name;
    }

    public int yearsHired(int dateToday) {
        if (hireDate / 10000 % 100 < dateToday / 10000 % 100 ||
           ((hireDate / 10000 % 100 == dateToday / 10000 % 100) && hireDate / 1000000 < dateToday / 1000000)) {
            return (dateToday % 10000 - hireDate % 10000);
        } else
            return (dateToday % 10000 - hireDate % 10000 - 1);
    }
}
