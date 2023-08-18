package DesignPattern.IteratorPattern;

import java.util.ArrayList;

public class UserManagement {
    // we want to traverse all the users of UserManagement without knowing its
    // implementation.
    // using iterator pattern so that one don't know the implementation, who is
    // traversing user
    private ArrayList<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public User getUser(int index) {
        return userList.get(index);
    }

    public MyIterator getIterator() {
        return new MyIteratorImpl(userList);
    }
}
