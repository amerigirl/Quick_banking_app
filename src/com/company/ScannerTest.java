package com.company;

import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHello, and welcome to mobile banking! We're happy to meet all of your banking needs.  \nTo get us started, please enter a number: ");

        int a = scanner.nextInt();
        System.out.println("You typed " + a + "," + "thanks!");
    }

}
