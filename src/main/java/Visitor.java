public class Visitor {


    private int money;
    private int age;
    private String name;

    public Visitor(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getMoney() {
        return this.money;
    }
}
