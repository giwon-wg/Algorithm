class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int val = phone_number.length();
        
        String a = "*".repeat(val - 4);
        String b = phone_number.substring(val - 4);
        
        answer = a + b;
        
        return answer;
    }
}