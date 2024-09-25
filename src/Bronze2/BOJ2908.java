package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] a = st.nextToken().toCharArray();
        char[] b = st.nextToken().toCharArray();

        char temp;
        temp = a[2];
        a[2] = a[0];
        a[0] = temp;

        temp = b[2];
        b[2] = b[0];
        b[0] = temp;

        int A = Integer.parseInt(new String(a));
        int B = Integer.parseInt(new String(b));

        System.out.println(Math.max(A, B));
    }
}
