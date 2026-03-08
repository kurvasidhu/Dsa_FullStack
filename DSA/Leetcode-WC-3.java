class Solution {
    public int minOperations(String s) {
        boolean f = true;
        for (int i = 1; i < s.length(); i++) {
            f &= s.charAt(i) >= s.charAt(i - 1);
        }
        if (f) {
            return 0;
        } else if (s.length() == 2) {
            return -1;
        }
        char min = s.charAt(0), max = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            min = (char) Math.min(min, s.charAt(i));
            max = (char) Math.max(max, s.charAt(i));
        }
        if (min == s.charAt(0) || max == s.charAt(s.length() - 1)) {
            return 1;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == min || s.charAt(i) == max) {
                return 2;
            }
        }
        return 3;
    }
    private boolean find(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) return false;
        }
        return true;
    }
}