// give me the solution for the following problem in Java
// and also give the time and space complexity of the solution
// And give me the explanation of how the code works in comments and what pattren it is using


//Given a string s, find the length of the longest substring without duplicate characters.
/*Input - "abcabcbb"  
Output - 3
The answer is "abc", with the length of 3.  

Input - "bbbbb"  
Output - 1
The answer is "b", with the length of 1.

Input - "pwwkew"
Output - 3
The answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not
a substring. 
*/

/*Algorithm Steps:
1. Initialize a HashSet to store unique characters in the current substring.
2. Initialize two pointers, left and right, both set to the start of the string.
3. Initialize a variable maxLength to keep track of the maximum length found.
4. Iterate with the right pointer through the string:
   a. While the character at the right pointer is already in the HashSet, remove the character at the left pointer from the HashSet and increment the left pointer.
   b. Add the character at the right pointer to the HashSet.
   c. Update maxLength with the maximum value between maxLength and the current window size (right - left + 1).
5. Return maxLength as the result.
*/  

//Sliding Window Pattern
import java.util.HashSet;   

public class LengthOfLongestSubstring {
     public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // If the character is already in the set, remove characters from the left
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            charSet.add(s.charAt(right));
            // Update maxLength if we found a longer substring
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcababb";
        System.out.println("Length of longest substring without duplicate characters: " + lengthOfLongestSubstring(s));
    }

   
}
