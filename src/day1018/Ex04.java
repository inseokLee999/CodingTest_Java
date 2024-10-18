package day1018;

import java.util.LinkedList;
import java.util.Queue;

public class Ex04 {
    boolean solution(String s) {
        boolean answer = true;
        Queue<String> check = new LinkedList<>();
        char[] cArr = s.toCharArray();
        for(int i = 0;i<cArr.length;i++){
            if(cArr[i]=='('){
                System.out.println("(");
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
