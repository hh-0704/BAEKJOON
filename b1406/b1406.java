import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ListIterator;

public class b1406 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    LinkedList<Character> ans = new LinkedList<>();

    for(int i=0; i<str.length(); i++){
      ans.add(str.charAt(i));
    }

    int n = Integer.parseInt(br.readLine());
    ListIterator<Character> lter = ans.listIterator();
    while(lter.hasNext()){
      lter.next();
    }

    for(int i=0; i<n; i++){
      String now = br.readLine();
      char temp = now.charAt(0);

      if(temp == 'P'){
        char input = now.charAt(2);
        lter.add(input);
      }
      else if(temp == 'L'){
        if(lter.hasPrevious()){
          lter.previous();
        }
      }
      else if(temp == 'D'){
        if(lter.hasNext()){
          lter.next();
        }
      }
      else if(temp == 'B'){
        if(lter.hasPrevious()){
          lter.previous();
          lter.remove();
        }
      }
    }

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for(char s: ans){
      bw.write(s);
    }
    bw.flush();
  }
}
