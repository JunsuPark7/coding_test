package day1;

import java.util.Scanner;

public class t1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String findStr = sc.next();
        char c = sc.next().charAt(0);
        int solution = solution(findStr, c);
        System.out.println(solution);
        return ;
    }

    public static int solution(String findStr, Character c){
        findStr = findStr.toUpperCase();
        c = Character.toUpperCase(c);
        int result = 0;
//        for (int i = 0; i < findStr.length(); i++) {
//            if (findStr.charAt(i) == c) {
//                result++;
//            }
//        }

        for (char x : findStr.toCharArray()) {
            if (x == c) {
                result++;
            }
        }

        return result;
    }
}
