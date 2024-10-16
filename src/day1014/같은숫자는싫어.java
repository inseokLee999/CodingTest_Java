import java.util.*;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<arr.length;i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                continue;}
            if(stack.peek()!=arr[i]){
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i = 0;i<stack.size();i++){
            answer[i] = stack.get(i);
        }

        return answer;
    }
}