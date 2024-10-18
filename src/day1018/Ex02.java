package day1018;

public class Ex02 {
    class Solution {
        public int solution(String[] babbling) {
            String[] words = {"aya","ye","woo","ma"};
            int answer = 0;
            for(String babble : babbling){
                String prevWord = "";
                boolean isValid = true;

                //유효한 단어인지 확인
                while(babble.length()>0){
                    boolean matched = false;
                    for(String word : words){
                        if(babble.startsWith(word) && !babble.equals(prevWord)){
                            prevWord = babble;
                            babble = babble.substring(word.length());
                            matched = true;
                            break;
                        }
                        if(!matched){
                            isValid = false;
                            break;
                        }
                    }
                }

                if(isValid) answer++;
            }
            return answer;
        }
    }
}
