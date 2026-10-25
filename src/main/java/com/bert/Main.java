package com.bert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        modules.printTitle();
        modules.printOptions();
        
        System.out.println(" ");
        System.out.print("Enter your choice : ");
        int Choice = sc.nextInt();

        AnsiE.clearScreen();

        if (Choice == 1) {

            modules.m1();
        }
        if (Choice == 2) {

            modules.m2();
        }
        if (Choice == 3) {

            modules.m3();
        }
        if (Choice == 4) {
            modules.m4();
        }
        if (Choice == 5) {
            modules.m5();
        }
        if (Choice == 6) {
           modules.m6();
        }
        if (Choice == 7) {
            modules.m7();
        }
        if (Choice == 8) {
            modules.m8();
        }
        if(Choice == 9){
            modules.m9();
        }
    }
}