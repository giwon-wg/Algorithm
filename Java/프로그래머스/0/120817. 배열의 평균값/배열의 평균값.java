class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int val = numbers.length;
        
        for(int i = 0; i < val; i++){
            int a = numbers[i];
            answer += a;
        }
        return answer/val;
    }
}