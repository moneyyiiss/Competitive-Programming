package M6_Introduction_to_Recursion;

import java.io.*;
import java.util.*;

public class M2_PrintIncreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n<= 0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

}