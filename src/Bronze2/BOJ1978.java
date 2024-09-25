package Bronze2;

import java.util.Scanner;

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for(int i=0;i<a;i++){
            int temp = sc.nextInt();
            boolean IsTrue = true;
            if(temp == 1) IsTrue = false;
            else {
                for(int j=2;j<=Math.sqrt(temp);j++){
                    if(temp%j==0){
                        IsTrue = false;
                        break;
                    }

                }
            }
            if(IsTrue) count++;
        }
        System.out.println(count);
    }
}
