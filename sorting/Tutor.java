package sorting;

public class Tutor {
    int id;
    String name;
    String age;

    public Tutor(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tutor [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
