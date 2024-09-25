package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            for (int a = 1; a < n;a++) {
                for(int b=a+1; b<n;b++) {
                    int temp = ((a*a) + (b*b) +m);
                    if(temp%(a*b)==0) count ++;
                }
            }
            System.out.println(count);
        }
    }
}
