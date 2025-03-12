class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long cost = price * (long) count * (count + 1) / 2;
        answer = Math.max(cost - money, 0);
        return answer;
    }
}