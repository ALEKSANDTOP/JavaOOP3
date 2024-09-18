package Studentt;

import java.util.*;

public class PotokService{

    public void sortedPotok(List<Potok> potoks){
        Collections.sort(potoks, new StreamComarator());
    }
}
