class Solution {
    //time O(n) space O(n)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] leftProduct = new int[n];
        int [] rightProduct = new int[n];
        int [] ans = new int[n];
        int product=1;
        for(int i=0;i<n;i++){
            product = product *nums[i] ;
            leftProduct[i] = product;
        }
        product=1;
        for(int i=n-1;i>=0;i--){
            product = product * nums[i];
            rightProduct[i] = product;
        }
        ans[0]=rightProduct[1];
        ans[n-1]=leftProduct[n-2];
        for(int i=1;i<n-1;i++){
            ans[i]=leftProduct[i-1]*rightProduct[i+1];
        }
        return ans;
    }
    //time O(n) space O(1) excluding answer array
    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int product=1;
        for(int i=n-1;i>=0;i--){
            product = product * nums[i];
            ans[i] = product;
        }
        ans[0]=ans[1];
        int leftProduct=nums[0];
        for(int i=1;i<n-1;i++){
            ans[i]=leftProduct*ans[i+1];
            leftProduct=leftProduct*nums[i];
        }
        ans[n-1]=leftProduct;
        return ans;
    }
}
