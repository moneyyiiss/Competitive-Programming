package M7_Recursion_With_Arraylists;

import java.io.*;
import java.util.*;

public class M2_GetKpc {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> st = getKPC(str);
        System.out.println(st);
    }

    static String[] key = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {

        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> st = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String code = key[ch - '0']; // '6' - '0' = 56 - 48 = 6
        for(int i=0; i<code.length(); i++){
            char cch = code.charAt(i);
            for(String val: st){
                mres.add(cch + val);
            }
        }




        return mres;
    }

}
