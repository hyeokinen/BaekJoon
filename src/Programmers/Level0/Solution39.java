package Programmers.Level0;
//자릿수 더하기
//문제 설명
//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

import java.util.Scanner;

public class Solution39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        int result = 0;
        while (n > 0){
            result += n%10;
            n /= 10;

        }
        System.out.println(result);
    }
}
