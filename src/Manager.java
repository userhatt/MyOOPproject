public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, double salary, int teamSize) {
        super(name,age,salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name +" have a " + teamSize + " person in team");
    }
}

