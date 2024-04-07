import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Michael Jackson", 60000, 0);
        employees[1] = new Worker("Harry Potter", 60000, "Deweloper");
        employees[2] = new Employee("Adam Ken", 71000);
        employees[3] = new Worker("Bob Smith", 63000, "Księgowy");
        employees[4] = new Worker("Santa White", 18000, "Stazysta");
        employees[5] = new Manager("Barbie Ben", 50000, 0);
        employees[6] = new Worker("Kim King", 77000, "Marketer");

        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(2); // Ustawienie liczby podwładnych
                employee.setSalary(75000); // Ustawienie nowej pensji dla managerów
            }
        }

        System.out.println("Zaktualizowane dane pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}