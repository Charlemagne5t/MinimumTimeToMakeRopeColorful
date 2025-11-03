class Solution {
    public int minCost(String colors, int[] neededTime) {
        char prev = colors.charAt(0);
        int res = neededTime[0];
        int curMax = neededTime[0];
        for(int i = 1; i < colors.length(); i++) {
            char ch = colors.charAt(i);
            res += neededTime[i];
            if(prev == ch) {
                curMax = Math.max(curMax, neededTime[i]);
            }else {
                res-= curMax;
                curMax = neededTime[i];
                prev = ch;
            }
        }
        res -= curMax;

        return res;
    }
}