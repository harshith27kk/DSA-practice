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
        int[] nums = {0,1,0};
        int result = solution.findMaxLength(nums);
        System.out.println("Length of the longest contiguous array with equal number of 0s and 1s: " + result);
    }
    
}
