package day2;

import java.util.Scanner;

public class t8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution3(str);
    }

    private static void solution3(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String str2 = new StringBuilder(str).reverse().toString();
        if (str.equals(str2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
//
//    private static void solution2(String str) {
////        그냥 한개 한개 배열로 탐색후 다 정리 후에 회문 검사하기.
//        str = str.toUpperCase();
//        char[] charArray = str.toCharArray();
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (char x : charArray) {
//            if (Character.isAlphabetic(x)) {
//                stringBuilder.append(x);
//            }
//        }
//
//        char[] charArray2 = stringBuilder.toString().toCharArray();
//        int lt = 0;
//        int rt = charArray2.length- 1;
//        boolean isSame = true;
//        while (rt > lt) {
//            if (charArray2[lt] != charArray2[rt]) {
//                isSame = false;
//                break;
//            }
//            lt++;
//            rt--;
//        }
//        if (isSame) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//    }

//    private static void solution(String str) {
//        str = str.toUpperCase();
//        char[] charArray = str.toCharArray();
//
//        int lt = 0;
//        int rt = str.length() - 1;
//        boolean isSame = true;
//        while (rt > lt) {
//            if (!Character.isAlphabetic(charArray[lt])) {
//                lt++;
//            } else if (!Character.isAlphabetic(charArray[rt])) {
//                rt--;
//            } else {
//                //회문인지 아닌지 검사 하는 로직.
//                if (charArray[lt] != charArray[rt]) {
//                    isSame = false;
//                    break;
//                }
//                lt++;
//                rt--;
//            }
//        }
//        if (isSame) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//    }




}
