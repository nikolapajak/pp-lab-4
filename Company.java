import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Dodawanie pracowników
        employees[0] = new Manager("Michael Jackson", 60000, 0);
        employees[1] = new Worker("Harry Potter", 60000, "Deweloper");
        employees[2] = new Employee("Adam Ken", 71000);
        employees[3] = new Worker("Bob Smith", 63000, "Księgowy");
        employees[4] = new Worker("Santa White", 18000, "Stazysta");

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }
        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        employees[0].setSalary(75000);

        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}