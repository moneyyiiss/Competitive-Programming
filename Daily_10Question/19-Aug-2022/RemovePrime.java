import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrime{
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0; i<n; i++){
                al.add(scn.nextInt());
            }
            Solution(al);
            System.out.println(al);
        }
    }
    public static void Solution(ArrayList<Integer> al){
        for(int i=al.size()-1; i>=0; i--){
            int e = al.get(i);
            if(prime(e) == true){
                al.remove(i);
            }
        }
    }
    public static boolean prime(int val){
        for(int div = 2; div*div <= val; div++){
            if(val % div == 0){
                return false;
            }
        }
        return true;
    }
}