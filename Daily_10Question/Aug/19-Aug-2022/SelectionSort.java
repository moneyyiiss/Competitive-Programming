import java.util.Scanner;

class SelectionSort{
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            sort(arr);
            print(arr);
        }
    }
    public static void print(int[] arr){
        System.out.println("printing.........");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int mi = i;
            for(int j=i+1; j<arr.length; j++){
                if(isSmaller(arr, j, mi)){
                    mi = j;
                }
            }
            swap(arr, i, mi);
        }
    }
     // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j){
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
      // return true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int i, int j){
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if(arr[i] < arr[j]){
            return true;
        }else{
            return false;
        }
    }
}