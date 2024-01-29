import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b2164 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Queue<Integer> ans = new LinkedList<>();
    int n = Integer.parseInt(br.readLine());

    for(int i=1; i<=n; i++){
      ans.add(i);
    }
    while(ans.size() != 1){
      ans.remove();
      int temp = ans.remove();
      ans.add(temp);
    }
    System.out.println(ans.remove());
  }
}
