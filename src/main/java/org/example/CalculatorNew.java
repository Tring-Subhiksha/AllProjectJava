package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CalculatorNew {
    private CalculatorNew(){

    }
    public static void calculator(){
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger("com.api.jar");

        double first = 0;
        double second=0;
        try{
            l.info("Enter the First Number:");
            first=sc.nextDouble();
            l.info("Enter the Second Number:");
            second=sc.nextDouble();


        }
        catch(InputMismatchException e){
            l.info("Please enter number only");
        }


        Add c1=new Add(first,second);
        Sub c2=new Sub(first,second);
        Mul c3=new Mul(first,second);
        Div c4=new Div(first,second);
        l.info("Enter the operator to which operations is going to perform");
        l.info("Addition-->+");
        l.info("Subtraction-->-");
        l.info("Multiplication-->*");
        l.info("Division-->/");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+' ->   l.log(Level.INFO, () ->"Addition of two numbers: " + c1.calc());
            case '-' ->   l.log(Level.INFO, () ->"Subtraction of two numbers: " + c2.calc());
            case '*' ->   l.log(Level.INFO, () ->"Multiplication of two numbers: " + c3.calc());
            case '/' ->   l.log(Level.INFO, () ->"Division of two numbers: " + c4.calc());
            default -> {
                l.info("You enter wrong input");
                l.info("Please enter valid input");
            }
        }
    }
}