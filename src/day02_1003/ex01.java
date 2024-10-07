package day02_1003;

import java.util.Arrays;

public class ex01 {
    public int solution(int n) {
        int answer = 2;
        if (Math.floor(Math.sqrt(n)) == Math.sqrt(n)) {
            answer = 1;
        }
        return answer;
    }

    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        System.out.println(numbers[numbers.length - 1]);
        return answer;
    }

    public int[] solution3(int[] numbers,int num1,int num2) {
        int[] answer = new int[num2-num1+1];
        for (int i = 0; i < num2-num1+1; i++) {
            answer[i] = numbers[num1+i];
        }
        return answer;
    }
    public static int solution4(String my_string){
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i)<'9' && my_string.charAt(i)>'0'){
                answer += Integer.valueOf(my_string.charAt(i)+"");
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution4("aAb1B2cC34oOp"));
    }
}
