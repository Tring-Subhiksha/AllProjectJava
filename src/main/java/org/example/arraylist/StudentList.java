package org.example.arraylist;
import java.util.Comparator;
import java.util.logging.Logger;
import java.util.*;
import java.util.logging.Level;

public class StudentList implements Comparator<StudentList> {
     String studentname;
     int studentage;
     double studentgpa;


   private  StudentList() {
    }

    void setter(String name, int age, double gpa) {
        this.studentname = name;
        this.studentage = age;
        this.studentgpa = gpa;
    }

    String getter1() {
        return this.studentname;
    }

    int getter2() {
        return this.studentage;
    }

    double getter3() {
        return this.studentgpa;
    }


    public int compare(StudentList a, StudentList b) {
        return (int) ((int) a.studentgpa - b.studentgpa);
    }

        public static void student() {
            Scanner sc=new Scanner(System.in);
            Scanner sc1=new Scanner(System.in);
            Logger l=Logger.getLogger("com.api.jar");
            l.info("Enter the size of an array");
            int count=sc1.nextInt();
            String[] n=new String[count];
            int[] age = new int[count];
            double[] grade=new double[count];
            for(int i=0;i<count;i++){
                l.info("Enter the student name:");
                n[i]=sc.nextLine();
                l.info("Enter the student age:");
                age[i]=sc1.nextInt();
                l.info("Enter the student grade level:");
                grade[i]=sc1.nextDouble();
            }

            StudentList s1=new StudentList();
            StudentList s2=new StudentList();
            StudentList s3=new StudentList();
            s1.setter(n[0],age[0],grade[0]);
            s2.setter(n[1],age[1],grade[1]);
            s3.setter(n[2],age[2],grade[2]);
            ArrayList <StudentList>list=new ArrayList<StudentList>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            l.info("Unsorted array");

            for(int k=0;k<count;k++){

                int name = k;
                l.log(Level.INFO,()-> "The student name is"+list.get(name).getter1());
                int personage = k;
                l.log(Level.INFO,()-> "The Student age is "+list.get(personage).getter2());
                int persongrade = k;
                l.log(Level.INFO,()-> "The student gpa is "+list.get(persongrade).getter3());
            }
            l.info("Sorted  Array");
            Collections.sort(list,new StudentList());
            for(int j=0;j<count;j++){
                int sortname = j;
                l.log(Level.INFO,()->"The student name is "+list.get(sortname).getter1());
                int sortage = j;
                l.log(Level.INFO,()->"The Student age is "+list.get(sortage).getter2());
                int sortgrade = j;
                l.log(Level.INFO,()->"The studentgpa is "+list.get(sortgrade).getter3());
            }

        }
    }

