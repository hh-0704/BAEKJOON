package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1874 {
  public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder st = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    int now = 0;
    int top = 1;
    boolean sucess = true;
    for(int i=0; i<n; i++){
      int num = Integer.parseInt(br.readLine());
      while(top <= num){
        stack.push(top);
        st.append("+\n");
        top++;
      }
      now = stack.pop();
      if(now == num){
        st.append("-\n");
      }
      else {
        sucess = false;
      }
    }
    if(sucess){
      System.out.println(st);
    }
    else{
      System.out.println("NO");
    }
  }
}