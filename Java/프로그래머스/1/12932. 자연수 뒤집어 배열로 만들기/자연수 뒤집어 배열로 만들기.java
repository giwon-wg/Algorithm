class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int val = num.length();
        int[] answer = new int[val];
        for(int i = val - 1; i >= 0; i--){
            answer[val - 1 - i] = num.charAt(i) - '0';
        }
        
        return answer;
    }
}