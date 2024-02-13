package org.example.tests;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<String> subject;             //стартовый набор предметов
    private TestsNames2 testsNames2;
    protected TestsQuestion testsQuestion;

    public Subject() {
//        testsQuestion = new TestsQuestion();
//        testsNames2 = new TestsNames2();
        subject = new ArrayList<>();
        subject.add("English");
        subject.add("Math");
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        subject = subject;
    }

    public TestsNames2 getTestsNames2() {
        return testsNames2;
    }

    public void setTestsNames2(TestsNames2 testsNames2) {
        this.testsNames2 = testsNames2;
    }

    public TestsQuestion getTestsQuestion() {
        return testsQuestion;
    }

    public void setTestsQuestion(TestsQuestion testsQuestion) {
        this.testsQuestion = testsQuestion;
    }
}
