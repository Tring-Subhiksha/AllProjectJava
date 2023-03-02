package org.example;

public class Node{

    Node nextNode=null;
    String personname;
    long phonenumber;
    String emailid;
    Node(String name,long number,String email){
        this.personname= name;
        this.phonenumber=number;
        this.emailid=email;
    }
}