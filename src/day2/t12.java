package day2;

import java.util.Scanner;

public class t12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        solution(num, str);

    }

    private static void solution(int num, String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int tmp_int = Integer.parseInt(tmp, 2);
            result.append((char) tmp_int);
            str = str.substring(7);
        }
        System.out.println(result);



    }


}
