package day1011;

import java.util.Arrays;

public class Ex01정수내림차순배치 {
    public static long solution(long n){
        Long newN = n;
        char[] iArr = newN.toString().toCharArray();
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        long answer = 0;
        for(int i=0;i<iArr.length;i++){
            answer+= (long) (Integer.parseInt(String.valueOf(iArr[i]))*Math.pow(10,i));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
