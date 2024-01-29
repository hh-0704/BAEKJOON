import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class b10866 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Deque<Integer> ans = new ArrayDeque<>();
    int n = Integer.parseInt(br.readLine());

    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String order = st.nextToken();

      if(order.equals("push_front")){
        int temp = Integer.parseInt(st.nextToken());
        ans.addFirst(temp);
      }
      else if(order.equals("push_back")){
        int temp = Integer.parseInt(st.nextToken());
        ans.addLast(temp);
      }
      else if(order.equals("pop_front")){
        if(ans.size() == 0){
          bw.write(String.valueOf(-1));
          bw.newLine();
          continue;
        }
        bw.write(String.valueOf(ans.removeFirst()));
        bw.newLine();
      }
      else if(order.equals("pop_back")){
        if(ans.size() == 0){
          bw.write(String.valueOf(-1));
          bw.newLine();
          continue;
        }
        bw.write(String.valueOf(ans.removeLast()));
        bw.newLine();
      }
      else if(order.equals("size")){
        bw.write(String.valueOf(ans.size()));
        bw.newLine();
      }
      else if(order.equals("empty")){
        if(ans.size() == 0){
          bw.write(String.valueOf(1));
          bw.newLine();
          continue;
        }
        bw.write(String.valueOf(0));
        bw.newLine();
      }
      else if(order.equals("front")){
        if(ans.size() == 0){
          bw.write(String.valueOf(-1));
          bw.newLine();
          continue;
        }
        bw.write(String.valueOf(ans.peekFirst()));
        bw.newLine();
      }
      else if(order.equals("back")){
        if(ans.size() == 0){
          bw.write(String.valueOf(-1));
          bw.newLine();
          continue;
        }
        bw.write(String.valueOf(ans.peekLast()));
        bw.newLine();
      }
    }
    bw.flush();
  }
}
