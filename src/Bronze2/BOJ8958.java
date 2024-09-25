package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int score =0;
            int result = 0;
            char[] text = br.readLine().toCharArray();
            for (char c : text)
                if (c == 'O') {
                    score++;
                    result += score;
                } else {
                    score = 0;
                }
            System.out.println(result);
        }
    }
}
