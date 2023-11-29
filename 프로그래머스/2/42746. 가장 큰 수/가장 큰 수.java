import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] stringNumbers = new String[numbers.length];
        
        for(int i=0;i<numbers.length;i++){
            stringNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(stringNumbers,(a,b)->(b+a).compareTo(a+b));
        
        if(stringNumbers[0].equals("0")){
            return "0";
        }
        
        for(String s : stringNumbers){
            answer+=s;
        }
        
        return answer;
    }
}