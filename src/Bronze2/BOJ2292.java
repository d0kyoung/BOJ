package Bronze2;

import java.util.Scanner;

public class BOJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int now = 1;
        while( N > count) {
            count += now*6;
            now++;
        }
        System.out.println(now);
    }
}

//1 : 1
//2~7 : 2     -> 1+6
//8~19 : 3    -> 1+6*2
//20~29 : 4   -> 1+6*3