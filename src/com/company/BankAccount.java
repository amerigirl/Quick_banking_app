package com.company;

public class BankAccount {

    int balance;
    int previousTransaction;
    String customerName;
    String customerId;


//deposit only if there is an amount > 0
        private void deposit(int amount) {

        if(amount != 0){
            balance = amount + balance;
            previousTransaction = amount;
        }
    }

    //withdraw only if amount != 0
    private void withdraw(int amount2) {
        if (amount2 != 0) {
            balance = balance - amount2;
            previousTransaction = -amount2;
        }
        }

        //get previous transaction only if previous transaction > 0
    private void getPreviousTransaction(int amount3) {

        if(previousTransaction > 0 ){
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs((previousTransaction)));
        } else
        System.out.println("No transactions occurred");
    }

    }


