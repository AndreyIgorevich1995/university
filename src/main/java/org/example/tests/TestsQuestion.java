package org.example.tests;

import java.util.ArrayList;
import java.util.List;

public class TestsQuestion {
    private List<String> English;
    private List<String> Math;
    private List<List<String>> question;
    private TestsNames2 testsNames2;

    public TestsQuestion() {
        English = new ArrayList<>();
        English.add("We");
        English.add("I");
        English.add("Hi");
        English.add("She");
        Math = new ArrayList<>();
        Math.add("Сумма");
        Math.add("Произведение");
        Math.add("Частное");
        question = new ArrayList<>();
        question.add(English);
        question.add(Math);
    }
}
