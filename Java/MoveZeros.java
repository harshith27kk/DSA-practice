//283. Move Zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        // int temp = nums[0];
        for( int right = 0; right<nums.length; right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left]= temp;
                left++;
            }
        }
    }
}

public class MoveZeros {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,0,3,12};
        solution.moveZeroes(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}