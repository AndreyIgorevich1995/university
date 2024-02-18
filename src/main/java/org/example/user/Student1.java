package org.example.user;

public class Student1 extends User{
    private Group group;

    public Student1(String name, String surname/*, Group group*/) {
        super(name, surname);
//        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
