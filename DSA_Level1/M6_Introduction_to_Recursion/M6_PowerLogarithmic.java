package M6_Introduction_to_Recursion;


import java.io.*;
import java.util.*;

public class M6_PowerLogarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int p = power(x, n);
        System.out.println(p);
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnb2 = power(x, n/2);
        int xn = xnb2* xnb2;
        if(n%2 != 0){
            xn = xn * x;
        }
        return xn;
    }

}