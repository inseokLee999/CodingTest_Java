package day1016;

import java.util.Scanner;

public class 최솟값괄호 {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] A = str.split("-");
        for(int i = 0; i < A.length; i++){
            int temp = mySum(A[i]);
            if(i==0)answer = answer+temp;
            else answer = answer - temp;
        }
        System.out.println(answer);
    }

    private static int mySum(String s) {
        int sum = 0;
        String[] str = s.split("[+]");
        for(int i = 0; i < str.length; i++){
            sum+= Integer.parseInt(str[i]);
        }
        return sum;
    }
}
