import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {

if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        StringBuilder  res = new StringBuilder();


       String first = strs[0];
        String last = strs[strs.length-1];
        int minlength = Math.min(first.length(),last.length());
        for (int i = 0 ; i < minlength;i++)

        {
            if (first.charAt(i) != last.charAt(i))
            {
                break;
            }         
            res.append(first.charAt(i));   
        }

       

        return res.toString();
        
    }
}
