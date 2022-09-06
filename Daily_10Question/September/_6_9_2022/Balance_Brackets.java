package September._6_9_2022;
import java.util.*;

import java.util.*;

public class Balance_Brackets{
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      Stack<Character> st = new Stack<>();
      for(int i=0; i<str.length(); i++){
         char ch = str.charAt(i);
         if(ch == '(' || ch == '{' || ch == '['){
            st.push(ch);
         }else if(ch == ')'){
            boolean val = charac(st, '(');
            if(val == false){
               System.out.println(val);
               return;
            }
         }else if(ch == '}'){
            boolean val = charac(st, '{');
            if(val == false){
               System.out.println(val);
               return;
            }
         }else if(ch == ']'){
            boolean val = charac(st, '[');
            if(val == false){
               System.out.println(val);
               return;
            }
         }else{

         }
      }
      if(st.size() == 0){
         System.out.println(true);
      }else{
         System.out.println(false);
      }
      
   }

   public static boolean charac(Stack<Character> st, char charval){
      if(st.size() == 0){     
         return false;
      }else if(st.peek() != charval){
         return false;
      }else{
         st.pop();
         return true;
      }
   } 
}