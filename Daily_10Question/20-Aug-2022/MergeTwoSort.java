import java.util.Scanner;

class MergeTwoSort{
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        //result array
        int[] mergearray = new int[a.length + b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                mergearray[k] = a[i];
                i++;
                k++;
            }else{
                mergearray[k] = b[j];
                j++;
                k++;
            }

        }

        while(i<a.length){
            mergearray[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            mergearray[k] = b[j];
            j++;
            k++;

        }
        return mergearray;
    }
    //print class
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n1 = scn.nextInt();
            int[] a = new int[n1];
            for(int i=0; i<a.length; i++){
                a[i] = scn.nextInt();
            }
            int n2 = scn.nextInt();
            int[] b = new int[n2];
            for(int i=0; i<b.length; i++){
                b[i] = scn.nextInt();
            }

            int[] finalarray = mergeTwoSortedArrays(a, b);
            print(finalarray);
        }
    }
}