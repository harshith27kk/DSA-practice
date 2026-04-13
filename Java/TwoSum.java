//brut force approch
// class TwoSum {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for(int i = 0; i< n; i++){
//             for (int j = i+1; j<n; j++){
//                 if(nums[j] == target - nums[i]) {
//                     // int[] number = {i,j};
//                     return new int[] {i,j};
//                 }
//             }
//         }
//         return new int[0];
//     }
// }

// optimal solution
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        
        for(int i = 0; i< nums.length; i++){
            int diff = target - nums[i];
            if(numbers.containsKey(diff)){
                return new int[] {numbers.get(diff),i};
            }
            numbers.put(nums[i],i);
        }
        return new int[]{};
    }
}
