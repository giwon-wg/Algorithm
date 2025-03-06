class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String num = String.valueOf(x);
        int val = num.length();
        for(int i = 0; i < val; i++){
            sum += num.charAt(i) - '0';
        }

        if(x%sum == 0){
                answer = true;
            } else{
                answer = false;
            }
        return answer;
    }
}