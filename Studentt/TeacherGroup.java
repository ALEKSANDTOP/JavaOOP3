package Studentt;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Techer>{

    private List<Techer> techerList;


    public List<Techer> getTecherList() {
        return techerList;
    }

    public void setTecherList(List<Techer> techerList) {
        this.techerList = techerList;
    }

    @Override
    public Iterator<Techer> iterator() {
        return new TeacherGroupIterator(this);
    }
}
