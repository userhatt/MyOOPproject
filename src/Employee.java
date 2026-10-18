public abstract class Employee { // Сделали класс абстрактным
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public abstract void work();

    public void displayInfo() {
        System.out.println("Employee: " + getName() + " | Salary: " + getSalary()+ "€ | " + getAge() + " age");
    }
}
