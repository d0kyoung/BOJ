package INU_Code_Festival;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] size = new int[N];
        int[] box = new int[N];
        boolean[] IsTure = new boolean[K];
        int[] takedbox= new int[K];

        if(K<N) {
            st = new StringTokenizer(br.readLine());
            for(int i=0;i< size.length;i++){
                size[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(size);
            st = new StringTokenizer(br.readLine());
            for(int i=0;i< box.length;i++){
                box[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(box);

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<IsTure.length;i++){
                takedbox[i] = Integer.parseInt(st.nextToken());
            }
        }
    }
}

