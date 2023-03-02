package org.example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.TreeSet;
public class TreeSetExample {
    public static void Treeset(){
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> med=new TreeSet<>();
        Logger l=Logger.getLogger("com.api.jar");
        med.add(200);
        med.add(900);
        med.add(500);
        med.add(724);
        med.add(672);
        med.add(900);
        l.log(Level.INFO, () ->"Print the medical price using Treeset it will print in sorted order: "+med);
        TreeSet<Integer> med1=new TreeSet<>();
        l.info("Add new price to the existing treeset");
        int n=sc.nextInt();
        med1.add(n);
        med1.addAll(med);
        l.log(Level.INFO, () ->"Print the new price with the existing price "+med1);
        int f=  med1.first();
        l.log(Level.INFO, () ->"Print the First price of the Treeset "+f);
        int la  =  med1.last();
        l.log(Level.INFO, () ->"Print the Last price of the Treeset "+la);
        l.log(Level.INFO, () ->"It returns and remove the element using pollfirst method: "+med1.pollFirst());
        l.log(Level.INFO, () ->"It returns and remove the element using polllast method: "+med1.pollLast());
        l.log(Level.INFO, () ->"" +med1);
        l.log(Level.INFO, () ->"It returns the price using headset method "+med1.headSet(672,true));
        l.log(Level.INFO, () ->"It returns the price using tailset method "+med1.tailSet(500,true));
    }
}