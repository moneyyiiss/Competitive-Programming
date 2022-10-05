package M7_Recursion_With_Arraylists;


import java.io.*;
import java.util.*;

public class M1_GetSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> al = gss(s);
        System.out.println(al);


    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bst = new ArrayList<>();
            bst.add("");
            return bst;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for(String val: rres){
            mres.add("" + val);
            
        }
        for(String val: rres){
            mres.add(ch + val);
        }

        return mres;
    }

}