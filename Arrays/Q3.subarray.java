package Arrays;
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            // if(sum>=0){
            //     sum+=nums[i];
            // }
            // else{
            //     sum=nums[i];
            // }
            // if(sum>maxsum){
            //     maxsum=sum;
            // }
            sum=Math.max(sum+nums[i],nums[i]);
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}