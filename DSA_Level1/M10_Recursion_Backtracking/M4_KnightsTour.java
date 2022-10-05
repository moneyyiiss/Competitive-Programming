package M10_Recursion_Backtracking;

import java.io.*;
import java.util.*;

public class M4_KnightsTour {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess, r, c, 1 , 0);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove , int count) {
      
        if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0){
            return;
        } else if(upcomingMove == chess.length * chess.length){
            if(count <=2){
                chess[r][c] = upcomingMove;
                displayBoard(chess);
                
                chess[r][c] = 0;
            }
            count++;
            return;
        }
        chess[r][c] = upcomingMove;
        printKnightsTour(chess, r - 2, c + 1, upcomingMove + 1 , count);
        printKnightsTour(chess, r - 1, c + 2 , upcomingMove + 1, count);
        printKnightsTour(chess, r + 1, c + 2 , upcomingMove + 1, count);
        printKnightsTour(chess, r + 2, c + 1 , upcomingMove + 1,count);
        printKnightsTour(chess, r + 2, c - 1 , upcomingMove + 1,count);
        printKnightsTour(chess, r + 1, c - 2 , upcomingMove + 1,count);
        printKnightsTour(chess, r - 1, c - 2 , upcomingMove + 1,count);
        printKnightsTour(chess, r - 2, c - 1 , upcomingMove + 1,count);
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}