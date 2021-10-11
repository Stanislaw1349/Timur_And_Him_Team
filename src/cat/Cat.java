package cat;

public class Cat {
    String name;
    int age;
    String color;
    int price;
    String sex;
    boolean balls;


    public Cat() {}

    public Cat(String name, int age, String color, int price) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.price = price;
    }

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
