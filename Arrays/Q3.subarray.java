package Arrays;
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxsum=nums[0];
        int end = 0,start=0;
        for(int i=1;i<nums.length;i++){
            if(sum>=0){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            if(sum>maxsum){
                maxsum=sum;
                end=i;
            }
            // sum=Math.max(sum+nums[i],nums[i]);
            // maxsum=Math.max(sum,maxsum);
        }
        int cummulativeSum=0;
        for(int i=end;i>=0;i--){
            cummulativeSum+=a[i];
            if(cummulativeSum==maxSum){
                start=i;
                break;
            }
        }
        for(int i=start;i<=end;i++){
            System.out.println(a[i]);
        }
        return maxsum;
    }
}