package Studentt;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Techer> {

    private int counter;
    private List<Techer> techerList;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.counter = 0;
        this.techerList = teacherGroup.getTecherList();
    }

    @Override
    public boolean hasNext() {
        return counter < techerList.size();
    }

    @Override
    public Techer next() {
        if(!hasNext()){
            return null;
        }
        counter++;
        return techerList.get(counter);
    }

    @Override
    public void remove() {
       techerList.remove(counter);
    }
}
