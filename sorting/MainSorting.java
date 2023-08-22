package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainSorting {
    public static void main(String[] args) {
        // Way-1
        int arr[] = { 12, 11, 24, 13, 53 };
        Arrays.sort(arr);
        for (int i : arr)
            System.out.print(i + " ");
        // Way-2
        List<Integer> list = Arrays.stream(arr).boxed().toList(); // mutable object can't be sorted by Collections.sort()                                                                  
        System.out.println("\nSorted : " + list);
        // Way-3
        List<Integer> list1 = new ArrayList<>(Arrays.stream(arr).boxed().toList()); // immutable for Collections.sort()
        Collections.sort(list1);
        System.out.println("\nSorted List : " + list1);

        // Way-4
        // java automatically converts primitive type to object ,this way is called-
        // Auto-Boxing conversion
        // java automatically converts object to primitive type ,this way is called-
        // Auto-UnBoxing conversion
        // here Auto-Boxing
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(11);
        list2.add(24);
        list2.add(13);
        list2.add(53);
        System.out.println("\nUn-Sorted List : " + list2);
        Collections.sort(list2);
        System.out.println("Sorted List : " + list2);

        //way-5
        System.out.println("_________________________________________________________");
        // write logic for custom object how java will compare these objects idwise,
        // namewise, agewise.
        // we can sort in 2 ways -
        // (1)Comparable interface(present in java.lang) -it has compareTo() method, &
        // method contains one parameter. it supports single sorting logic.
        // (2)Comparator interace(present in java.util) - it has compare() method, &
        // method contains two parameters. it supports multiple sorting logic.
        // Auto Un-Boxing
        // (1). sorting by comparable
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "pragya", "26"));
        students.add(new Student(87, "Komal", "26"));
        students.add(new Student(51, "priya", "26"));
        students.add(new Student(70, "sandhya", "26"));
        Collections.sort(students);
        System.out.println("\nSorted with Comparable by id:- ");
        System.out.println(students);

        // (2). sorting by comparator
        List<Tutor> tutors = new ArrayList<>();
        tutors.add(new Tutor(45, "John", "55"));
        tutors.add(new Tutor(36, "Jemi", "34"));
        tutors.add(new Tutor(60, "Harry", "36"));
        Collections.sort(tutors, new IdComparator());
        System.out.println("\nSorted with Comparator by id:- ");
        System.out.println(tutors);

        //way-6
        // predefined collection i.e (TreeSet) - which has in-built sorting features
        Set<Tutor> set = new TreeSet<>(new NameComparator());
        set.add(new Tutor(45, "John", "55"));
        set.add(new Tutor(36, "Jemi", "34"));
        set.add(new Tutor(60, "Harry", "36"));
        System.out.println("\nSorted with TreeSet by name:- ");
        System.out.println(set);

        System.out.println("____________________________________________________________________\n");

    }
}
// _______________________OUTPUT_____________________________________________
// 11 12 13 24 53
// Sorted : [11, 12, 13, 24, 53]

// Sorted List : [11, 12, 13, 24, 53]

// Un-Sorted List : [12, 11, 24, 13, 53]
// Sorted List : [11, 12, 13, 24, 53]
// _________________________________________________________

// Sorted with Comparable by id:-
// [Student [id=87, name=Komal, age=26], Student [id=10, name=pragya, age=26],
// Student [id=51, name=priya, age=26], Student [id=70, name=sandhya, age=26]]

// Sorted with Comparator by id:-
// [Tutor [id=36, name=Jemi, age=34], Tutor [id=45, name=John, age=55], Tutor [id=60, name=Harry, age=36]]

// Sorted with TreeSet by name:-
// [Tutor [id=60, name=Harry, age=36], Tutor [id=36, name=Jemi, age=34], Tutor [id=45, name=John, age=55]]
// ____________________________________________________________________