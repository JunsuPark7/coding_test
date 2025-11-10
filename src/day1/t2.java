package day1;

import java.util.Scanner;

public class t2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution2(str);

    }

    public static void solution(String str) {

        StringBuilder r1 = new StringBuilder();
        for (char s : str.toCharArray()) {
            if (Character.isUpperCase(s)) {
                s = Character.toLowerCase(s);
            } else if (Character.isLowerCase(s)) {
                s = Character.toUpperCase(s);
            }
            r1.append(s);
        }
        System.out.println(r1);
    }

    public static void solution2(String str) {

        StringBuilder r1 = new StringBuilder();
        for (char s : str.toCharArray()) {

//           아스키 넘버 소문자 65 ~ 90
//            대문자 97 ~ 122
            if (s >= 65 & s <= 90) {
//               소문자 => +32를 더해야함.
                s = (char)(s + 32);
            } else {
                s = (char)(s - 32);
            }

            r1.append(s);
        }
        System.out.println(r1);
    }

}
