import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    String username;
    String email;
    int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User: " + username + ", Email: " + email + ", Age: " + age;
    }
}