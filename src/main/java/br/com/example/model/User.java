package br.com.example.model;

/**
 * Created by alvarosilva on 22/12/16.
 */
public class User {
    String name;
    String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
