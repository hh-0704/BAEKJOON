import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b1158 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    ArrayList<Integer> ints = new ArrayList<>();
    ArrayList<Integer> ans = new ArrayList<>();

    for(int i=1; i<=n; i++){
      ints.add(i);
    }

    int pointer = k-1;
    while(ints.size() != 0){
      int temp = ints.remove(pointer);
      ans.add(temp);
      pointer += k - 1;
      while(pointer >= ints.size()){
        if(ints.size() == 0){
          break;
        }
        pointer -= ints.size();
      }
    }
    System.out.print("<");
    for(int i=0; i<n; i++){
      if(i == n-1){
        System.out.print(ans.get(i));
        break;
      }
      System.out.print(ans.get(i) + ", ");
    }
    System.out.println(">");
  }
}
