class Solution {
    public int maxSubArray(int[] nums) {
        
        if (nums.length == 0) return 0;

        int[] solution = new int[nums.length];
        solution[0] = nums[0];

        int max = solution[0];

        for (int i = 1; i < solution.length; i++){
            solution[i] = Math.max(solution[i-1] + nums[i], nums[i]);
            if (solution[i] > max) max = solution[i];
        }

        return max;
    }
}
