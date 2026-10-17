class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> maximums = new ArrayList<>();
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
            maximums.add(maximum);

            rightIndex++;
            leftIndex++;
        }
        int[] maximumsArray = maximums.stream().mapToInt(i -> i).toArray();
        return maximumsArray;

    }
}
