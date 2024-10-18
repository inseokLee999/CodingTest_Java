package day1017;

public class 시저암호 {
    public String solution(String s, int n) {
        StringBuilder sb=new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                sb.append((char)('a'+(s.charAt(i)+n)%'a'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf('a'+(('z'+1)%'a')%26));
        System.out.println(Integer.valueOf('a'));
    }
}
