package Bronze1;

import java.io.*;

public class BOJ1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int num = N;
        int cycle = 0;
        do {
            int n1 = num / 10;
            int n2 = num % 10;
            int n3 = (n1 + n2) % 10;
            num = n2 * 10 + n3;
            cycle++;
        } while (N != num);
        bw.write(cycle+ " ");
        bw.flush();
        bw.close();
        br.close();

    }
}
