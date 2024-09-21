package Bronze2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Set : 중복을 허용하지 않는 자료구조
        Set<Integer> mySet = new HashSet<>();

        for(int i = 0; i<10;i++){
            int temp = sc.nextInt()%42;
            mySet.add(temp);
        }

        System.out.println(mySet.size());
    }
}
