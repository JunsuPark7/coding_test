package day2;


import java.util.Arrays;
import java.util.Scanner;

public class t10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution2(str);
    }

    private static void solution2(String str) {
        String[] split = str.split(" ");
        char[] charArray = split[0].toCharArray();
        char target = split[1].charAt(0);
        // 왼탐을 하는데 100 을 기준으로 넣기. ( 큰값을 넣고 나서, 다시 오탐 할때, 바꾸기..
        // 왼탐하고 오탐 하면서, min 값으로 넣어주면됨.
        int[] result = new int[charArray.length];
        int p = 100;
        for (int i = 0; i < charArray.length; i++) {
            if (target == charArray[i]) {
                p = 0;
            }
            result[i] = p;
            p++;
        }

        p = 100;
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (target == charArray[i]) {
                p = 0;
            }
            result[i] = Math.min(result[i], p);
            p++;
        }

        for (int x : result) {
            System.out.print(x + " ");
        }

    }

//    private static void solution(String str) {
//        String[] split = str.split(" ");
//        char[] charArray = split[0].toCharArray();
//        char target = split[1].charAt(0);
//
//        // 왼탐시작.
//
//        int[] left = new int[charArray.length];
//        int[] right = new int[charArray.length];
//        int left_val = 1;
//        int right_val = 1;
//        int last_index = 0;
//        int first_index = 0;
//        for (int i = 0; i <= charArray.length - 1; i++) {
//            if (target == charArray[i]) {
//                left_val = 0;
//                last_index = i;
//            }
//            left[i] = left_val;
//            left_val++;
//
//            if (target == charArray[charArray.length - 1 - i]) {
//                right_val = 0;
//                first_index = charArray.length - 1 - i;
//            }
//            right[charArray.length - 1 - i] = right_val;
//            right_val++;
//
//        }
//
//
//        StringBuilder result_sb = new StringBuilder();
//        int val = 0;
//        for (int i = 0; i <= left.length - 1; i++) {
//
//            val = Math.min(left[i], right[i]);
//            if (i <= first_index) {
//                val = right[i];
//            } else if (i >= last_index) {
//                val = left[i];
//            }
//            result_sb.append(val);
//
//            //맨뒷값 처리.
//            if (i != left.length - 1) {
//                result_sb.append(" ");
//            }
//        }
//        System.out.println(result_sb);
//
//    }

}
