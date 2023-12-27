public class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] col = colors.toCharArray();
        int cost = 0;

        for (int i = 1; i < col.length; i++){
            if(col[i - 1] == col[i]){
                if(col[i] == col[i - 1])
                    cost += Math.min( neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
                col[i - 1] = '*';
            }
        }

        return cost;
    }
}
