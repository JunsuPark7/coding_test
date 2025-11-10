package day4;

import java.util.Scanner;

public class t20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        solution(value);
    }

    private static void solution(int value) {
        int result = 0;

        // value + 1 하는 이유가 value값이 20 이면,
        // 배열로 생기는 인덱스는 19까지 생기니까, 제대로 for문을 못돌아서, +1을 시켜줘야함.
        int[] arrays = new int[value + 1];
        for (int i = 2; i <= value; i++) {
            if (arrays[i] == 0) {
                result++;


                // 0일때 체크하고, 한바퀴 돌면서 배수 없애기.
                for (int z = i; z <= value; z = z + i) {
                    arrays[z] = 1;
                }

            }
            // 1일때는, (배수를 다 없앴으니) 굳이 배수를 안걸러내도됨.
        }
        System.out.println(result);
    }


}
