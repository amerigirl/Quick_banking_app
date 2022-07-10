package com.company;

import java.util.Scanner;


public class BankingApplication {


    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(600, 50, "Be-Asia", "Mck1729");
        myAccount.showMenu();

    }
        static class BankAccount {

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
                    System.out.println("Deposited: " + previousTransaction);
                } else if (previousTransaction < 0) {
                    System.out.println("Withdrawn: " + Math.abs((previousTransaction)));
                } else
                    System.out.println("No transactions occurred");
            }


            public void showMenu() {
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

                //do while loop to cycle through option menu (with switch cases for each)
                do {
                    System.out.println("=======================================");
                    System.out.println("Enter an Option above to get started: ");
                    System.out.println("=======================================");
                    option = scanner.next().charAt(0);
                    System.out.println("\n");


                    switch (option) {
                        case 'A':
                            System.out.println("-------------------------------");
                            System.out.println("Balance = " + balance);
                            System.out.println("-------------------------------");
                            System.out.println("\n");
                            break;

                        case 'B':
                            System.out.println("-------------------------------");
                            System.out.println("Enter amount to deposit: ");
                            System.out.println("-------------------------------");
                            int amountToDeposit = scanner.nextInt();
                            deposit(amountToDeposit);
                            System.out.println("\n");
                            break;

                        case 'C':
                            System.out.println("-------------------------------");
                            System.out.println("Enter amount to withdraw: ");
                            System.out.println("-------------------------------");
                            int amountToWithdraw = scanner.nextInt();
                            withdraw(amountToWithdraw);
                            System.out.println("\n");

                        case 'D':
                            System.out.println("--------------------------------");
                            getPreviousTransaction();
                            System.out.println("--------------------------------");
                            System.out.println("\n");
                            break;

                        case 'E':
                            System.out.println("********************************");
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

        }



