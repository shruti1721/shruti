package AssignmentTwo;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Salary: $" + salary;
    }
}

public class Employee1 {
    static ArrayList<Employee> employees = new ArrayList<>();  //"employees" is an array created to add or delete the employee in it

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        employees.add(new Employee("John Smith", 101, 50000.0));//here "Employee" is the class name
        employees.add(new Employee("Jane Doe", 102, 55000.0));
        employees.add(new Employee("Bob Johnson", 103, 60000.0));
        employees.add(new Employee("Michael Brown", 104, 65000.0));
        employees.add(new Employee("Mary Jones", 105, 70000.0));

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Show Employee Data");
            System.out.println("2. Add New Employee");
            System.out.println("3. Delete Existing Employee");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showEmployees();
                    break;
                case 2:
                    addEmployee(sc);
                    break;
                case 3:
                    deleteEmployee(sc);
                    break;
                case 4:
                    updateEmployee(sc);
                    break;
                case 5:
                    System.out.println("Thank you for using the program!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 5);
    }

    public static void showEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found!");
        } else {
            System.out.println("List of employees:");
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        }
    }
public static void addEmployee(Scanner sc) {
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();//sys

        employees.add(new Employee(name, id, salary));
        System.out.println("New employee added successfully!");
    }

    public static void deleteEmployee(Scanner sc) {
        System.out.print("Enter id of employee to delete: ");
        int id = sc.nextInt();
//here false is assigned to the found 
 boolean found = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Employee deleted successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found!");
        }
    }

    public static void updateEmployee(Scanner sc) {
        System.out.print("Enter id of employee to update: ");
        int id = sc.nextInt();

        boolean found = true;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.print("Enter new salary: ");
                double salary = sc.nextDouble();
                employee.setSalary(salary);
                System.out.println("Employee salary updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found!");
        }
    }
}