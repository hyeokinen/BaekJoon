package Samsung;

import java.util.Scanner;

public class BubbleSort {

    // 테스트 코드 입력받아서 몇번 움직였는지를 카운트 해야한다.
    // 즉 버블정렬을 구현하고 구현한 함수가 몇번 움직이는지를 확인해야한다.

    public static void Sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                }
            }
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the arraySize");
        int nx = scan.nextInt();
        int[] array1 = new int[nx];
//        int count1=0;
        for (int i = 0; i < nx; i++) {
            System.out.println("Enter the number");
            array1[i] = scan.nextInt();

        }

        BubbleSort.Sort(array1);

        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");

        }

//        for (int i : array1) {
//            System.out.println(i + " ");
//        }

    }


}