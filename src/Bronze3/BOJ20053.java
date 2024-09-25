package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ20053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine()+" ");
            for(int j=0;j<N;j++){
                int num = Integer.parseInt(st.nextToken());
                if(max < num) max = num;
                if(min > num) min = num;
            }
            System.out.println(min+" "+max+" ");
        }
    }
}
