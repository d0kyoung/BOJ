package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []n = new int[31];
        for(int i=1;i<29;i++){
            int temp = Integer.parseInt(br.readLine());
            n[temp] = 1;
        }
        for(int i=1;i<n.length;i++){
            if(n[i]!=1) System.out.println(i);
        }
    }
}
