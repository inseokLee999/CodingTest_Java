package day1016;

import java.util.Scanner;

public class 소수구하기 {
    /*M이상 N 이하의 소수를 모두 출력하는 프로그램
     * 1<=M<=N<=1000000
     * */
    /*
     * A 배열 초기화
     * N의 제곱근까지
     * 소수가 아니면 넘어감
     * for(소수의 배수값을 N까지 반복)
     * 출력
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] A = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (A[i] == 0) continue;
            for (int j = i + i; j <= n; j = j + i) {
                A[j] = 0;
            }
        }
        for (int i = m; i <= n; i++) {
            if (A[i] != 0) System.out.println(A[i]);
            ;
        }
    }
}
