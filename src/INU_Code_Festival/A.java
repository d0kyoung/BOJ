package INU_Code_Festival;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int plus = 1, minus = 1;
        int N = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a<b) {
            for (int i = 0; i <N; i++) {
                plus += a;
                minus += b;

                if (plus < minus) {
                    int temp = minus;
                    minus = plus;
                    plus = temp;
                }else if (plus == minus) {
                    minus--;
                }

            }
            System.out.println(plus + " " + minus);
        }
    }
}
