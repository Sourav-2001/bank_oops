package Project;
import java.util.Scanner;
import java.io.*;
public class BankingManagementSystem {


// Java program for above approach

        private String name;
        private String address;
        private char acc_type;
        private float balance;

        // Constructor of class Bank
        BankingManagementSystem(){

            // Initializing values  0 for float
            // and null for String and character
            name=" ";
            address=" ";
            acc_type=' ';
            balance=0;
        }

        // Method to open the account
        void open_account()
        {
            name = "Aman Jhurani";
            System.out.println("Enter your full name: ");
            address = "Surat";
            System.out.println("Enter your address: ");
            acc_type = 'S';
            System.out.println("What type of account you want");
            System.out.println(" to open saving(S)   or Current(C): ");
            balance = 8000;
            System.out.println("Enter How much money   you want to deposit: ");
            System.out.println("Account Created   Successfully");
        }

        // Method to deposit the account
        void deposit_money()
        {
            int Amount;
            Amount = 9500;
            System.out.println( "Enter how much money you want to deposit: "+ Amount);
            balance += Amount;
            System.out.println( "\n Available Balance: "
                    + balance);
        }

        // Method to display the account
        void display_account()
        {
            System.out.println( "Name: " +name);
            System.out.println("Address: "+ address);
            System.out.println("Type: "+acc_type);
            System.out.println("Balance: " +balance);
        }

        // Method to withdraw the account
        void withdraw_money()
        {
            float amount;
            amount = 3200;
            System.out.println("Enter how much money  you want to withdraw: "+amount );
            balance -= amount;
            System.out.println("\n Available balance: "
                    + balance);
        }

        // Driver code
        public static void main(String[] args)
        {
            int choice;

            // Creating Customer Object of Bank Class
            BankingManagementSystem customer=new BankingManagementSystem();

            System.out.println("\n1) Open account \n");

            // Calling open_account() method
            // through customer object.
            customer.open_account();
            System.out.println("\n-----------------------\n");

            System.out.println("\n2) Deposit account \n");

            // Calling deposit_money()   method
            // through customer object.
            customer.deposit_money();
            System.out.println("\n-----------------------\n");

            System.out.println("\n3) Withdraw money \n\n");

            // Calling withdraw_money()  method
            // through customer object.
            customer.withdraw_money();
            System.out.println("\n-----------------\n");
            System.out.println("\n4) Display Account \n\n");

            // Calling display_account()  method
            // through customer object.
            customer.display_account();
            System.out.println("\n------------------------\n");
        }
    }


