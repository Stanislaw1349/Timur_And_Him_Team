public class Result {
    public static void main(String[] args) {
        int b = 17;
        Student student1 = new Student( "Ivan ", b, 'M', true );
        student1.printStudent();

        int a = 0;
        University university1 = new University(student1, "IT", a, "online");

         university1.getCurseByAge(b);
         university1.printUniversity();
    }
}
