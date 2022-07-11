package com.company;

import java.util.Scanner;


public class BankingApplication extends BankAccount {



    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(600, 50, "Be-Asia", "Mck1729");
        myAccount.showMenu();
    }

    BankingApplication(int balance, int previousTransaction, String customerName, String customerId) {
        super(balance, previousTransaction, customerName, customerId);
    }
}



