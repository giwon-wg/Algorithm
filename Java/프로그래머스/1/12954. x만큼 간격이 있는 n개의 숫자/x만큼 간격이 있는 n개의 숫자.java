class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long val = 0;
        for(int i = 0; i < answer.length; i++){
            val += x;
            answer[i] = val;
        }
        return answer;
    }
}