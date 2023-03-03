package org.example.bankaccount;

import java.util.*;
import java.util.logging.*;
public class BankAccount
{
    private String username;
    private long balance;
    private long accnumber;
    static Logger l=Logger.getLogger(".com.api.jar");
    BankAccount(String name,long number,long bal){
        username=name;
        accnumber=number;
        balance=bal;
    }
    void deposit()
    {
        Scanner c=new Scanner(System.in);
        l.info("Enter the amount to deposit your account:");
        long amt=c.nextLong();
        balance=balance+amt;

        l.log(Level.INFO, () ->"The deposit of the amount is:"+balance);
        l.info("\n");

    }
    void withdraw(long amt2)
    {
        if(balance>=amt2)
        {
            balance=balance-amt2;
            l.log(Level.INFO, () ->"The Withdraw of the amount is:"+balance);
        }
        else{
            l.info("The Amount is less than your Balance \tTransaction failed");
        }

    }
    void currbalance(){
        l.log(Level.INFO, () ->"The current balance of your account:" +balance);
    }
    void display(){
        l.log(Level.INFO, () ->"The Accounts holder name is "+username);
        l.log(Level.INFO, () ->"\nThe Accounts number of the User account is "+accnumber);
        l.log(Level.INFO, () ->"\nThe Balance of your account is "+balance);
    }

}
