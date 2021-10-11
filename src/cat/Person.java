package cat;

public class Person {
    int money = 0;
    String name;
    Cat cat;

    public Person(String name) {
        this.name = name;
    }
    public void buyCat (Cat cat) {
        if (cat.price < money) {
            money -= cat.price;
            this.cat = cat;
            System.out.println("Поздравляем вы купили " + cat.name);
        }else {
            System.out.println("Работай больше ради кота");
        }
    }
}
