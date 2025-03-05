import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        int val = num.length();
        for (int i = 0; i < val; i++){
            answer += num.charAt(i) - '0';
        }
        return answer;
    }
}