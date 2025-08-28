import java.util.*;
class Solution {
    public boolean isValid(String s) {
        
        Map<Character, Character> map = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
        {
            if (!map.containsKey(c))
            {
                stack.push(c);
            }

            else
            {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (top != map.get(c)) return false;
            }
        }

        return stack.isEmpty();
    }
}
