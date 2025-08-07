class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length, insert  =0;

      // push non zeros nums to forward
        for(int num: nums)
        {
            if (num != 0)
            {
                nums[insert++] = num;
            }
        }

      //fill the rest of array with zeros
        while(insert < n)
        {
            nums[insert++] = 0;
        }
    }
}
