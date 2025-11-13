package day6;


import java.util.Scanner;

public class t30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solution3(n, k, arr);
    }

    private static void solution3(int n, int k, int[] arr) {

        //첫 초기값 세팅.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        //더하기.
        for (int i = k; i < n; i++) {

            sum = sum - arr[i - k] + arr[i];
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);

    }

    private static void solution2(int n, int k, int[] arr) {

        int max = 0;
        for (int i = 0; i <= n - k; i++) {

            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }



}
