package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class t11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution2(str);
    }


    private static void solution2(String str) {
        str = str + " ";
        char[] charArray = str.toCharArray();
        StringBuilder result = new StringBuilder();
        int num = 1;
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                num++;
            } else {
                result.append(charArray[i]);
                if (num != 1) {
                    result.append(num);
                }
                num = 1;
            }
        }
        System.out.println(result);
    }

    private static void solution(String str) {
        char[] charArray = str.toCharArray();

        StringBuilder result = new StringBuilder();
        int num = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (i == charArray.length - 1) {
                result.append(charArray[i]);
                if (num != 1) {
                    result.append(num);
                }
                break;
            }

            if (charArray[i] == charArray[i + 1]) {
                num++;
            } else {
                result.append(charArray[i]);
                if (num != 1) {
                    result.append(num);
                }
                num = 1;
            }
        }
        System.out.println(result);


    }

}
