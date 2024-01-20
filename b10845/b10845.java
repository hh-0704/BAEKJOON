import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class b10845 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Queue<Integer> ans = new LinkedList<>();
    int n = Integer.parseInt(br.readLine());
    int last_in = 0;

    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String order = st.nextToken();

      if(order.equals("push")){
        last_in = Integer.parseInt(st.nextToken());
        ans.add(last_in);
      }
      else if(order.equals("pop")){
        if(ans.isEmpty() == true){
          bw.write(String.valueOf(-1));
          bw.newLine();
          continue;
        }
        bw.write(String.valueOf(ans.remove()));
        bw.newLine();
      }
      else if(order.equals("size")){
        bw.write(String.valueOf(ans.size()));
        bw.newLine();
      }
      else if(order.equals("empty")){
        if(ans.isEmpty() == true){
          bw.write(String.valueOf(1));
          bw.newLine();
          continue;
        }
        else {
          bw.write(String.valueOf(0));
          bw.newLine();
        }
      }
      else if(order.equals("front")){
        if(ans.isEmpty() == true){
          bw.write(String.valueOf(-1));
          bw.newLine();
          continue;
        }
        bw.write(String.valueOf(ans.peek()));
        bw.newLine();
      }
      else if(order.equals("back")){
        if(ans.isEmpty() == true){
          bw.write(String.valueOf(-1));
          bw.newLine();
          continue;
        }
        bw.write(String.valueOf(last_in));
        bw.newLine();
      }
    }
    bw.flush();
  }
}
