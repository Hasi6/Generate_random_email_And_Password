package com.company;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String academinYear;
    private String studentEmail;
    private String alternateEmail;
    private String addlastpartt = "@stu.kln.ac.lk";


    // add and store first name and last name for Create Email
    public Email(String firstName, String lastName, String academinYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.academinYear = academinYear;
        System.out.println("Your Name is: "+this.firstName + " " +this.lastName);

//    call the setDepartment methode
        this.department = setDepartment();
        System.out.println("Department is: "+this.department);

//        Call the generatePassword Methode
        this.password = generatePassword(16);
        System.out.println("Your Password is: "+this.password);

//        add data and generate student Email
        studentEmail = firstName.toLowerCase() +"."+ lastName.toLowerCase() + "_" +this.department+"_"+academinYear+addlastpartt;
        System.out.println("Your Student Email is: "+studentEmail);
    }

    // select which deparment student
    private String setDepartment(){
        System.out.println("Press");
        System.out.println("\t 1- for Software Engineering");
        System.out.println("\t 2- for MIT");
        System.out.println("\t 3- for Bio Science");
        System.out.println("\t 4- for ENCM");
        System.out.println("\t 5- for Physical");

        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();

        switch(department){
            case 1: return "se";
            case 2: return "mit";
            case 3: return "bs";
            case 4: return "em";
            case 5: return "bs";
            default: return "or";
        }
    }

//    create a random password
    private String generatePassword(int length){
        String passwordGenerate = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
        char [] passwords = new char[length];

        for (int i=0; i<length;i++){
            int randomValue = (int) (Math.random() * passwordGenerate.length());
            passwords[i] = passwordGenerate.charAt(randomValue);
        }
        return new String (passwords);
    }

//        set alternate Email
        public void setAlternateEmail(String alternateEmail){
            this.alternateEmail = alternateEmail;
        }

//        set change Password
        public void changePassword(String password){
            this.password = password;
        }

    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Dispaly Name: " +firstName + " "+ lastName +
                "\n Department is: "+this.department+
                "\n Studentr Email is: " + studentEmail+ "\n password is: "+getPassword()+
                "\n Normal Email is: "+getAlternateEmail();
    }

}


