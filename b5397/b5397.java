import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class b5397 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    for(int j=0; j<n; j++){
      String str = br.readLine();
      LinkedList<Character> ans = new LinkedList<>();

      ListIterator<Character> lter = ans.listIterator();
      for(int i=0; i<str.length(); i++){
        char temp = str.charAt(i);
  
        if(temp == '<'){
          if(lter.hasPrevious()){
            lter.previous();
          }
        }
        else if(temp == '>'){
          if(lter.hasNext()){
            lter.next();
          }
        }
        else if(temp == '-'){
          if(lter.hasPrevious()){
            lter.previous();
            lter.remove();
          }
        }
        else{
          lter.add(temp);
        }
      }
  
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      for(char s: ans){
        bw.write(s);
      }
      bw.append("\n");
      bw.flush();
    }
  }
}
