package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Stack;
public class b2493 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int[] towers = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      towers[i] = Integer.parseInt(st.nextToken());
    }

    Stack<Integer> stack = new Stack<>();
    int[] receivers = new int[n];

    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && towers[stack.peek()] <= towers[i]) {
        stack.pop();
      }
            
      if (!stack.isEmpty()) {
        receivers[i] = stack.peek() + 1;
      }

      stack.push(i);
    }

    for (int i = 0; i < n; i++) {
      bw.write(receivers[i] + " ");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
//시간 초과 코드
/*int[] result = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    int token = 0;
    int [] tower = new int[n];
    while(st.hasMoreTokens()){
      tower[token] = Integer.parseInt(st.nextToken());
      token++;
    }
    for(int i=0; i<n-1; i++){
      int high = tower[n-i-1];
      int recive = n-i-1;
      while(recive > 0){
        recive--;
        if (high <= tower[recive]){
          result[n-i-1] = recive + 1;
          bw.write(result[n-i-1] + " ");
          break;
        }
      }
      bw.write(result[n-i-1] + " ");
    }
    bw.flush();*/
