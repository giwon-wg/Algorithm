class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);
            
            if (Character.isLowerCase(val)) {
                val = (char) ((val - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(val)) {
                val = (char) ((val - 'A' + n) % 26 + 'A');
            }
            answer += val;
        }
        
        return answer;
    }
}