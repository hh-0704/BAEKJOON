package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class b10773 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] stack = new int[n];
    int top = 0;
    for (int i=0; i<n; i++){
      int now = Integer.parseInt(br.readLine());
      if (now != 0){
        stack[top] = now;
        top++;
      }
      else{
        top--;
      }
    }
    int sum = 0;
    for(int i=0; i<top; i++){
      sum += stack[i];
    }
    System.out.println(sum);
  }
}
