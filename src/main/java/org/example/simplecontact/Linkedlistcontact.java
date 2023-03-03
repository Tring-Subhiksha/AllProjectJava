package org.example.simplecontact;

import java.util.logging.Level;
import java.util.logging.Logger;
class Linkedlistcontact{
    Logger l=Logger.getLogger("com.api.jar");
    Node rootNode = null;
    int count = 0;
    public void addElement(String name,long number,String email){
        Node n=new Node(name,number,email);
        Node temp;
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

    public void insertElementatfirst(String name,long number,String email,int index){

        Node n=new Node(name,number,email);

        if(index==0){
            l.info("Insert element at beginning in the linkedlist");
            Node curr=this.rootNode;
            n.nextNode=curr;
            this.rootNode=n;
        }
    }
    public void insertElementatmiddle(String name,long number,String email,int index)
    {

        Node n=new Node(name,number,email);
        l.info("Insert element at midlle or last in the linked list");
        Node curr=rootNode;
        int size=0;
        while(curr!=null){
            var prev=curr.nextNode;
            size++;

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
            Node curr=rootNode;
            curr=curr.nextNode;
            rootNode=curr;
        }

    }
    public void removeElementatmiddle(int index)
    {

        l.info("Delete element at midlle or last in the linked list");
        Node curr=rootNode;
        int size=0;
        while(curr!=null){
            var prev=curr.nextNode;
            size++;

            if(size==index){

                curr.nextNode=prev.nextNode;

                break;
            }

            curr=curr.nextNode;
        }
    }
    public void search(String name){
        Node curr=rootNode;

        int size=0;
        while(curr!=null){
            if(curr.personname.equals(name)){
                size++;
                String na=curr.personname;
                long nu=curr.phonenumber;
                String em=curr.emailid;
                l.log(Level.INFO,()->"Name " + na +" Phone number "+ nu +" Email id "+ em);
                break;
            }
            if(size==0){
                l.info("Search contact is not in the list");
            }
            curr= curr.nextNode;
        }

    }
    public void printElements(){
        Node temp = rootNode;


        if(temp == null){
            l.info("Is empty!");
        }
        else{
            while(temp != null ){
                String na=temp.personname;
                long nu=temp.phonenumber;
                String em=temp.emailid;
                l.log(Level.INFO,()->"Name " + na +" Phone number "+ nu +" Email id "+ em);
                temp = temp.nextNode;

            }

        }
    }
}
