package org.example;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Logger;

class OverallProject {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        Logger l= Logger.getLogger("OverallProject");
        Scanner s=new Scanner(System.in);
        int option;
      while(true){
          l.info("\n1.Bank Account \n2.Basic Shapes \n3.Basic Student \n4.Database \n5.Basic Point \n6.Basic Card \n7.StudentList using arraylist \n8.Hashmap \n9.Hashset \n10.Treeset \n11.Linkedlist \n12.Calculator \n13.Simplecontact \n14.Frequency \n15.Tictactoe game");
          l.info("Enter your option:");
          option=s.nextInt();
          switch(option){
              case 1:
                  Account a=new Account();
                  a.accountDisplay();
                  break;
              case 2:
                    Shapes.BasicShapes();
                    break;
              case 3:
                  Student.Basicstudent();
                  break;
              case 4:
                  Database.Simpledatabase();
                  break;
              case 5:
                  Simplepoint.Point();
                  break;
              case 6:
                  Card.Simplecard();
                  break;
              case 7:
                  StudentList.Student();
                  break;
              case 8:
                    Hashmap.hashmap();
                    break;
              case 9:
                    Hashset.HashSet();
                    break;
              case 10:
                    TreeSetExample.Treeset();
                    break;
              case 11:
                  Linked.connected();
                  break;
              case 12:
                  CalculatorNew.Calculator();
                  break;
              case 13:
                  Simplecontact.listcontact();
                  break;
              case 14:
                    Frequency.Words();
                  break;
              case 15:
                  Game.Tictactoegame();
                  break;
              default:l.info("Thank you");
          }
      }
    }
}