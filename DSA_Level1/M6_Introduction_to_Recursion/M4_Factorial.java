package M6_Introduction_to_Recursion;

import java.io.*;
import java.util.*;

public class M4_Factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
   
    public static int factorial(int n){
        if(n <=1){
            return 1;
        }
        int f = factorial(n-1);
        int fact = n*f;
        return fact;
    }

}