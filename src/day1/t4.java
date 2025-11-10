package day1;

import java.util.ArrayList;
import java.util.Scanner;

public class t4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // ★ 버퍼에 남은 엔터 제거
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = sc.nextLine();
        }

        solution2(strArray);

    }

    private static void solution(String[] strArray) {

        for (String str : strArray) {
            StringBuilder sb = new StringBuilder();
            for (Character c : str.toCharArray()) {
                sb.insert(0, c);
            }
            System.out.println(sb);
        }
    }

    private static void solution2(String[] strArray) {

        for (String str : strArray) {

            char[] charArray = str.toCharArray();

            int lt = 0;
            int rt = str.length() - 1;
            while (rt > lt) {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }

            System.out.println(charArray);


        }
    }

}
