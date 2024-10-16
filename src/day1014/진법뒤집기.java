package day1014;

public class 진법뒤집기 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%3);
            n/=3;
        }
        char[] cArr = sb.toString().toCharArray();
        return 0;

    }
    public String toN(int num,int n){
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num%n);
            num/=3;
        }
        return sb.reverse().toString();
    }
}
