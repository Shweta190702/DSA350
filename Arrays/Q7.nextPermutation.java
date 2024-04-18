class Solution {
    public void nextPermutation(int[] nums) {
        int swapIndex = -1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                swapIndex = i;
            }
        } 
        if(swapIndex==-1){
            Arrays.sort(nums);
            return;
        }

        int minIndex = swapIndex+1;
        for(int i=swapIndex+1;i<nums.length;i++){
            if(nums[i]>nums[swapIndex]&&nums[i]<nums[minIndex]){
                minIndex=i;
            }
        }
        int temp = nums[minIndex];
        nums[minIndex] = nums[swapIndex];
        nums[swapIndex] = temp;
        Arrays.sort(nums, swapIndex+1, nums.length);
    }
}