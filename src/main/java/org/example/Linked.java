package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Linked{
    Logger l=Logger.getLogger("com.api.jar");
    Linkedlist rootNode = null;
    int count = 0;
    public void addElement(int value,int index){
        Linkedlist n=new Linkedlist(value,index);
        Linkedlist temp;
        if(this.rootNode == null){
            this.rootNode=n;
            this.count++;
        }else{
            temp = rootNode;
            while(temp.nextNode != null){
                temp = temp.nextNode;
            }
            if(temp.nextNode==null)
                temp.nextNode = n;
        }
    }

    public void insertElementatfirst(int value,int index){

        Linkedlist n=new Linkedlist(value,index);

        if(index==0){
            l.info("Insert element at beginning in the linkedlist");
            Linkedlist curr=this.rootNode;
            n.nextNode=curr;
            this.rootNode=n;
        }
    }
    public void insertElementatmiddle(int value,int index)
    {

        Linkedlist n=new Linkedlist(value,index);
        l.info("Insert element at midlle or last in the linked list");
        Linkedlist curr=rootNode;
        for(int size=0;curr!=null;size++){
            var prev=curr.nextNode;
            if(size==index){
                curr.nextNode=n;
                n.nextNode=prev;
                break;
            }
            curr=curr.nextNode;
        }
    }

    public void removeElementatfirst(int index){

        if(index==0){
            l.info("Delete element at beginning in the linkedlist");
            Linkedlist curr=rootNode;
            curr=curr.nextNode;
            rootNode=curr;
        }
    }
    public void removeElementatmiddle(int index) {

        l.info("Delete element at midlle or last in the linked list");
        Linkedlist curr = rootNode;

        for (int size = 0;curr != null;size++) {
            var prev = curr.nextNode;

            if (size == index) {

                curr.nextNode = prev.nextNode;

                break;
            }

            curr = curr.nextNode;
        }
    }
    public void printElements(){
        Linkedlist temp = rootNode;


        if(temp == null){
            l.info("Is empty!");
        }
        else{
            while(temp != null ){

                int nu=temp.data;

                l.log(Level.INFO,()->"Value is " + nu);
                temp = temp.nextNode;

            }

        }
    }
    public static void connected() {
        Linked list = new Linked();
        list.addElement(1,0);
        list.addElement(2,1);
        list.addElement(3,2);
        list.printElements();
        list.insertElementatfirst(4, 0);
        list.printElements();
        list.insertElementatmiddle(5, 2);
        list.printElements();
        list.removeElementatfirst(0);
        list.printElements();
        list.removeElementatmiddle(2);
        list.printElements();
    }
}

