public class Developer extends Employee {
    private String mainLanguage;

    public Developer(String name, int age, double salary, String mainLanguage) {
        super(name,age,salary);
        this.mainLanguage = mainLanguage;
    }


    @Override
    public void work() {
        System.out.println(name + " use " + mainLanguage);
    }


    public void writeCode() {
        System.out.println(name + " create st");
    }
}