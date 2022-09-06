package August._20_Aug_2022;

import java.util.Scanner;

class MergeSort_RecursiveApproach{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int[] sa = mergeSort(arr, 0, arr.length-1);
        print(sa);
    }
    public static int[] mergeSort(int[] arr, int low, int high){
        if(low==high){
            int[] bas = new int[1];
            bas[0] = arr[low];
            return bas;

        }
        int mid = (low+high)/2;
        int[] fsh = mergeSort(arr, low, mid);
        int[] ssh = mergeSort(arr, mid+1, high);
        int[] fsa = mergeTwoSortedArrays(fsh, ssh);
        return fsa;
    }
    //used for merging two sorted array
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        System.out.println("Merging these two arrays");
        int[] res = new int[a.length + b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k] = a[i];
                i++;
                k++;
            }else{
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            res[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}