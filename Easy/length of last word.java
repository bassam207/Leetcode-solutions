class Solution {
    public int lengthOfLastWord(String s) {

        int len =  s.length();
        int last_len =0;
        boolean wordStarted = false;
        for (int i = len-1 ; i>=0;i--)
        {
            char c = s.charAt(i);
            
            if (c != ' ')
            {
                last_len++;
                wordStarted = true;
                
            }

            else if (wordStarted)
            {
                break;
            }

        }
        return last_len;
        
    }
}
