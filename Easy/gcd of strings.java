class Solution {
    public String gcdOfStrings(String str1, String str2) {
        

      // checking if there is a common pattern between strings

          if (!(str1 + str2).equals(str2 + str1))  return "";

      // finding length of common pattern 
            int len =  gcd(str1.length(),str2.length());

            return str1.substring(0,len);
        
    }


  // Euclidean Algorithm for finding greater common divisor

    public int gcd(int  a, int b)
    {

        return  b ==0?a: gcd(b,a%b);
    }
}
