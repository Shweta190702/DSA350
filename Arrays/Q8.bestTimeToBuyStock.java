class Solution {
    public int maxProfit(int[] prices) {
        // int min=prices[0];
        // int max= prices[0];
        // int answer=0;
        // for(int i=1;i<prices.length;i++){
        //     if(prices[i]>max){ // if any element if greater than max then that can be a good time to sale stock
        //         answer=Math.max((prices[i]-min),answer);
        //         max=prices[i];
        //     }
        //     if(prices[i]<min){ // if any element if less than min then that can be a good time to buy stock
        //         min=prices[i];
        //         max=prices[i];
        //     }
        // }
        // return answer;

        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                if(prices[i]-buy>profit){
                    profit=prices[i]-buy;
                }
            }
        }
        return profit;
    }
}
