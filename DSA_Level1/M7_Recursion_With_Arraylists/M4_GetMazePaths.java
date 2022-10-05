package M7_Recursion_With_Arraylists;

import java.io.*;
import java.util.*;

public class M4_GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        ArrayList<String> st = getMazePaths(1,1,dr, dc);
        System.out.println(st);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> h = new ArrayList<>();
        ArrayList<String> v = new ArrayList<>();

        if(sc < dc){
             h = getMazePaths(sr, sc+1, dr, dc);
        }
        
        if(sr< dr){
            v = getMazePaths(sr+1, sc, dr, dc);
        }
        
        ArrayList<String> mres = new ArrayList<>();

            for(String val: h){
            mres.add("h" + val);
            }
            for(String val: v){
            mres.add("v" + val);
            }

        
        
        return mres;
    }

}