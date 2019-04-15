package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Enter First name
        System.out.println("Enter firstName");
        String firstname = scanner.next();

//        Enter last name
        System.out.println("Enter lastName");
        String lastName = scanner.next();

//        Enter academicYear
        System.out.println("Enter your Academic Year \n Ex: 2016");
        String academicYear = scanner.next();



        Email email = new Email(firstname,lastName,academicYear);

        System.out.println("Chage passsword \n Enter password to changed default password");
        String changedPwd = scanner.next();
        email.changePassword(changedPwd);
//        System.out.println("Changed Password is: "+email.getPassword());

        System.out.println("Enter Your Normal Email Address");
        String normalEmail = scanner.next();
        email.setAlternateEmail(normalEmail);
//        System.out.println("Normal email is: "+email.getAlternateEmail());

        System.out.println(email.showInfo());
    }
}
