package org.example;

import org.example.controller.Controller;
import org.example.controller.Controller1;
import org.example.repository.UserRep;
import org.example.repository.UserRepImpl;
import org.example.repository.UserRepository;
import org.example.repository.UserRepositoryImpl;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.example.tests.TestsNames2;
import org.example.tests.TestsQuestion;
import org.example.user.Group;
import org.example.user.Student1;
import org.example.user.User;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class Main {
//    public static List<Group> groups = new ArrayList();
//    public static List<User> users = new ArrayList();
//    public static Subject subject = new Subject();

    public static void main(String[] args) {
//        Student1 student1 = new Student1("a", "b", new Group(1));
//        student1.getID();
//        users.add(new Student1("a", "b", new Group(1)));
//        TestsNames2 testsNames2 = new TestsNames2();
//        TestsQuestion testsQuestion = new TestsQuestion();
//        testsNames2.setTestsQuestion(testsQuestion);

//        UserRepository userRepository = new UserRepositoryImpl();
//        UserService userService = new UserServiceImpl(userRepository);
//        Controller controller = new Controller(userService);
//        controller.register();
        UserRep userRep = new UserRepImpl();
        Controller1 controller1 = new Controller1(userRep);
        controller1.register();
    }
}