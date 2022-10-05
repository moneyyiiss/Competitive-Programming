package M8_Recursion_In_Arrays;

import java.io.*;
import java.util.*;

public class M4_FirstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int fi= firstIndex(arr, 0, x);
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int fiisa = firstIndex(arr, idx+1, x); 
        if(arr[idx] == x){
            return idx;
        }else{
            return fiisa;
        }

       
    }

}