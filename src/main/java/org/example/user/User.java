package org.example.user;

public abstract class User {
    private static int counter = 1;
    private int ID;
    private String name;
    private String surname;

    public User(String name, String surname) {
        ID = counter++;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
