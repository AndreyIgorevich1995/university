package org.example.user;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private static int counter = 1;
    private int ID;
    private List<Student1> students1;
    private List<Teacher1> teacher1s;

    public Group(int ID) {
        ID = counter++;
        students1 = new ArrayList<>();
        teacher1s = new ArrayList<>();
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Group.counter = counter;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Student1> getStudents() {
        return students1;
    }

    public void setStudents(List<Student1> students) {
        this.students1 = students;
    }

    public List<Teacher1> getTeacher1s() {
        return teacher1s;
    }

    public void setTeacher1s(List<Teacher1> teacher1s) {
        this.teacher1s = teacher1s;
    }
}
