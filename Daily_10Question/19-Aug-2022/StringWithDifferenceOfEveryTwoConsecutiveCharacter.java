import java.util.Scanner;

class StringWithDifferenceOfEveryTwoConsecutiveCharacter{
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            String str = scn.nextLine();
            System.out.println(solution(str));
        }
    }
    public static String solution(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i-1);
            int gap = curr - pre;

            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
}