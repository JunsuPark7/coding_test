package day1;

import java.util.Scanner;

public class t5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);

    }

    public static void solution(String str) {

        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;




        while (rt > lt) {
            if(!Character.isAlphabetic(charArray[lt])){
                lt++;
            } else if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;

            }
        }

        System.out.println(charArray);



    }

}
