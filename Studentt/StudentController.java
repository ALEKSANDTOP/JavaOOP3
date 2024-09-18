package Studentt;

import java.util.List;

public class StudentController {

    StudentService studentService = new StudentService();
    PotokService potok = new PotokService();

    public void removeStudentByFIO(String firstName, String lastname, String middleName){
        studentService.removeStudentByFIO(firstName, lastname, middleName);
    }
    public List<Student> sortById(){
         return studentService.sortById();
    }
    public List<Student> sortByFIO(){
        return studentService.sortByFIO();
    }
    public void sortedPotok(){
        potok.sortedPotok();
    }
}
