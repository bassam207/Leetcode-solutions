class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // first , you will drink all full bottles so the empty and max equales the num of bottles
        int empty = numBottles, max = numBottles;

      // as long as we have enough num of empty bottles we could get full bottles to drink and update num of max;
        while( empty >= numExchange)
        {
            int newBottles = empty /  numExchange;
           
            max += newBottles ;

          // empty bottles include the new ones we drink beside old ones that we could not exchange
            empty = newBottles + (empty %  numExchange);

        }
        return max;
    }
}
