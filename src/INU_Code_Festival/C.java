package INU_Code_Festival;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.*;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        char[] arr3 = br.readLine().toCharArray();
        char[] arr4 = br.readLine().toCharArray();
        char[] arr5 = br.readLine().toCharArray();

        boolean[] arrs = new boolean[94];
        char[] ascii = new char[94];
        for (int i = 0; i < ascii.length; i++) {
            ascii[i] = (char) (i + 33);
        }
        char[] cont = new char[20];
        for(int i=0;i<10;i++) {
            cont[i]= Integer.toString(i).charAt(0);
        }
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < ascii.length; i++) {
                if (arr1[j] == ascii[i]) {
                    arrs[i] = true;
                }else if(arr1[j]==toUpperCase(ascii[i])){
                    arrs[i] = true;
                } else if(arr1[j]==toLowerCase(ascii[i])){
                    arrs[i] = true;
                }
            }
        }
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < ascii.length; i++) {
                if (arr2[j] == ascii[i]) {
                    arrs[i] = true;
                } else if(arr2[j]==toUpperCase(ascii[i])){
                    arrs[i] = true;
                } else if(arr2[j]==toLowerCase(ascii[i])){
                    arrs[i] = true;
                }
            }
        }
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < ascii.length; i++) {
                if (arr3[j] == ascii[i]) {
                    arrs[i] = true;
                }else if(arr3[j]==toUpperCase(ascii[i])){
                    arrs[i] = true;
                } else if(arr3[j]==toLowerCase(ascii[i])){
                    arrs[i] = true;
                }
            }
        }
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < ascii.length; i++) {
                if (arr4[j] == ascii[i]) {
                    arrs[i] = true;
                }else if(arr4[j]==toUpperCase(ascii[i])){
                    arrs[i] = true;
                } else if(arr4[j]==toLowerCase(ascii[i])){
                    arrs[i] = true;
                }
            }
        }
        for (int j = 0; j < arr5.length; j++) {
            for (int i = 0; i < ascii.length; i++) {
                if (arr5[j] == ascii[i]) {
                    arrs[i] = true;
                } else if(arr5[j]==toUpperCase(ascii[i])){
                    arrs[i] = true;
                } else if(arr5[j]==toLowerCase(ascii[i])){
                    arrs[i] = true;
                }
            }
        }

        for (int i = 0; i < arrs.length; i++) {
            if(!arrs[i]) {
                System.out.print((char) (i + 33));
            }
        }
    }
}
