package day1101;

import java.util.Scanner;

public class 수들의합1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long answer = 1;
        while(N>=answer){
            N -= answer++;
        }
        System.out.println(--answer);
    }
}
