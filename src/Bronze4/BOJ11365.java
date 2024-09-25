package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            char[] text = br.readLine().toCharArray();
            String txt = String.valueOf(text);
            if(txt.equals("END")) break;


            for (int i = text.length; i > 0; i--) {
                    System.out.print(text[i - 1]);
            }
            System.out.println("");


        }
    }
}
