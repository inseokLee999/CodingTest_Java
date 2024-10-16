package day1016;

import java.util.Arrays;

public class K번째수 {public int[] solution(int[] array, int[][] commands) {
        /*
        배열을 자른후
        정렬후
        k 번째 숫자 저장
        */
    int[] answer = new int[commands.length];
    for(int i = 0;i<commands.length;i++){
        int[] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
        Arrays.sort(temp);
        answer[i] = temp[commands[i][2]-1];
    }
    return answer;
}
}
