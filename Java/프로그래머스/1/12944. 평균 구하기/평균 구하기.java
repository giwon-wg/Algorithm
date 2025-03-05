class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int val = arr.length;
        for(int num:arr)
            answer += num;
        return answer/val;
    }
}