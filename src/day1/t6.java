package day1;

import java.util.ArrayList;
import java.util.Scanner;

public class t6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);

    }

    private static void solution(String str) {
        char[] charArray = str.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();

        for (char x : charArray) {
            if (!characters.contains(x)) {
                characters.add(x);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char val : characters) {
            sb.append(val);
        }

        System.out.println(sb);



    }


}
