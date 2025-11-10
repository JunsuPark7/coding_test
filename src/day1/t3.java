package day1;

import java.util.Arrays;
import java.util.Scanner;

public class t3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    public static void solution(String str) {
        String[] strArray = str.split(" ");
        String result = "";
        int max = 0;
        for (String s : strArray) {
            if (s.length() > max) {
                max = s.length();
                result = s;
            }
        }
        System.out.println(result);

    }

}
