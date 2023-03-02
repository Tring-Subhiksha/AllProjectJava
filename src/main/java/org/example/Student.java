package org.example;
import java.util.*;
import java.util.logging.*;
public class Student {

     String name;
    String grade;
   double gpa;
  double gradeValue;
   double credit;
   double mark;
    final Logger l = Logger.getLogger("com.api.jar");
    Student(){
        Scanner sc=new Scanner(System.in);
        l.info("\nEnter Your Name:");
        name=sc.nextLine();
        try {


            l.info("\nEnter the Grade level:");
            grade = sc.nextLine();
            if(grade.length()>2){
                throw new StudentException("Greater than string length");
            }

        }catch (StudentException ex){
            l.log(Level.INFO, () ->"\nException Occur:" +ex);
            System.exit(0);
        }


        l.info("\nEnter the Credit points:");
        credit=sc.nextDouble();
    }
    String showdetails()
    {
        l.log(Level.INFO, () ->"\nStudent Name:" +name);
        l.log(Level.INFO, () ->"\nGrade Level:" +grade);
        return name+" has a "+gpa+" GPA";
    }
      void checkgrade(){


        switch (grade) {
            case "A" -> gradeValue = 4.00;
            case "A-" -> gradeValue = 3.67;
            case "B+" -> gradeValue = 3.33;
            case "B" -> gradeValue = 3.00;
            case "B-" -> gradeValue = 2.67;
            case "C+" -> gradeValue = 2.33;
            case "C" -> gradeValue = 2.00;
            default -> l.info("Invalid Grade");
        }
    }
    void updategpa(){
        mark=gradeValue*credit;
        gpa=mark/credit;
    }

    public static void basicstudent(){
        Student s=new Student();
        Logger l = Logger.getLogger("com.api.jar");
        s.checkgrade();
        s.updategpa();
        l.log(Level.INFO, () ->" "+s.showdetails());
    }
}

