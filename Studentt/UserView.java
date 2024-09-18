package Studentt;

import java.util.List;

public interface UserView <T extends User>{

    void sendOnConsole(List<T> list);
    void getTeacherList(List<T> list);
    void redTeacher();
}
