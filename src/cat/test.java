package cat;

public class test {

    public static void main(String[] args) {
        Person person = new Person("Valera");
        earnMoney(person);
        System.out.println(person.money);
        person.buyCat(new Cat("Murzik",15,"red",999));
        earnMoney(person);
        person.buyCat(new Cat("Murzik",15,"red",999));
        person.cat.balls = true;
        System.out.println();
    }
    static void earnMoney(Person person) {
        int salaryForDay = 500;
        person.money += salaryForDay;
    }
}
