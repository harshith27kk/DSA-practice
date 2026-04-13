import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static boolean containsDuplicates(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2};
        System.out.println("Contains duplicate: " + containsDuplicates(nums));
    }
}
