import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] valStr = Long.toString(n).split("");
        Arrays.sort(valStr, Collections.reverseOrder());
        
        StringBuilder str = new StringBuilder();
        
        for(String str2 : valStr)
            str.append(str2);
        
        answer = Long.parseLong(str.toString());
        return answer;
    }
}