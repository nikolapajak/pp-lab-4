// Company.java
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Michael Jackson", 60000);
        employees[1] = new Employee("Harry Potter", 60000);
        employees[2] = new Employee("Adam Ken", 71000);
        employees[3] = new Employee("Bob Smith", 32000);
        employees[4] = new Employee("Santa White", 18000);

        System.out.println("Dane pracownika o indeksie 3: " + employees[3]);

        employees[3].setSalary(54000);

        System.out.println("Dane wszystkich pracowników:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}