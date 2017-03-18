package com.sdajava.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    String login = "Marciocha";
    String password = "12345";
    String userLogin;
    String userPassword;

    boolean flag = true;
    boolean optionFlag = true;

    Scanner in = new Scanner(System.in);

    while (flag){

    System.out.println("Podaj login: ");
    userLogin = in.nextLine();

    System.out.println("Podaj haslo: ");
    userPassword = in.nextLine();

    if(!(userLogin.equals(login) && userPassword.equals(password))){
        System.out.println("Podales zle dane");
        }else{
        flag = false;
    }
    while(optionFlag){
        System.out.println(Gui.companyName);
        Gui.showMenu();
    }

    }


    }
}
