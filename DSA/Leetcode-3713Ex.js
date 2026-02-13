class Leetcode3713Ex {
    longestBalanced(s) {
        let max = 0;
        for (let i = 0; i < s.length; i++) {
            const a = new Array(26).fill(0);
            for (let j = i; j < s.length; j++) {
                a[s.charCodeAt(j) - 'a'.charCodeAt(0)]++;
                if (this.find(a)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    find(a) {
        let c = 0;
        for (let i of a) {
            if (i > 0) {
                if (c === 0) {
                    c = i;
                } else if (i !== c) {
                    return false;
                }
            }
        }
        return true;
    }
}