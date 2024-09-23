package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();

        for(int i=0;i<26;i++) {
            int temp = -1;
            for(int j=0;j<text.length;j++) {
                if(text[j]-'a'==i) { // -a를 하는게 핵심. b-a = 1
                    temp = j;
                    break;
                }
            }
            System.out.print(temp+" ");
        }
    }
}
