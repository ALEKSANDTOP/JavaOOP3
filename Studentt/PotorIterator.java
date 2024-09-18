package Studentt;

import java.util.Iterator;
import java.util.List;

public class PotorIterator implements Iterator<StudentGroup> {

    private final List<StudentGroup> studentGroups;
    private Integer counter;

    public PotorIterator(Potok studentGroup) {
        this.studentGroups = studentGroup.getStudentGroups();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroups.size() -1;
    }

    @Override
    public StudentGroup next() {
        if(!hasNext()){
            return null;
        }
        counter ++;
        return studentGroups.get(counter);
    }

    @Override
    public void remove() {
       studentGroups.remove(counter);
    }
}

