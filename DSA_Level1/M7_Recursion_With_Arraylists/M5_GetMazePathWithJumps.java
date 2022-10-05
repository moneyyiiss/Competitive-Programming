package M7_Recursion_With_Arraylists;


import java.io.*;
import java.util.*;

public class M5_GetMazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> st = getMazePaths(1,1,n, m);
        System.out.println(st);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        for(int ms = 1; ms<=dc-sc; ms++){
            ArrayList<String> h = getMazePaths(sr, sc+ms, dr, dc);
            for(String hm : h){
                paths.add("h"+ms+hm);
            }
        }
        for(int ms = 1; ms<=dr-sr; ms++){
            ArrayList<String> v = getMazePaths(sr+ms, sc, dr, dc);
            for(String vm: v){
                paths.add("v"+ms+vm);
            } 
        }

        for(int ms = 1; ms<=dr-sr && ms<=dc-sc; ms++){
            ArrayList<String> d = getMazePaths(sr+ms, sc+ms, dr, dc);
            for(String dm: d){
                paths.add("d"+ms+dm);
            }
        }
        return paths;
    }

}