package day1010;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01PccP {
    /**
     * 2회이상 나타나면서 2개의 부분으로 나뉘어져있으면
     * 외톨이 알파벳
     * -> cArr[0]부터
     * 처음 나온애 -> 체크 0->1
     * 두번째 나온애 -> 외톨이 알파벳 추가
     * 체크 ? 1이면 외톨이 알파벳
     * 0이면 1로 바꾸고 똑같은거 없애기
     * 체크 를 1로 하고 똑같은거 없애고
     * 2. 시간복잡도
     * O(N)
     * 3. 변수
     * char[] cArr
     * boolean[] check
     * int count
     * char[] aArr
     */
    public static String solution(String input_string) {
        char[] cArr = input_string.toCharArray();
        int[] check = new int[26];
        int count = 0;
        for (int i = 0; i < cArr.length; i++) {
            if (check[cArr[i] - 'a'] == 0) {
                check[cArr[i] - 'a'] = 1;
                while (i < cArr.length-1 && cArr[i + 1] == cArr[i]) {
                    i++;
                }
            } else {
                count++;
                check[cArr[i] - 'a'] = 2;
            }
        }
        char[] aArr = new char[count];
        StringBuilder answer = new StringBuilder();
        System.out.println(Arrays.toString(check));
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 2) {
                answer.append(Character.toString(i + 'a'));
            }
        }
        if(answer.isEmpty()){
            return "N";
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("eeddee"));
    }
}
