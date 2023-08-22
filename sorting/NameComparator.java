package sorting;

import java.util.Comparator;

// sort tutor object namewise using Comparator interface
public class NameComparator implements Comparator<Tutor> {

    @Override
    public int compare(Tutor o1, Tutor o2) {
      return o1.name.compareTo(o2.name);
    }
    
}
