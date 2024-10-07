package day1007;

import java.util.Arrays;

public class 평균구하기 {
    public double solution(int[] arr) {
        double answer = Arrays.stream(arr).sum();

        return answer/arr.length;
    }
}
