package com.company;

import java.util.Scanner;

public class BankAccount {

        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

        BankAccount(int balance, int previousTransaction, String customerName, String customerId) {
            this.balance = balance;
            this.previousTransaction = previousTransaction;
            this.customerName = customerName;
            this.customerId = customerId;
        }

        //deposit only if there is an amount > 0
        public void deposit(int amount) {

            if (amount != 0) {
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

        public void getPreviousTransaction() {

            if (previousTransaction > 0) {
                System.out.println("Last transaction = A deposit in the amount of: " + "$" + previousTransaction);
            } else if (previousTransaction < 0) {
                System.out.println("Last transaction = A withdrawal in the amount of: " + "$" + Math.abs((previousTransaction)));
            } else
                System.out.println("No transactions occurred");
        }

        public void showMenu() {
            char option = '\0';
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\nWelcome " + customerName + ", thank you for banking with us today!");
            System.out.println("In case you need it, here is your ID number: \nID: " + customerId);
            System.out.println("\n");
            System.out.println("A. Balance: ");
            System.out.println("B. Deposit: ");
            System.out.println("C. Withdraw: ");
            System.out.println("D. Previous Transaction: ");
            System.out.println("E. Exit: ");

            //do while loop to cycle through option menu (with switch cases for each)
            do {
                System.out.println("=======================================");
                System.out.println("Enter an Option above to get started: ");
                System.out.println("=======================================");
                option = scanner.next().toUpperCase().charAt(0);  //made the option case-insensitive, just for fun because I know how to do that :-)
                System.out.println("\n");


                switch (option) {
                    case 'A':
                        System.out.println("-------------------------------");
                        System.out.println("Your current balance is: " + "$" + balance);
                        System.out.println("-------------------------------");
                        System.out.println("\nThank you for banking with us! \nPlease choose another option or type E to exit. ");
                        System.out.println("\n");
                        break;

                    case 'B':
                        System.out.println("-------------------------------");
                        System.out.println("Enter the amount you would like to deposit today: ");
                        System.out.println("-------------------------------");
                        int amountToDeposit = scanner.nextInt();
                        deposit(amountToDeposit);
                        System.out.println("Total amount deposited today: " + "= " + "$" + amountToDeposit);
                        System.out.println("Your current balance is: " + "$" + balance);
                        System.out.println("\nThank you for banking with us! \nPlease choose another option or type E to exit. ");
                        System.out.println("\n");
                        break;

                    case 'C':
                        System.out.println("-------------------------------");
                        System.out.println("Enter amount to withdraw: ");
                        System.out.println("-------------------------------");
                        int amountToWithdraw = scanner.nextInt();
                        withdraw(amountToWithdraw);
                        System.out.println("\nTotal amount withdrawn today: " + "= " + "$" + amountToWithdraw);
                        System.out.println("Your current balance is: " + "$" + balance);
                        System.out.println("\nThank you for banking with us! \nPlease choose another option or type E to exit. ");
                        System.out.println("\n");
                        break;

                    case 'D':
                        System.out.println("----------------------------------------------------");
                        getPreviousTransaction();
                        System.out.println("----------------------------------------------------");
                        System.out.println("Your current balance is: " + "$" + balance);
                        System.out.println("\nThank you for banking with us! \nPlease choose another option or type E to exit. ");
                        System.out.println("\n");
                        break;

                    case 'E':
                        //System.out.println("We appreciate your business here at Mckerracher's Bank.");
                        break;

                    default:
                        System.out.println("Please enter a valid letter (A-E)");
                        break;
                }

            } while (option != 'E');
            {
                System.out.println("Thank you for using our services. We will see you next time!");
            }
        }

    }


