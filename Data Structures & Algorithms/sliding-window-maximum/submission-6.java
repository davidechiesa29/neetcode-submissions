class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maximums = new int[nums.length-k+1];
        int maximumsIndex = 0;


        int leftIndex = 0;
        int rightIndex = leftIndex + k-1;
        PriorityQueue<Integer> currWindow = new PriorityQueue<>(Collections.reverseOrder());

        int maximum = -1;

        while (rightIndex < nums.length){
            if (leftIndex == 0){
                for (int i = leftIndex; i <= rightIndex; i++){
                    currWindow.add(nums[i]);
                }
            } else {
                currWindow.remove(nums[leftIndex-1]);
                currWindow.add(nums[rightIndex]);
            }
            maximum = currWindow.peek();
            maximums[maximumsIndex] = maximum;
            maximumsIndex++;
            rightIndex++;
            leftIndex++;
        }
        return maximums;

    }
}
