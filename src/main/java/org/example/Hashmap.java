package org.example;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Hashmap{
    private Hashmap(){

    }

    public static void hashmap() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Logger l = Logger.getLogger("com.api.jar");
        int count;


        l.info("Enter the size of an array");
        count = sc.nextInt();


        int[] id = new int[count];
        String[] name = new String[count];
        Double[] price = new Double[count];
            for (int i = 0; i < count; i++) {

                l.info("Enter the Medicines id Number");
                id[i] = sc.nextInt();
                l.info("Enter the Medicines names:");
                name[i] = sc1.nextLine();
                l.info("Enter the Medicine Price");
                price[i] = sc.nextDouble();


            }



        HashMap<Integer,String> med=new HashMap<Integer,String>();
           try {
               med.put(id[0], name[0]);
               med.put(id[1], name[1]);
               med.put(id[2], name[2]);

           }catch (ArrayIndexOutOfBoundsException e){
               l.info("Array Index out of range");
           }
        l.info("Print the elements using Hashmap");
        l.info("Iterating Hashmap...");
        for(Map.Entry<Integer,String> m : med.entrySet()) {
            l.log(Level.INFO, () ->(m.getKey()+" "+m.getValue()));
        }
        l.log(Level.INFO, () ->"Print the initial elements of hashmap" +med);
        med.putIfAbsent(103, "Acetaminophen");
        l.info("After putIfAbsent() method print the elements using hashmap");
        for(Map.Entry<Integer,String> m:med.entrySet()){
            l.log(Level.INFO, () ->(m.getKey()+" "+m.getValue()));
        }
        HashMap<Integer,String> med1=new HashMap<Integer,String>();
        med1.put(104,"Ravi");
        l.info("Updating the elements using Hashmap ");
        for(Map.Entry<Integer,String> m:med1.entrySet()){
            l.log(Level.INFO, () ->(m.getKey()+" "+m.getValue()));
        }
        l.info("Give the remove elements using hashmap");
        int n=sc.nextInt();
        med.remove(n);
        l.log(Level.INFO, () ->"After removing the list of elements using hashmap key "+med);
        l.info("Enter the name to remove");
        String name1=sc1.nextLine();
        med.remove(n, name1);
        l.log(Level.INFO, () ->"After removing the list of elements using hashmap key value pair: "+med);
        l.info("To clear the elements using Hashmap");
        med.clear();
        l.info("To check hashmap is empty or not?");

    }
}