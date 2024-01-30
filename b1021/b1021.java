import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

public class b1021 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int order = Integer.parseInt(st.nextToken());
    Deque<Integer> ans = new LinkedList<>();
    st = new StringTokenizer(br.readLine());
    int middle = -1;
    int move = 0;
    
    for(int i=1; i<=n; i++){
      ans.addLast(i);
    }
    for(int i=0; i<order; i++){
      int idx = 0;
      int now = Integer.parseInt(st.nextToken());
      middle = ans.size()/2;
      Iterator<Integer> lter = ans.iterator();
      int temp = lter.next();
      while(lter.hasNext()){
        if(temp == now){
          break;
        }
        temp = lter.next();
        idx++;
      }
      if(middle < idx){
        while(now != ans.peek()){
          int skip = ans.removeLast();
          ans.addFirst(skip);
          move++;
        }
        ans.removeFirst();
      }
      else if(middle > idx){
        while(now != ans.peek()){
          int skip = ans.removeFirst();
          ans.addLast(skip);
          move++;
        }
        ans.removeFirst();
      }
      else if(middle == idx){
        while(now != ans.peek()){
          int skip = ans.removeFirst();
          ans.addLast(skip);
          move++;
        }
        ans.removeFirst();
      }
    }
    System.out.println(move);
  }
}
