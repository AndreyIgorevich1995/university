package org.example.tests;

import java.util.ArrayList;
import java.util.List;

public class TestsNames2 {
    private List<String> English;
    private List<String> Math;
    private List<List<String>> titles;
    private TestsQuestion testsQuestion;

    public TestsNames2() {
        English = new ArrayList<>();
        English.add("Местоимения личные");
        English.add("Местоимения указательные");
        English.add("Существительные");
        Math = new ArrayList<>();
        Math.add("Сумма");
        Math.add("Произведение");
        Math.add("Частное");
        titles = new ArrayList<>();
        titles.add(English);
        titles.add(Math);
    }

    public List<String> getEnglish() {
        return English;
    }

    public void setEnglish(List<String> english) {
        English = english;
    }

    public List<String> getMath() {
        return Math;
    }

    public void setMath(List<String> math) {
        Math = math;
    }

    public List<List<String>> getTitles() {
        return titles;
    }

    public void setTitles(List<List<String>> titles) {
        this.titles = titles;
    }

    public TestsQuestion getTestsQuestion() {
        return testsQuestion;
    }

    public void setTestsQuestion(TestsQuestion testsQuestion) {
        this.testsQuestion = testsQuestion;
    }
}
