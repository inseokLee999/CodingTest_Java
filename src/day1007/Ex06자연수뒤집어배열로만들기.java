package day1007;

public class Ex06자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        char[] str = String.valueOf(n).toCharArray();
        int[] answer = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            answer[str.length-i-1] = str[i] - '0';
        }
        return answer;
    }
}
