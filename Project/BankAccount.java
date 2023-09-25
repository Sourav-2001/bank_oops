package Project;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


    class BankAccount {
        private String accountNumber;
        private String accountHolder;
        public double balance;

        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit of Rs " + amount + " successful. New balance: Rs " + balance);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal of Rs " + amount + " successful. New balance: Rs " + balance);
            } else {
                System.out.println("Insufficient funds!");
            }
        }

        public void display() {
            System.out.println("Account Information:");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: Rs " + balance);
        }
    }

     class BankManagementSystem {
         public static void main(String[] args) {
             Map<String, BankAccount> accounts = new HashMap<>();
             Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nBank Management System");
                System.out.println("1. Open Account");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Display Account");
                System.out.println("5. transfer amount");
                System.out.println("6. Exit");

             System.out.print("Enter your choice (1-6): ");
             String choice = scanner.nextLine();


             if (choice.equals("1")) {
                 System.out.print("Enter account number: ");
                 String accountNumber = scanner.nextLine();
                 System.out.print("Enter account holder name: ");
                 String accountHolder = scanner.nextLine();
                 System.out.print("Enter initial balance: ");
                 double balance = scanner.nextDouble();
                 scanner.nextLine();

                 BankAccount account = new BankAccount(accountNumber, accountHolder, balance);
                 accounts.put(accountNumber, account);
                 System.out.println("Account created successfully!");
             }
             else if (choice.equals("2")) {
                 System.out.print("Enter account number: ");
                 String accountNumber = scanner.nextLine();
                 BankAccount account = accounts.get(accountNumber);
                 if (account != null) {
                     System.out.print("Enter deposit amount: ");
                     double amount = scanner.nextDouble();
                     scanner.nextLine();
                     account.deposit(amount);
                 } else {
                     System.out.println("Account not found!");
                 }
             } else if (choice.equals("3")) {
                 System.out.print("Enter account number: ");
                 String accountNumber = scanner.nextLine();
                 BankAccount account = accounts.get(accountNumber);
                 if (account != null) {
                     System.out.print("Enter withdrawal amount: ");
                     double amount = scanner.nextDouble();
                     scanner.nextLine();
                     account.withdraw(amount);
                 } else {
                     System.out.println("Account not found!");
                 }
             } else if (choice.equals("4")) {
                 System.out.print("Enter account number: ");
                 String accountNumber = scanner.nextLine();
                 BankAccount account = accounts.get(accountNumber);
                 if (account != null) {
                     account.display();
                 } else {
                     System.out.println("Account not found!");
                 }
             }
             else if (choice.equals("5")) {
                 System.out.print("Enter  sender's account number: ");
                 String senderAccount = scanner.nextLine();

                 System.out.print("Enter  reciver's account number: ");
                 String recieverAccount = scanner.nextLine();

                 System.out.print("Enter  amount to transfer: ");
                 double transferAmount = scanner.nextDouble();

                 if (accounts.containsKey(senderAccount) && accounts.containsKey(recieverAccount))
                 {
                     BankAccount account1 = accounts.get(senderAccount);
                     BankAccount account2 = accounts.get(recieverAccount);
                         if (account1.balance >= transferAmount) {
                             account1.balance -= transferAmount;
                             account2.balance += transferAmount;
                         } else {
                             System.out.println("Insufficient funds!");
                         }
                 }
                 else {
                     System.out.println("one or both account not present");
                 }
             }
             else if (choice.equals("6")) {
                 System.out.println("Exiting...");
                 break;
             }

//             else {
//                 System.out.println("Invalid choice! Please try again.");
//                 break;
//             }
         }

     }    }