class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int size = cost.length;
        int[] sol = new int[size];
        sol[size-1] = cost[size-1];
        sol[size-2] = cost[size-2];
        for (int i = size - 3; i >= 0; i--){
            sol[i] = cost[i] + Math.min(sol[i+1], sol[i+2]);
        }
        return Math.min(sol[0], sol[1]);


    }
}
