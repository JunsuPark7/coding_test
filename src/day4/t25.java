package day4;

import java.util.Scanner;

public class t25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arrays = new int[num + 2][num + 2];

        for (int i = 1; i <= num; i++) {
            for (int z = 1; z <= num; z++) {
                arrays[i][z] = sc.nextInt();
            }
        }
        solution2(num, arrays);
    }

    private static void solution2(int num, int[][] arrays) {
        // 좌표값을 써서 문제를 풀기.
        // 12시부터 체크
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int result = 0;

        for (int i = 1; i <= num; i++) {

            for (int z = 1; z <= num; z++) {

                int x,y;
                int max = 0;
                for (int k = 0; k <= 3; k++) {
                    x = dx[k];
                    y = dy[k];
                    int val = arrays[i + x][z + y];
                    // 이중에서 젤 높은애를 찾아보기.
                    max = Math.max(max, val);
                }
                if (arrays[i][z] > max) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }


    private static void solution(int num, int[][] arrays) {

        int result = 0;

        for (int i = 1; i <= num; i++) {


            int val,a,b,c,d = 0;
            for (int z = 1; z <= num; z++) {
                int max = 0;
                val = arrays[i][z]; // 기준값.
                a = arrays[i - 1][z]; // 위값
                b = arrays[i + 1][z]; // 아래값
                c = arrays[i][z - 1]; // 왼쪽값
                d = arrays[i][z + 1]; // 오른쪽값

                max = Math.max(max, a);
                max = Math.max(max, b);
                max = Math.max(max, c);
                max = Math.max(max, d);

                if (val > max) {
                    result++;
                }

            }
        }

        System.out.println(result);

    }

}
