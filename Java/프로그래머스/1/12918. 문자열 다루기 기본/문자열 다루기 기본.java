class Solution {
    public boolean solution(String s) {
        boolean answer = (s.length() == 4 || s.length() == 6) && s.matches("\\d+");;
        return answer;
    }
}