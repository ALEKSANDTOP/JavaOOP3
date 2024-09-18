package Studentt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentService {

    private StudentGroup students;
    private Potok potok;

    public void removeStudentByFIO(String firstName, String lastname, String middleName){
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastname) && student.getMiddleName().equals(middleName)){
                iterator.remove();
            }
        }
    }

    public List<Student> sortById(){
        List<Student> studentList = new ArrayList<>(students.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> sortByFIO(){
        List<Student> studentList = new ArrayList<>(students.getStudentList());
        studentList.sort(new StudentComporator());
        return studentList;
    }

}
