package DesignPattern.IteratorPattern;

public class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", userId=" + userId + "]";
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

}
