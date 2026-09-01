class Employee {
    int employeeId;
    String employeeName;
    double salary;

    // Constructor
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployee() {
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("ID         : " + employeeId);
        System.out.println("Name       : " + employeeName);
        System.out.println("Salary     : " + salary);
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    // Constructor Chaining
    Manager(int employeeId, String employeeName, double salary, String department, double bonus) {
        super(employeeId, employeeName, salary);
        this.department = department;
        this.bonus = bonus;
    }

    // Method to display manager details
    void displayManager() {
        displayEmployee(); // Reusing inherited method
        System.out.println();
        System.out.println("Manager Details");
        System.out.println("---------------");
        System.out.println("Department : " + department);
        System.out.println("Bonus      : " + bonus);
    }
}

public class EmployeManager {
    public static void main(String[] args) {

        Manager m = new Manager(101, "Arun", 50000, "Sales", 15000);

        m.displayManager();
    }
}