package org.example;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.Iterator;
import java.util.logging.Level;
class Medicines{

}
public class Hashset {
    private Hashset(){

    }
    String name;
    Hashset(String medicinename){
        this.name=medicinename;
    }
    public static void hashSet() {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Logger l=Logger.getLogger("com.api.jar");
        l.info("Enter the size of an array");
        int count=sc.nextInt();
        String[] name=new String[count];
        for(int i=0;i<count;i++){
            l.info("Enter the medicines names:");
            name[i]=sc1.nextLine();
        }

        Hashset s1=new Hashset(name[0]);
        Hashset s2=new Hashset(name[1]);
        Hashset s3=new Hashset(name[2]);
        HashSet<Hashset> med=new HashSet<Hashset>();
        med.add(s1);
        med.add(s2);
        med.add(s3);
        Iterator<Hashset> iterator = med.iterator();
        l.info("Print the  Medicine names using Hashset");
        while (iterator.hasNext()) {
            l.info(iterator.next().name);
        }
        l.info("To remove one item from the hashset");
        med.remove(s2);



        l.info("To clear the elements using Hashset");
        med.clear();


    }
}
