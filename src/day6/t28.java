package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class t28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNum1 = sc.nextInt();
        int[] arr1 = new int[arrNum1];
        for (int i = 0; i < arrNum1; i++) {
            arr1[i] = sc.nextInt();
        }

        int arrNum2 = sc.nextInt();
        int[] arr2 = new int[arrNum2];
        for (int i = 0; i < arrNum2; i++) {
            arr2[i] = sc.nextInt();
        }

        solution(arrNum1, arrNum2,arr1, arr2);

    }

    private static void solution(int arrNum1, int arrNum2, int[] arr1, int[] arr2) {

        int pointer1 = 0;
        int pointer2 = 0;
        int [] result = new int[arrNum1 + arrNum2];

        while (pointer1 < arrNum1 && pointer2 < arrNum2) {

            if (arr1[pointer1] <= arr2[pointer2]) {
                result[pointer1 + pointer2] = arr1[pointer1];
                pointer1++;
            } else {
                result[pointer1 + pointer2] = arr2[pointer2];
                pointer2++;
            }
        }
        while(pointer1 < arrNum1){
            result[pointer1 + pointer2] = arr1[pointer1];
            pointer1++;
        }

        while (pointer2 < arrNum2) {
            result[pointer1 + pointer2] = arr2[pointer2];
            pointer2++;
        }




//        while ((pointer1 < arrNum1) || (pointer2 < arrNum2)) {
//            if (pointer1 == arrNum1) {
//                result[pointer1 + pointer2] = arr2[pointer2];
//                pointer2++;
//                continue;
//            } else if (pointer2 == arrNum2) {
//                result[pointer1 + pointer2] = arr1[pointer1];
//                pointer1++;
//                continue;
//            }
//
//            if (arr1[pointer1] <= arr2[pointer2]) {
//                result[pointer1 + pointer2] = arr1[pointer1];
//                pointer1++;
//            } else {
//                result[pointer1 + pointer2] = arr2[pointer2];
//                pointer2++;
//            }
//
//        }

        for (int i : result) {
            System.out.print(i + " ");
        }




    }

}
