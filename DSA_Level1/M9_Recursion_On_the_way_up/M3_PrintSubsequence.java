package M9_Recursion_On_the_way_up;

import java.io.*;
import java.util.*;

public class M3_PrintSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String st = scn.next();
        printSS(st, "");
    }

    public static void printSS(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
printSS(ros, ans+ch);
        printSS(ros, ans+"");
        
    }

}