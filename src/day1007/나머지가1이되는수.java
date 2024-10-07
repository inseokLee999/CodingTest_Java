package day1007;

public class 나머지가1이되는수 {
    /**
     * 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.
     * 1. 아이디어
     * n-1이 x로 나누어서 떨어지는지?
     * 3부터 가장작은 자연수 x
     * 2. 시간 복잡도
     * 100000
     * 3. 변수
     */
    public static int solution(int n) {
        for (int i = 3; i < Math.sqrt(n); i++) {
            if(n%i == 1){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
