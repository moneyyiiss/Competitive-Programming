package M6_Introduction_to_Recursion;

import java.io.*;
import java.util.*;

public class M3_PrintIncreasingDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n<= 0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

}