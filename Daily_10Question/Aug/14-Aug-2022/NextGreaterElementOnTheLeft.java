//4
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
//test case
// 6
// 2
// 3
// 1
// 5
// 4
// 6
// ans
// -1
// -1
// 3
// -1
// 5
// -1
public class NextGreaterElementOnTheLeft{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] ngel = solution(a);
        display(ngel);
    }
    public static int[] solution(int[] arr){
        int[] ngel = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        ngel[0] = -1;
        for(int i=1; i<=arr.length-1; i++){
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                ngel[i] = -1;
            }else{
                ngel[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ngel;
    }
    public static void display(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int s: arr){
            sb.append(s + "\n");
        }
        System.out.println(sb);
    }
}