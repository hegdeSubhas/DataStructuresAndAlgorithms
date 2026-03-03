import java.util.HashSet;
public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int answerLength = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (!set.contains(ch)) {
                set.add(ch);
                answerLength = Math.max(answerLength, right - left + 1);
                right++;
            }
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return answerLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
