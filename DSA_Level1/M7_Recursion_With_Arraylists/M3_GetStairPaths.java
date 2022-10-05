package M7_Recursion_With_Arraylists;

import java.io.*;
import java.util.*;

public class M3_GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> st = getStairPaths(n);
        System.out.println(st);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> st1 = getStairPaths(n-1);
        ArrayList<String> st2 = getStairPaths(n-2);
        ArrayList<String> st3 = getStairPaths(n-3);
        ArrayList<String> mres = new ArrayList<>();
        for(String val: st1){
            mres.add(1+val);
        }
        for(String val: st2){
            mres.add(2+val);
        }
        for(String val: st3){
            mres.add(3+val);
        }

        return mres;
    }

}