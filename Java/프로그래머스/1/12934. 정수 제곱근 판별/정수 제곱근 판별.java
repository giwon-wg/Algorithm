class Solution {
    public long solution(long n) {
        long answer = 0;
        for(long i = 0; i*i <= n; i++){
            if(i * i == n){
                return answer = (i + 1) * (i + 1);
            } 
        }
        return -1;
    }
}