package day01_1002;

import java.util.Arrays;

public class solution {
    public int solution(String message) {
        return message.length() *2;
    }
    public static int[] solution2(String[] strlist) {
        int len = strlist.length;
        int[] answer = new int[strlist.length];
        for(int i=0;i<strlist.length;i++){
            //System.out.println(strlist[i].length());
            answer[i]=strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
