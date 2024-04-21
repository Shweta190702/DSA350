class Solution {
    public int maxArea(int[] height) {
        int maxWater=0, currentWater=0;
        for(int i=0,j=height.length-1;i<j;){
            if(height[i]<height[j]){
                currentWater=(j-i)*height[i];
                i++;
            }else{
                currentWater=(j-i)*height[j];
                j--;
            }
            maxWater = Math.max(maxWater, currentWater);
        }
        return maxWater;
    }
}