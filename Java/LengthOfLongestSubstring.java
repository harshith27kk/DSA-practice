/*
Find the length of the longest contiguous subarray of alternating odd and positive,even and negative numbers in an array.  
The result must always start with odd-positive  

Test Cases  

Input - [2,3,-4,7,-8,6]  
Output - 4 
The corresponding array is [3,-4,7,-8]  

Input - [2,3,-4,7,-8,5]  
Output - 5 
The corresponding array is [3,-4,7,-8,5]  

Input - [3,-4,7,-8,6]  
Output - 4 
The corresponding array is [3,-4,7,-8] 
*/

// //Input - [2,3,-4,7,-8,6]  
// Here the longest alternating subarray starting with odd-positive is [3,-4,7,-8], which has a length of 4.
// hwo it will work
// //Output - 4
// algorithm steps
// 1.Initialize two variables maxLength and currentLength to 0. Also, initialize a boolean variable expectOddPositive to true, indicating that we expect the next number to be odd and positive.
// 2.Iterate through each number in the array:
//    a. If expectOddPositive is true and the current number is odd and positive, increment currentLength and set expectOddPositive to false (indicating that the next number should be even and negative).
//    b. If expectOddPositive is false and the current number is even and negative, increment currentLength and set expectOddPositive to true (indicating that the next number should be odd and positive).
//    c. If the current number does not match the expected pattern, reset currentLength to 0. If the current number is odd and positive, set currentLength to 1 and expectOddPositive to false; otherwise, reset expectOddPositive to true.
// 3.After processing each number, update maxLength to be the maximum of maxLength and currentLength.
// 4.Return maxLength as the result.


public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        int[] arr = {2,3,-4,7,-8,5};
        System.out.println("Length of longest alternating subarray: " + longestAlternatingSubarray(arr));
    }

    public static int longestAlternatingSubarray(int[] arr) {
        int maxLength = 0;
        int currentLength = 0;
        boolean expectOddPositive = true; // Start with odd-positive

        for (int num : arr) {
            if (expectOddPositive && num > 0 && num % 2 != 0) {
                currentLength++;
                expectOddPositive = false; // Next should be even-negative
            } else if (!expectOddPositive && num < 0 && num % 2 == 0) {
                currentLength++;
                expectOddPositive = true; // Next should be odd-positive
            } else {
                // Reset if the pattern breaks
                if (num > 0 && num % 2 != 0) {
                    currentLength = 1; // Start new count
                    expectOddPositive = false; // Next should be even-negative
                } else {
                    currentLength = 0; // Reset count
                    expectOddPositive = true; // Reset to expect odd-positive
                }
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}

//time complexity of the LengthOfLongestSubstring is O(n)
//space complexity of the LengthOfLongestSubstring is O(1)
 //time complexity means how the runtime of an algorithm increases as the size of the input increases.
 //space complexity means how the memory consumption of an algorithm increases as the size of the input increases
 