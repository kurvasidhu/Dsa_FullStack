class Leetcode3713Ex {
    public int longestBalanced(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] a = new int[26];
            for (int j = i; j < s.length(); j++) {
                a[s.charAt(j) - 'a']++;
                if (find(a)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    private boolean find(int[] a) {
        int c = 0;
        for (int i : a) {
            if (i > 0) {
                if (c == 0) {
                    c = i;
                } else if (i != c) {
                    return false;
                }
            }
        }
        return true;
    }
}