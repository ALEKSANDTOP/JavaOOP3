package Studentt;

import java.util.List;

public class TeacherController {
    TeacherGroup teacherGroup = new TeacherGroup();
    TeacherService teacherService = new TeacherService();


    public List<Techer> getListTeacher(){
        return teacherGroup.getTecherList();
    }
    public void editorTeacher(Integer teacherId, String firstName, String lastName, String middleName){
        teacherService.editorTeacher(teacherId, firstName, lastName, middleName);

    }




}
