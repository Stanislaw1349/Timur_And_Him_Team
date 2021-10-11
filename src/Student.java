public class Student {

    String name;
    int age;
    char sex;
    boolean free;


    public Student(String name, int age, char sex, boolean free) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.free = free;
    }
    void printStudent(){
        System.out.println(name + age + sex + free);
    }
}
