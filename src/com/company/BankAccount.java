package com.company;

import java.util.Scanner;


public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;

    //basic constructor

    public BankAccount(String custId, String custName) {
        customerId = custId;
        customerName = custName;
            }

    //deposit only if there is an amount > 0
        public void deposit(int amount) {

        if(amount != 0){
            balance = amount + balance;
            previousTransaction = amount;
        }
    }

    //withdraw only if amount != 0
    public void withdraw(int amount2) {
        if (amount2 != 0) {
            balance = balance - amount2;
            previousTransaction = -amount2;
        }
        }

        //get previous transaction only if previous transaction > 0
    public void getPreviousTransaction(int amount3) {

        if(previousTransaction > 0 ){
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs((previousTransaction)));
        } else
        System.out.println("No transactions occurred");
    }

    //show menu method
    public void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName + ", thank you for banking with us today!");
        System.out.println("ID: " + customerId);
        System.out.println("\n");
        System.out.println("A. Balance: ");
        System.out.println("B. Deposit: ");
        System.out.println("C. Withdraw: ");
        System.out.println("D. Previous Transaction: ");
        System.out.println("E. Exit: ");

        do {
            System.out.println("=======================================");
            System.out.println("Enter an Option above to get started: ");
            System.out.println("=======================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");


            switch (option) {

            }


        }


    }

    //getters and setters
    public int getBalance() {
        return balance;
    }

    public int getPreviousTransaction() {
        return previousTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }


}


