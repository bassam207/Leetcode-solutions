class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int po1 =0;
        int po2 = s.length()-1;
        while (po1 < po2)
            {
                if (s.charAt(po1) == s.charAt(po2))
                { po1++;
                    po2--;}

        else
                    return false;
            }
       return true;
    }
}