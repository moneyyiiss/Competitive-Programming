package M10_Recursion_Backtracking;

import java.io.*;
import java.util.*;

public class M2_TargetSumSubsets {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n]; 
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, target);

    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(sos > tar){
            return;
        }
        if(idx == arr.length){
            if(sos == tar){
                System.out.println(set + ".");
        }
        return;
            
        }

        printTargetSumSubsets(arr, idx+1, set + arr[idx] + ", ", sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx+1, set, sos, tar);
    }

}