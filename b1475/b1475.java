import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1475 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numString = br.readLine();

        int[] count = new int[10];
        for (int i = 0; i < numString.length(); i++) {
            int digit = numString.charAt(i) - '0';
            count[digit]++;
        }

        int sixNineCount = count[6] + count[9];
        int sixNineSet = (sixNineCount % 2 == 0) ? sixNineCount / 2 : (sixNineCount / 2) + 1;

        int maxCount = 0;
        for (int i = 0; i < 10; i++) {
            if (i != 6 && i != 9) {
                maxCount = Math.max(maxCount, count[i]);
            }
        }

        System.out.println(Math.max(sixNineSet, maxCount));
    }
}
