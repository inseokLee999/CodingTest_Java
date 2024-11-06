package day1105;

import java.util.Arrays;
import java.util.Scanner;

public class 제곱ㄴㄴ수1016 {
    public static void main(String[] args) {
        long min, max;
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        min = Long.parseLong(str[0]);
        max = Long.parseLong(str[1]);
        long sqrtMin, sqrtMax;
        sqrtMin = (long) Math.max(Math.sqrt(min), 2);
        sqrtMax = (long) Math.sqrt(max);
        System.out.println(sqrtMin + " " + sqrtMax);
        long answer = max - min + 1;
        boolean[] primeNum = new boolean[(int) sqrtMax + 1];
        Arrays.fill(primeNum, true);
        for (long i = 2; i <= sqrtMax; i++) {
            if (primeNum[(int) i]) {
                for (int j = (int) (2 * i); j <= sqrtMax; j += (int) i) {
                    primeNum[j] = false;
                }
            }
        }
//        System.out.println(Arrays.toString(primeNum));
        for (long i = sqrtMin; i <= sqrtMax; i++) {
            if(primeNum[(int)i]){
                System.out.println("i : "+i);
                long a = max / (int)Math.pow(i,2);
                long b = min / (int)Math.pow(i,2);
                System.out.println(a+","+b);
                answer -=(a-b);
                System.out.println(answer);
            }
        }
        System.out.println(answer);
    }
}
