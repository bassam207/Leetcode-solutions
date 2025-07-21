class Solution {
    public void reverseString(char[] s) {
        
        int po1 = 0;
        int po2 = s.length-1;
        while(po1<po2)
        {
            char temp = s[po1];
            s[po1] = s[po2];
            s[po2] = temp;
            
            
                po1++;
                po2--;
            
        }
    }
}
