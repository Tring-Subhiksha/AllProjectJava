package org.example.bankaccount;
import java.util.logging.Logger;
import java.util.Scanner;

public class Account {
    Logger l = Logger.getLogger("OverallProject");
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    long a;
    long b;
    String h;

    public Account() {
        l.info("Enter a Account Holder Name:");
        h = s1.nextLine();
        try {
            l.info("Enter the Account Number:");
            a = s.nextLong();
        }
        catch(Exception e){
            l.info("Enter integer only...");
            System.exit(0);
        }

        l.info("Enter the Balance amount:");
        b = s.nextLong();
    }

    public void accountDisplay() {
        BankAccount ac = new BankAccount(h, a, b);
        int choice;
        do {
            l.info("\n Bank Transaction details\n1.Show your account details\n2.Deposit your amount\n3.Withdraw your amount\n4.Check current balance of your account\n Exit\n");
            l.info("\nEnter your choice:");
            choice= s.nextInt();

            switch (choice) {
                case 1 -> ac.display();
                case 2 -> ac.deposit();
                case 3 -> {
                    l.info("Enter the amount to Withdraw your account:");
                    Scanner c = new Scanner(System.in);
                    long amt = c.nextLong();
                    ac.withdraw(amt);
                }
                case 4 -> ac.currbalance();

                default -> l.info("Thank you");
            }
        }while(choice<5);
    }
}

