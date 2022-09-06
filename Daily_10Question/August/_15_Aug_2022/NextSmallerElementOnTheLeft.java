package August._15_Aug_2022;

//mistake occured
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextSmallerElementOnTheLeft{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] nsel = solution(a);
        display(nsel);
    }

    public static int[] solution(int[] arr){
        int[] nsel = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        nsel[0] = -1;
        for(int i=1; i<=arr.length-1; i++){

            while(st.size() > 0 && arr[i]<st.peek()){
                st.pop();
            }

            if(st.size() == 0){
                nsel[i] = -1;
            }else{
                nsel[i] = st.peek();
            }
            st.push(i);
        }
        return nsel;
    }

    public static void display(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i: arr){
            sb.append(i + "\n");
        }
        System.out.println(sb);
    }
}