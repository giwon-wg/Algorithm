class Solution {
    public String solution(String s) {
        int val = s.length();
        int cut = val / 2;
        String answer = "";
        if(val % 2 != 0){
            answer = String.valueOf(s.charAt(cut));
        } else {
            answer = s.substring(cut-1, cut+1);
        }
        return answer; 
    }
}