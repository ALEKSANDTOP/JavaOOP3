package Studentt;

import java.util.Comparator;

public class StreamComarator implements Comparator<Potok> {

    @Override
    public int compare(Potok o1, Potok o2) {
        return Integer.compare(o1.getStudentGroups().size(), o2.getStudentGroups().size());
    }
}
