
 //Leetcode Problem 1513

//  Given a binary string s, return the number of substrings with all characters 1's. Since the answer may be too large, return it modulo 109 + 7.

 

// Example 1:

// Input: s = "0110111"
// Output: 9
// Explanation: There are 9 substring in total with only 1's characters.
// "1" -> 5 times.
// "11" -> 3 times.
// "111" -> 1 time.
// Example 2:

// Input: s = "101"
// Output: 2
// Explanation: Substring "1" is shown 2 times in s.
// Example 3:

// Input: s = "111111"
// Output: 21
// Explanation: Each substring contains only 1's characters.

// pattren used: Counting Consecutive Characters

class NumberOfsubstrngWithAllCharacters1s {
    public static void main(String[] args) {
        String s = "0110111";
        System.out.println("Number of substrings with all characters 1's: " + countSubstringsWithAllOnes(s));
    }

    public static int countSubstringsWithAllOnes(String s) {
        long count = 0;
        long currentCount = 0;
        int MOD = 1000000007;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                currentCount++;
                count = (count + currentCount) % MOD;
            } else {
                currentCount = 0;
            }
        }
        return (int) count;
    }
}
 