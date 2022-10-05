package M6_Introduction_to_Recursion;


import java.io.*;
import java.util.*;

public class M5_PowerLinear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int pow = power(x, n);
        System.out.println(pow);
    }

//2, 5
    public static int power(int x, int n){
        if(n <= 0){
            return 1;
        }
        int p = power(x, n-1);
        int po = x*p; // 2*1 = 2, 2*2 = 4, 4*2=8, 8*2 = 16, 16*2 = 32
        return po;
    }

}