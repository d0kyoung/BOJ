package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] arr = st.nextToken().toCharArray();
        int sum = 0;
        for (char c : arr) {
            sum += Integer.parseInt(String.valueOf(c));
            System.out.print(sum + " ");
        }
        System.out.println(sum);
    }
}
