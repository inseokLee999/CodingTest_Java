package day1018;

import java.util.Arrays;

public class 이진변환반복 {
    static String str;
    static int count=0;
    static int countZero=0;
    public static int[] solution(String s){
        calc(s);
        /*
        * Arrays.stream(c).filter(i->i!=0).toArray();
        * */


        return new int[]{count,countZero};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }
    static void calc(String s){
        while(!s.equals("1")){
            count++;
            char[] chars = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char c : chars){
                if(c == '1'){
                    sb.append(c);
                }else{
                    countZero++;
                }
            }
            int len = sb.length();
            s = Integer.toBinaryString(len);
        }
    }
}
