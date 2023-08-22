package sorting;

import java.util.Comparator;

public class IdComparator implements Comparator<Tutor> {



    @Override
    public int compare(Tutor o1, Tutor o2) {
       return o1.id -o2.id;
    }
    
}
