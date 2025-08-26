import java.util.HashMap;


class Solution {
    public int[] topKFrequent(int[] nums, int k) {

 HashMap<Integer,Integer> freq = new HashMap<>();

 for (int num: nums)
 {
    // check if the num key is already exist in map
    if (freq.containsKey(num))
    {
        // increament the count
        freq.put(num,freq.get(num)+1);
    }

        //create new key if not exists
    else
        freq.put(num,1);
 }

 List<Integer> keys = new ArrayList<>(freq.keySet());

 keys.sort((a,b) -> freq.get(b) - freq.get(a));

 int [] topKArr = new int[k];

 for (int  i =0 ; i < k;i++)
 {
    topKArr[i] = keys.get(i);
 }



 return topKArr;
        
    }
}
