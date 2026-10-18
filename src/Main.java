import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();


        employees.add(new Developer("Kirill", 18, 3500, "Java"));
        employees.add(new Developer("David", 24, 3000, "Python"));
        employees.add(new Manager("Levon", 32, 5000, 8));


        System.out.println("=== INFO ===");
        for (Employee emp : employees) {
            emp.displayInfo();
            emp.work();
            System.out.println("-----------------------------------");
        }
    }
}