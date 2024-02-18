package org.example.controller;

import org.example.repository.UserRep;
import org.example.repository.UserRepImpl;
import org.example.service.UserService;
import org.example.user.Administrator1;
import org.example.user.Student1;
import org.example.user.Teacher1;
import org.example.user.User;

import java.util.Scanner;

public class Controller1 {
    private Scanner scanner = new Scanner(System.in);
    private UserService userService;
    private UserRep userRep;

//    public Controller1(UserService userService) {
//        this.userService = userService;
//    }


    public Controller1(UserRep userRep) {
        this.userRep = userRep;
    }

    public void register() {
        System.out.println("Введите '1', чтобы войти в систему или '2', чтобы зарегистрироваться");
        int registre = scanner.nextInt();
        if (registre == 2) {
            System.out.println("Введите имя");
//            String name = scanner.nextLine();
            String name = scanner.next();

            System.out.println("Введите фамилию");
            String secondName = scanner.next();

            System.out.println("Ваш профиль");
            System.out.println("Выберете из списка подходящий");
            System.out.println("1 - Student");
            System.out.println("2 - Teacher");
            System.out.println("3 - Admin");
            int role = scanner.nextInt();
            User user = null;
            if (role == 1) {
                user = new Student1(name, secondName);
            } else if (role == 2) {
                System.out.println("Введите ваш предмет");
                String subject = scanner.next();
                user = new Teacher1(name, secondName, subject);
            } else if (role == 3) {
                user = new Administrator1(name, secondName);
            }
//            int ID = userService.saveUser(user);
            int ID = userRep.saveUser(user);

            System.out.println("Вы зарегистрировались");
            System.out.println("Ваш ID " + ID);
        }
    }
}
