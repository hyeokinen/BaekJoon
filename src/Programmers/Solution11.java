package Programmers;

import java.util.Scanner;

public class Solution11 {
    // 피자나눠먹기(1)
    // 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

    public static void main(String[] args) {
        int P = 7; // 피자조각
        int N; // 사람의 수
        int result = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("사람의 수를 입력하세요: ");
        N = scan.nextInt();

        if (N > P){
           result  += N/P;
            System.out.println(result);
        }

        if (N <= P){
            System.out.println(result);
        }
    }

}
