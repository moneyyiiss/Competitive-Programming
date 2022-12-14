package M9_Recursion_On_the_way_up;

import java.io.*;
import java.util.*;

public class M5_PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            printPermutations(ros, asf+ch);
        }
        
    }

}