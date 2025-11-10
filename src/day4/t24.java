package day4;

import java.util.Scanner;

public class t24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arrays = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int z = 0; z < num; z++) {
                arrays[i][z] = sc.nextInt();
            }
            sc.nextLine();
        }
        solution2(num, arrays);
    }

    private static void solution2(int num, int[][] arrays) {

        int result = 0;

        int sum1,sum2 = 0;
        int cross_sum1 = 0;
        int cross_sum2 = 0;
        for (int i = 0; i < num; i++) {
            cross_sum1 += arrays[i][i]; //대각선1
            cross_sum2 += arrays[i][num - 1 - i]; //대각선2

            sum1 = 0;
            sum2 = 0;
            for (int z = 0; z < num; z++) {
                sum1 += arrays[i][z];
                sum2 += arrays[z][i];
            }
            result = Math.max(result, sum1);
            result = Math.max(result, sum2);
        }

        result = Math.max(result, cross_sum1);
        result = Math.max(result, cross_sum2);
        System.out.println(result);
    }

    private static void solution(int num, int[][] arrays) {

        int cross_val = 0;
        int cross_val2 = 0;
        int max = 0;
        for (int i = 0; i < num; i++) {
            cross_val += arrays[i][i];
            cross_val2 += arrays[i][num - 1 - i];

            int hang_val = 0;
            int col_val = 0;
            for (int z = 0; z < num; z++) {
                hang_val += arrays[i][z];
                col_val += arrays[z][i];
            }
//            System.out.println("hang_val = " + hang_val);
//            System.out.println("col_val = " + col_val);

            if (hang_val >= max) {
                max = hang_val;
            }
            if(col_val >= max) {
                max = col_val;
            }

        }

//        System.out.println("cross_val = " + cross_val);
//        System.out.println("cross_val2 = " + cross_val2);

        if (cross_val >= max) {
            max = cross_val;
        }

        if (cross_val2 >= max) {
            max = cross_val2;
        }

        System.out.println(max);

    }

}
