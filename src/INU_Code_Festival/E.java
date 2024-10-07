package INU_Code_Festival;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] X = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            X[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println("Yes");
    }
}
