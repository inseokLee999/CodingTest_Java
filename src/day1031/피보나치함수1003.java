package day1031;

import java.util.Arrays;
import java.util.Scanner;

public class 피보나치함수1003 {
    static int countOne = 0;
    static int countZero = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] nums = new int[T];
        for(int i = 0; i < T; i++){
            nums[i] = scanner.nextInt();
        }
        int max = Math.max(Arrays.stream(nums).max().orElse(0),1);
        int[][] callFibo = new int[max+1][2];
        callFibo[0][0] = 1;
        callFibo[0][1] = 0;
        callFibo[1][0] = 0;
        callFibo[1][1] = 1;
        for(int i =2;i<=max;i++){
            callFibo[i][0] = callFibo[i-1][0]+callFibo[i-2][0];
            callFibo[i][1] = callFibo[i-1][1]+callFibo[i-2][1];
        }
        for (int i = 0; i < T; i++) {
            System.out.println(callFibo[nums[i]][0] + " " + callFibo[nums[i]][1]);
        }
    }

}
