package M8_Recursion_In_Arrays;

import java.io.*;
import java.util.*;

public class M5_LastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int li = lastIndex(arr, 0, x);
        System.out.println(li);
    }

    public static int lastIndex(int[] arr, int idx, int x){ // ye idx se end tk check karega
        if(idx == arr.length){
            return -1;
        }
        int liisa = lastIndex(arr, idx+1, x); //liisa is last index in smaller array
        // 1 se end tk check karega
        if(liisa == -1){
            if(arr[idx] == x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return liisa;
        }
       
    }

}