package Studentt;

import java.util.List;

public class StudentController implements UserController<Student>{

    StudentService studentService = new StudentService();
    PotokService potok = new PotokService();
    StudentView studentView = new StudentView();

    public void removeStudentByFIO(String firstName, String lastname, String middleName){
        studentService.removeStudentByFIO(firstName, lastname, middleName);
    }
    public List<Student> sortById(){
         return studentService.sortById();
    }
    public List<Student> sortByFIO(){
        List<Student> studentList = studentService.sortByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }
    public void sortedPotok(List<Potok> potoks){
        potok.sortedPotok(potoks);
    }

    @Override
    public void create(String firstName, String lastName, String middleName){
        studentService.createStudent(firstName, lastName, middleName);

    }
}
