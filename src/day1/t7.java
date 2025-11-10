package day1;

import java.util.Scanner;

public class t7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);


    }

    public static void solution(String str) {
        str = str.toUpperCase();

        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        boolean isRepeat = true;
        while (rt > lt) {
            if (charArray[lt] != charArray[rt]) {
                isRepeat = false;
                break;
            }
            rt--;
            lt++;
        }
        if (isRepeat) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}
