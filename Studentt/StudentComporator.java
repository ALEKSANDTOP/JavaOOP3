package Studentt;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int resultOfName = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfName == 0){
            resultOfName = o1.getLastName().compareTo(o2.getLastName());
            if (resultOfName == 0){
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            }
            else {
                return resultOfName;
            }

        }
        else {
            return resultOfName;
        }

    }
}
