package Bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] a = new int[T];
        for(int i=0;i<T;i++){
            a[i] = sc.nextInt();
        }
        // Arrays.sort(a); // 자바 함수 정렬. nlogn의 시간 복잡도

        // 버블 정렬
        for(int i=0;i<T;i++){
            for(int j=0;j<T-1;j++){
                if(a[j]>a[j+1]){  // < : 오름차순, > : 내림차순
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int j : a) {
            System.out.println(j);
        }
    }
}
