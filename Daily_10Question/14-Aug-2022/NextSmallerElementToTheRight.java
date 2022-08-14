import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextSmallerElementToTheRight{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] nse = solution(a);
        display(nse);
    }
    public static void display(int[] nse){
        StringBuilder sb = new StringBuilder();
        for(int s: nse){
            sb.append(s + "\n");
        }
        System.out.println(sb);
    }
    public static int[] solution(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        nse[arr.length-1] = -1;
        for(int i=arr.length-2; i>=0; i--){
            while(st.size()>0 && arr[i] < st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                nse[i] = -1;
            }else{
                nse[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nse;
    }
}