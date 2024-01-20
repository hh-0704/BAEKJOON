import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class b3273 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int ans = Integer.parseInt(br.readLine());
    ArrayList<Integer> ints = new ArrayList<>(n);
    int count = 0;
    int start = 0;
    int end = n-1;

    for(int i=0; i<n; i++){
      int temp = Integer.parseInt(st.nextToken());
      ints.add(temp);
    }
    Collections.sort(ints);
 
    while(start < end){
      int cursum = ints.get(start) + ints.get(end);
      if(cursum == ans){
        count++;
        start++;
        end--;
      }
      else if(cursum < ans){
        start++;
      }
      else{
        end--;
      }
    }
    System.out.println(count);
  }
}
