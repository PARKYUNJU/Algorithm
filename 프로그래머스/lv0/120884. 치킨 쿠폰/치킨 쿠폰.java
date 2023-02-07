class Solution {
    public int solution(int chicken) {
        int coupon=chicken; 
        int service=0;
        while(coupon>=10)
        {
            int leftcoupon=coupon%10;
            service+=coupon/10;
            coupon=(coupon/10)+leftcoupon;
        }
            
        
        return service;
            

    }
}