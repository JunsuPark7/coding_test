package day2;

import java.util.Scanner;

public class t9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution3(str);
    }

    private static void solution3(String str) {

        StringBuilder sb = new StringBuilder();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                sb.append(x);
            }
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }

//    private static void solution2(String str) {
//
//        // 0 ~ 9 추출 후에 result 값에 누적 하면서 더하기.
//        char[] charArray = str.toCharArray();
//        int answer = 0;
//        for (char x : charArray) {
//            if (x >= 48 && x <= 57) {
//                answer = answer * 10 + (x - 48);
//            }
//        }
//        System.out.println(answer);
//    }



//    private static void solution(String str) {
//
//        char[] charArray = str.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        //0~9만 추출.
//        for (char x : charArray) {
//            if ( (int) x >= 48 && (int) x <= 57 ) {
//                sb.append(x);
//            }
//        }
//
//
//        //앞이 0 있는거 없애기. (자연수 추출)
//        StringBuilder sb2 = new StringBuilder();
//        boolean isNum = false;
//        for (char y : sb.toString().toCharArray()) {
//            if ((int) y == 48) {
//                if (!isNum) {
//                    continue;
//                }
//            } else {
//                isNum = true;
//            }
//            sb2.append(y);
//        }
//        System.out.println(sb2.toString());
//
//    }


}
