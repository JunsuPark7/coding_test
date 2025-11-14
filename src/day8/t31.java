package day7;

import java.util.Scanner;

public class t31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solution(n, m, arr);
    }

    private static void solution(int n, int m, int[] arr) {

        int lp = 0, count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum > m && lp <= i) sum -= arr[lp++];
            if(sum == m) count++;
        }
        System.out.println(count);
    }


}
