package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simplepoint implements Cloneable{
    String xcoordinates;
    String ycoordinates;
    String x="10.9";
    String y="2.0";
    static Logger l=Logger.getLogger("com.api.jar");
    Simplepoint(){
        l.info("The user can fix the X and Y coordinates to create a point");
        l.info("\n Enter the X and Y Coordinates:");
        Scanner sc=new Scanner(System.in);
        xcoordinates=sc.nextLine();
        ycoordinates=sc.nextLine();
        l.info("The X and Y Coordinates of the point will be created...");

    }
    String point(){
        if(x.equals(xcoordinates)&&y.equals(ycoordinates)){
            return "true";
        }
        else{
            return "false";
        }
    }
    Simplepoint cloneTest()
    {
        try {
            return (Simplepoint) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            l.info("Cloning not allowed");
            return this;
        }
    }

    public static void coordinates(){
        Simplepoint d=new Simplepoint();
        l.log(Level.INFO, () ->"1,Same Coordinates--> returns True\n2,Different Coordinates--> returns False\n Answer is "+d.point());
        Simplepoint d2=d.cloneTest();
        d2.point();
        l.log(Level.INFO, () ->"\nThe cloning method it returns X coordinates "+d2.xcoordinates);
        l.log(Level.INFO, () ->"\nThe cloning method it returns y coordinates "+d2.ycoordinates);
    }
}
