package day1030;

import java.util.Arrays;
import java.util.Scanner;

public class 수정렬하기2750 {
    static int N;
    static int[] numbers;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        numbers = new int[N];
        for(int i=0;i<N;i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        for(int i=0;i<N;i++){
            System.out.println(numbers[i]);
        }
    }
}
