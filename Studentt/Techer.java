package Studentt;

public class Techer extends User implements Comparable<Techer>{

    private Integer teacherIg;

    public Techer(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }


    public Integer getTeacherIg() {
        return teacherIg;
    }

    public void setTeacherIg(Integer teacherIg) {
        this.teacherIg = teacherIg;
    }

    @Override
    public int compareTo(Techer o) {
        return this.teacherIg.compareTo(o.teacherIg);
    }
}
