package Studentt;

public class Student implements Comparable<Student> {

    private Integer studentId;
    private String firstName;
    private String lastName;
    private String middleName;

    public String getFirstName() {
        return firstName;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
