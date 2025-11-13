package controller;
import model.Role;
import model.User;
import java.util.ArrayList;
public class ManageUser {
    private ArrayList<User> userList = new ArrayList<>();
    public void seedUser() {
        userList.add(new User("U01", "Alice", "alice@fpt.edu.vn", Role.STUDENT));
        userList.add(new User("U02", "Bob", "bob@fpt.edu.vn", Role.STUDENT));
        userList.add(new User("I03", "Charlie", "charlie@gmail.com", Role.INSTRUCTOR));
    }
}
