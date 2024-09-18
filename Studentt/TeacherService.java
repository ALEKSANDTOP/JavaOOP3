package Studentt;

import java.util.List;

public class TeacherService {
    private TeacherGroup teacherGroup;
    private List<Techer> techerList;
    private Integer maxTeacherId = getMaxTeacherId();



    public void editorTeacher(Integer teacherId, String firstName, String lastName, String middleName){
        for (Techer techer : techerList){
            if (techer.getTeacherIg().equals(techer.getTeacherIg())){
                techer.setFirstName(firstName);
                techer.setLastName(lastName);
                techer.setMiddleName(middleName);
            }
        }

    }
    private Integer getMaxTeacherId(){
        int result = techerList.get(0).getTeacherIg();
        for (Techer techer : techerList){
            if(result < techer.getTeacherIg()){
                result = techer.getTeacherIg();
            }
        }
        return result;
    }


}
