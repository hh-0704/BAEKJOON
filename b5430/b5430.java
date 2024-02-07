import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class b5430 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for (int i=0; i<n; i++){
      String order = br.readLine();
      int length = Integer.parseInt(br.readLine());
      StringTokenizer st2 = new StringTokenizer(br.readLine(),"[,]");
      Deque<Integer> ans = new ArrayDeque<>();
      int back = 0;
      int error = 0;

      for(int j=0; j<length; j++){
        int temp = Integer.parseInt(st2.nextToken());
        ans.add(temp);
      }
      for(int m=0; m<order.length(); m++){
        char now = order.charAt(m);
        if(now == 'R'){
          if(back == 0){
            back = 1;
          }
          else if(back == 1){
            back = 0;
          }
        }
        if(now == 'D'){
          if(ans.size() == 0){
            bw.write("error");
            bw.newLine();
            error = 1;
            break;
          }
          if(back == 0){
            ans.removeFirst();
          }
          else if(back == 1){
            ans.removeLast();
          }
        }
      }
      if(error == 1){
        continue;
      }
      int lastsize = ans.size();
      bw.write("[");
      if(back == 0){
        for(int l=0; l<lastsize; l++){
          bw.write(String.valueOf(ans.removeFirst()));
          if(l == lastsize - 1){
            continue;
          }
          bw.write(",");
        }
      }
      else if(back == 1){
        for(int l=0; l<lastsize; l++){
          bw.write(String.valueOf(ans.removeLast()));
          if(l == lastsize - 1){
            continue;
          }
          bw.write(",");
        }
      }
      bw.write("]");
      bw.newLine();
    }
    bw.flush();
  }
}
