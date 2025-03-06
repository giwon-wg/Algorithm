class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int val = absolutes.length;
        
        for(int i = 0; i < val; i++){
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }
}