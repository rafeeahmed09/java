package StreamTreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void SetSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public int getid() {
        return id;
    }
}

public class Map_Stream {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1, "Alice", 25000.0),
                new Employee(2, "Bob", 30000.0),
                new Employee(3, "charlie", 28000.0),
                new Employee(4, "David", 32000.0));
        // Map to get the salaries of all employees in a list.
        List<Double> Salary = employees.stream().map(Employee::getSalary).collect(Collectors.toList());
        System.out.println("Employee Salaries: ");
        System.out.println(Salary);
        // Map to get the names of all employees name in a list.
        List<String> employeeNames = employees.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println("Employee Names:");
        System.out.println(employeeNames);
        // Map to get find the highest salary.
        double maxSalary = employees.stream().mapToDouble(Employee::getSalary).max().orElse(0.0);
        System.out.println("MAx Salary:");
        System.out.println(maxSalary);

        for(Employee emp : employees){
            System.out.println(emp.getid() + " :  " + emp.getName() + " : " + emp.getSalary());
        }

    }
}
