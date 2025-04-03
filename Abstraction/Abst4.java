abstract class Employee {
    String name;
    
    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void showInfo() {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Abst4 {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 50000);
        Employee emp2 = new PartTimeEmployee("Bob", 200, 20);

        emp1.showInfo();
        System.out.println("Salary: $" + emp1.calculateSalary());

        emp2.showInfo();
        System.out.println("Salary: $" + emp2.calculateSalary());
    }
}
