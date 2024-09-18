package Studentt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PotokService {

    public void sortedPotok(){
       List<Potok> studentGroupList = new ArrayList<>();
       Collections.sort(studentGroupList, new StreamComarator());
    }
}
