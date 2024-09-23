package Bronze2;


import java.util.Scanner;

public class BOJ2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a*b*c;
        char[] arr = Integer.toString(result).toCharArray();

        int[] count = new int[10];

        for(int i=0;i<arr.length;i++){
            int temp = Integer.parseInt(String.valueOf(arr[i]));
            count[temp]++; // value값을 어떤 배열의 인덱스로 변환하여 의미있는 의미로 쓰인다. 부여한다.
        }

        for(int i=0;i<10;i++)
            System.out.println(count[i]);
    }
}
