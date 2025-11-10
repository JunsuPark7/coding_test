package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] num_array = new int[num];
        for (int i = 0; i < num; i++) {
            num_array[i] = sc.nextInt();
        }
        solution2(num, num_array);
    }

    private static void solution2(int num, int[] numArray) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int n : numArray) {

            int res = 0;
            while (n != 0) {
                // 1의 자리 가져오기.
                int t = n % 10;
                // 누적계산하기.
                res = res * 10 + t;
                // 다시 10으로 나눠줘서 tmp 값 업데이트.
                n = n / 10;
            }

            // 소수 판별
            boolean isSosu = true;
            for (int i = 2; i < res; i++) {
                if (res % i == 0) {
                    isSosu = false;
                    break;
                }
            }
            if (isSosu) {
                if (res >= 2) {
                    list.add(res);
                }
            }

        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    private static void solution(int num, int[] num_array) {

        // 몇자릿수 인지 계산 하기.

        List<Integer> list = new ArrayList<>();

        for (int n : num_array) {

            // 자릿수 뒤집기.
            String str = new StringBuilder(String.valueOf(n)).reverse().toString();
            int val = Integer.parseInt(str);

            // 소수인지 아닌지 판단하기.
            boolean isSosu = true;
            for (int i = 2; i < val; i++) {
                if (val % i == 0) {
                    isSosu = false;
                    break;
                }
            }
            if (isSosu) {
                // 2이상인지 소수만 판단 해서 넣기.
                if (val >= 2) {
                    list.add(val);
                }
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }


}
