package org.example;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Game {
    public static void Tictactoegame() {
        int count = 0;
        PrintStream li = new PrintStream((new FileOutputStream(FileDescriptor.out)));
        Scanner sc1 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String name1 = null;
        String name2 = null;
        try {
            li.println("Enter the two person names");
            name1 = sc1.nextLine();
            name2 = sc1.nextLine();
        } catch (InputMismatchException e) {
            li.println("please enter string only!");
        }
        li.println("Enter two Symbols to play X or O");
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        Humanmove h1 = new Humanmove(name1, c1);
        Humanmove h2 = new Humanmove(name2, c2);
        Humanmove currentplayer;
        currentplayer = h1;
        while (true) {
            li.println(currentplayer.name + " Starts");
            currentplayer.move();
            count++;

            Tictactoe.displaytictactoe();
            if (Tictactoe.columnwin() || Tictactoe.rowwin() || Tictactoe.diagonalwin()) {
                li.println(currentplayer.name + " has won");
                break;
            } else {
                if (currentplayer == h1) {
                    currentplayer = h2;
                } else {
                    currentplayer = h1;
                }
            }

            if (count >= 9) {
                li.println("Draw match!!");
                break;
            }
        }
    }
}
