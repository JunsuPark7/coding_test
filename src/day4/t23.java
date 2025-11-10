package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class t23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] num_arr = new int[num];
        for (int i = 0; i < num; i++) {
            num_arr[i] = sc.nextInt();
        }
        solution2(num, num_arr);
    }

    private static void solution2(int num, int[] numArr) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int val = numArr[i];
            int rank = 1;

            for (int z = 0; z < num; z++) {
                int val2 = numArr[z];
                if (val2 > val) {
                    rank++;
                }
            }
            result.add(rank);
        }
        for (Integer i : result) {
            System.out.print(i + " ");
        }

    }

    private static void solution(int num, int[] numArr) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int val = numArr[i];
            int rank = num + 1;

            for (int z = 0; z < num; z++) {
                int val2 = numArr[z];
                if (val >= val2) {
                    rank--;
                }
            }
            result.add(rank);
        }

        for (Integer i : result) {
            System.out.print(i + " ");
        }

    }

}
