package org.example.user;

import java.util.ArrayList;
import java.util.List;

public class Teacher1 extends User{
    private String subject;
    private List<Group> groups;

    public Teacher1(String name, String surname, String subject) {
        super(name, surname);
        this.subject = subject;
        groups = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Teacher1{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
