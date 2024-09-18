package Studentt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<StudentGroup> {

    private List<StudentGroup> studentGroups = new ArrayList<>();


    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new PotorIterator(this);

    }

}
