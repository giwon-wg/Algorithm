class Solution {
    public int solution(int n) {
        int answer = 0;
        //3진법 변환
        String a = Integer.toString(n, 3);
        
        //뒤집기
         String reverse = new StringBuilder(a).reverse().toString();
        
        //10진법 변환
        answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}