package Bronze3;

import java.io.*;

public class BOJ30889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        char[][] seats = new char[10][20];

        for(int i=0;i<10;i++){
            for(int j=0;j<20;j++){
                seats[i][j] = '.';
            }
        }

        for(int i=0; i<T;i++){
            String seatinfo = br.readLine();
            char row = seatinfo.charAt(0);
            int col = Integer.parseInt(seatinfo.substring(1))-1;

            seats[row-'A'][col] ='o';
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<20;j++){
                bw.write(seats[i][j]);
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
