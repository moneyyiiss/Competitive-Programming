import java.util.HashMap;
import java.util.Scanner;

class ASaturday{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Monday", 1);
        map.put("Tuesday", 2);
        map.put("Wednesday", 3);
        map.put("Thursday", 4);
        map.put("Friday", 5);
        

        int ans = 6 - map.get(str);
        System.out.println(ans);

    }
}
