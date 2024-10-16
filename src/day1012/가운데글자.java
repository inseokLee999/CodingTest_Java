package day1012;

public class 가운데글자 {
    public String solution(String s){
        int sLength = s.length();
        String answer = "";
        if(sLength%2==0){
            answer+=s.substring(sLength/2-1,sLength/2);
        }else{
            answer += s.substring(sLength/2);
        }
        return answer;
    }
}
