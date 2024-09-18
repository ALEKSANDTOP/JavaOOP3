package Studentt;

import java.util.Comparator;

public class UserComporator <T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfName = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfName == 0){
            resultOfName = o1.getLastName().compareTo(o2.getLastName());
            if (resultOfName == 0){
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            }
            else {
                return resultOfName;
            }

        }
        else {
            return resultOfName;
        }

    }
}
