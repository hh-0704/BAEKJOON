import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class b10828 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Stack<Integer> ans = new Stack<>();
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      String order = st.nextToken();

      
      if(order.equals("push")){
        int temp = Integer.parseInt(st.nextToken());
        ans.push(temp);
      }
      else if (order.equals("pop")){
        if(ans.isEmpty() == true){
          bw.write(String.valueOf(-1));
          bw.newLine();;
          continue;
        }
        bw.write(String.valueOf(ans.pop()));
        bw.newLine();;
      }
      else if(order.equals("size")){
        bw.write(String.valueOf(ans.size()));
        bw.newLine();;
      }
      else if(order.equals("empty")){
        if(ans.isEmpty() == true){
          bw.write(String.valueOf(1));
          bw.newLine();;
        }
        else{
          bw.write(String.valueOf(0));
          bw.newLine();;
        }
      }
      else if(order.equals("top")){
        if(ans.isEmpty() == true){
          bw.write(String.valueOf(-1));
          bw.newLine();;
          continue;
        }
        bw.write(String.valueOf(ans.peek()));
        bw.newLine();;
      }
    }
    bw.flush();
  }
}
