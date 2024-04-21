class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0], min=nums[0], maxProduct=nums[0];
        for(int i=1;i<nums.length;i++){
            int tempMin=min;
            // we have to maintain min and max value beacuse 
            //in multiply min value (e.g. -10) can be generate maximum multiply by multiplying with negative number.
            min=Math.min(min*nums[i],Math.min(nums[i],max*nums[i]));
            max=Math.max(max*nums[i],Math.max(nums[i],tempMin*nums[i]));
            maxProduct=Math.max(maxProduct,max);
        }
        return maxProduct;
    }
}