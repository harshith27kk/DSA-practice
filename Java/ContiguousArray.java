import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count = nums[i] == 0 ? count - 1 : count + 1;
            //couunt += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        ContiguousArray solution = new ContiguousArray();
        int[] nums = {0,1,0,1,1};
        int result = solution.findMaxLength(nums);
        System.out.println("Length of the longest contiguous array with equal number of 0s and 1s: " + result);
    }
    
}

//leetcode problem: https://leetcode.com/problems/contiguous-array/
//525. Contiguous Array
//Approach: HashMap and Prefix Sum
//1.Initialize a HashMap to store the count and its first occurrence index.
//2.Initialize count to 0 and maxLength to 0.
//3.Iterate through the array, updating the count: increment for 1 and decrement for 0.
//4.If the count has been seen before, calculate the length of the subarray and update maxLength if it's larger.
//5.If the count is new, store its index in the map.
//6.Return maxLength as the result. 
//Time Complexity: O(n), where n is the length of the input array. We traverse the array once.
//Space Complexity: O(n) in the worst case, where n is the number of elements in the input array. The HashMap can store up to n different counts.