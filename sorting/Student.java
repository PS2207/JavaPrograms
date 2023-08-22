package sorting;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    String age;
    public Student(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o2) {
    //    return this.id - o2.id;
       return this.name.compareTo(o2.name);
    }

    
}
