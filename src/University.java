public class University {
    Student student;
    String facultet;
    int curse;
    String forma;


    public University(Student student, String facultet, int curse, String forma) {
        this.student = student;
        this.facultet = facultet;
        this.curse = curse;
        this.forma = forma;
    }
    void printUniversity(){
        student.printStudent();
        System.out.println("facultet " + facultet + " curse " + curse + " forma " + forma);
    }

    int getCurseByAge(int studentAge){
       if (studentAge > 16 && studentAge < 21){
        curse = studentAge -15;
        return curse;
       }
        curse = 0;
       return curse;


    }




}
