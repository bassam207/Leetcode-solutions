class Solution {
    public boolean isAnagram(String s, String t) {

        char [] charsofs = s.toCharArray();
        Arrays.sort(charsofs);
        String sS = new String(charsofs);

        char [] charsoft = t.toCharArray();
        Arrays.sort(charsoft);
        String sT = new String(charsoft);

        if (sS.equals(sT))
            return true;
        else
            return false;

        
    }
}
