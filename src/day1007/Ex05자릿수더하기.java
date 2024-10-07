package day1007;

public class Ex05자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        char[] cNum = String.valueOf(n).toCharArray();
        for (char c : cNum) {
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer;
    }
}
