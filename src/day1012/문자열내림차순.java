package day1012;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 문자열내림차순 {
    public String solution(String s){
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        StringBuilder sb = new StringBuilder(cArr.length);
        for(int i =cArr.length-1;i>=0;i--){
            sb.append(cArr[i]);
        }

        return sb.toString();

    }
}
