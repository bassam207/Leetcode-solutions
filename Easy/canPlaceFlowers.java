/**
 * Problem: Can Place Flowers
 * -------------------------------------
 * You are given an integer array 'flowerbed' containing 0's and 1's,
 * where 0 means an empty plot and 1 means a plot with a flower.
 * You cannot plant flowers in adjacent plots.
 *
 * The goal is to determine if 'n' new flowers can be planted
 * without violating the no-adjacent-flowers rule.
 *
 * Example:
 *   Input: flowerbed = [1,0,0,0,1], n = 1
 *   Output: true  (you can plant one flower at index 2)
 *
 * Approach:
 *   - Loop through each plot.
 *   - Check if the current plot is empty (0).
 *   - Then check if the left and right plots are empty or out of bounds.
 *   - If both sides are empty, plant a flower and decrement 'n'.
 *   - If we plant all required flowers, return true.
 *   - Otherwise, return false after the loop.
 */
class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        // Iterate through every plot in the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {

            // Check if the current plot is empty (0 means empty, 1 means already planted)
            if (flowerbed[i] == 0) {

                /**
                 * Check if the left side is empty or out of bounds:
                 * - If 'i == 0', that means we are at the first plot, so it's safe.
                 * - Otherwise, we check that the plot to the left (i - 1) is empty.
                 */
                boolean isLeftEmpty = (i == 0) || (flowerbed[i - 1] == 0);

                /**
                 * Check if the right side is empty or out of bounds:
                 * - If 'i == flowerbed.length - 1', we are at the last plot, so it's safe.
                 * - Otherwise, check that the plot to the right (i + 1) is empty.
                 */
                boolean isRightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // If both left and right sides are empty, we can plant a flower here
                if (isLeftEmpty && isRightEmpty) {
                    flowerbed[i] = 1;  // Plant the flower
                    n--;               // One less flower to plant

                    // If we've planted all required flowers, return true immediately
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        // After checking all plots, return true only if no flowers remain to be planted
        return n <= 0;
    }
}
