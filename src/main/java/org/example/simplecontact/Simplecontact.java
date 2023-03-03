package org.example.simplecontact;
import java.util.*;
import java.util.logging.Logger;
public class Simplecontact {
    private Simplecontact(){

    }
    public static void listcontact() {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Logger l=Logger.getLogger("com.api.jar");
        l.info("Enter the size of an array");
        int count=sc.nextInt();
        String[] name=new String[count];
        long[] number = new long[count];
        String[] email=new String[count];
        for(int i=0;i<count;i++){
            l.info("Enter the Person name:");
            name[i]=sc1.nextLine();
            l.info("Enter the Phone number:");
            number[i]=sc.nextLong();
            l.info("Enter the Email Id:");
            email[i]=sc1.nextLine();
        }

        Linkedlistcontact list = new Linkedlistcontact();
        list.addElement(name[0],number[0],email[0]);
        list.addElement(name[1],number[1],email[1]);
        list.addElement(name[2],number[2],email[2]);
        list.printElements();
        String name1 = null;
        try {
            l.info("Enter the name to insert at begin:");
            name1 = sc1.nextLine();
        }
        catch (InputMismatchException e){
            l.info("Please enter number only");
        }
        l.info("Enter the phone number to insert at begin");
        long number1=sc.nextLong();
        l.info("Enter the email id to insert at begin");
        String emailid=sc1.nextLine();
        l.info("Enter the index to insert an element");
        int index=sc.nextInt();
        list.insertElementatfirst(name1,number1,emailid,index);
        list.printElements();
        l.info("Enter the name to insert at middle:");
        String name2=sc1.nextLine();
        l.info("Enter the phone number to insert at middle");
        long number2=sc.nextLong();
        l.info("Enter the email id to insert at middle");
        String emailid2=sc1.nextLine();
        l.info("Enter the index to insert an middle");
        int index2=sc.nextInt();
        list.insertElementatmiddle(name2,number2,emailid2,index2);
        list.printElements();
        l.info("Enter the index to delete in begin");
        int index3=sc.nextInt();
        list.removeElementatfirst(index3);
        list.printElements();
        l.info("Enter the index to delete in middle or last");
        int index4=sc.nextInt();
        list.removeElementatmiddle(index4);
        list.printElements();
        l.info("Enter the Person name to search the contacts:");
        String name3=sc1.nextLine();
        list.search(name3);

    }
}
