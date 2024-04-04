class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0 ;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
                result = prices[i] - min;
                if(result >= max){
                    max = result;
                }
            }else{
                result = prices[i] - min;
                if(result >= max){
                    max = result;
                }
            } 
        }
        return max;

    }
}
