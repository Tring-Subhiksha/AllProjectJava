package org.example;
import org.example.arraylist.Linked;
import org.example.arraylist.StudentList;
import org.example.bankaccount.Account;
import org.example.basicstudent.Student;
import org.example.calculatornew.CalculatorNew;
import org.example.card.Card;
import org.example.database.Database;
import org.example.frequency.Frequency;
import org.example.game.Game;
import org.example.hashmap.Hashmap;
import org.example.hashset.Hashset;
import org.example.shapes.Shapes;
import org.example.simplecontact.Simplecontact;
import org.example.simplepoint.Simplepoint;
import org.example.treeset.TreeSetExample;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Logger;

class OverallProject {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        Logger l= Logger.getLogger("OverallProject");
        Scanner s=new Scanner(System.in);
        int option;
        do {
          l.info("\n1.Bank Account \n2.Basic Shapes \n3.Basic Student \n4.Database \n5.Basic Point \n6.Basic Card \n7.StudentList using arraylist \n8.Hashmap \n9.Hashset \n10.Treeset \n11.Linkedlist \n12.Calculator \n13.Simplecontact \n14.Frequency \n15.Tictactoe game");
          l.info("Enter your option:");
          option=s.nextInt();

              switch (option) {
                  case 1:
                      Account a = new Account();
                      a.accountDisplay();
                      break;
                  case 2:
                      Shapes.basicShapes();
                      break;
                  case 3:
                      Student.basicstudent();
                      break;
                  case 4:
                      Database.simpledatabase();
                      break;
                  case 5:
                      Simplepoint.coordinates();
                      break;
                  case 6:
                      Card.simplecard();
                      break;
                  case 7:
                      StudentList.student();
                      break;
                  case 8:
                      Hashmap.hashmap();
                      break;
                  case 9:
                      Hashset.hashSet();
                      break;
                  case 10:
                      TreeSetExample.treeset();
                      break;
                  case 11:
                      Linked.connected();
                      break;
                  case 12:
                      CalculatorNew.calculator();
                      break;
                  case 13:
                      Simplecontact.listcontact();
                      break;
                  case 14:
                      Frequency.words();
                      break;
                  case 15:
                      Game.tictactoegame();
                      break;
                  default:
                      l.info("Thank you");
              }
          }while(option<16);
      }
    }