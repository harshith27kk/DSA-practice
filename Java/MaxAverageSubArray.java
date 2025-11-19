public class MaxAverageSubArray {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int windowSum = 0;

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Slide the window from start to end of the array
        for (int i = k; i < n; i++) {
            // windowSum += nums[i] - nums[i - k]; // Add next element and remove the first element of the previous window
            windowSum = windowSum + nums[i];
            windowSum = windowSum - nums[i - k];
            maxSum = Math.max(maxSum, windowSum); // Update maxSum if current windowSum is greater
        }

        return (double) maxSum / k; // Return the maximum average
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        findMaxAverage(nums, k);
        System.out.println("Maximum average of subarrays of size " + k);
    }
}
