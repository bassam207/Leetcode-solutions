/**
 * LeetCode Problem 1431: Kids With the Greatest Number of Candies
 * 
 * Given an array `candies` where candies[i] is the number of candies a kid has,
 * and an integer `extraCandies`, return a list of booleans where each element
 * indicates whether the i-th kid can have the greatest number of candies
 * if they are given all `extraCandies`.
 * 
 * Example:
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // -----------------------------
        // Step 1: Find the maximum candy count among all kids
        // -----------------------------
      
        int max = candies[0]; // assume first kid has the max initially

        for (int i = 1 ; i < candies.length;i++)
        {
            if(candies[i] > max)
            {
                max = candies[i]; // update max if we find a kid with more candies
            }
        }

        // -----------------------------
        // Step 2: Prepare a list to store results (true/false for each kid)
        // -----------------------------
        
        List<Boolean> maxs = new ArrayList(candies.length);

        // -----------------------------
        // Step 3: For each kid, check if giving them all extraCandies
        // would make their candies count >= current maximum
        // -----------------------------
        for (int i = 0 ; i < candies.length;i++)
        {
            if (candies[i] + extraCandies >= max)
            {
                maxs.add(true); // This kid can have the greatest number of candies
            }
            else
                 maxs.add(false); // This kid cannot reach the greatest number

        }

        // -----------------------------
        // Step 4: Return the final result list
        // -----------------------------

    return maxs;
        
    }
}
