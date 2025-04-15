public class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                result.append(c);
                index = 0;
            } else {
                if (index % 2 == 0) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                index++;
            }
        }

        return result.toString();
    }
}
