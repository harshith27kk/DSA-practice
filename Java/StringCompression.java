package Java;

public class StringCompression {
    public int compress(char[] chars) {
        int write = 0, left = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read] != chars[read + 1]) {
                chars[write++] = chars[read];
                if (read > left) {
                    String count = Integer.toString(read - left + 1);
                    for (char c : count.toCharArray()) {
                        chars[write++] = c;
                    }
                }
                left = read + 1;
            }
        }
        System.out.println(write);
        return write;
    }

    public static void main(String[] args) {
        StringCompression solution = new StringCompression();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = solution.compress(chars);
        System.out.println("Compressed length: " + newLength);
        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
    
}

// leetcode problem: https://leetcode.com/problems/string-compression/
// 443. String Compression
// Approach: Two Pointers
// 1.Initialize two pointers, read and write, both starting at the beginning of the array.
// 2.Iterate through the array using the read pointer to identify groups of consecutive identical characters.
// 3.When a group is identified, write the character to the write pointer.
// 4.If the group has more than one character, convert the count to a string and write each digit to the array using the write pointer.
// 5.Update the left pointer to the position after the current group and continue until the end of the array is reached.
// 6.Return the position of the write pointer as the new length of the compressed array.    

// Time Complexity: O(n), where n is the length of the input array. Each character is processed at most twice (once by the read pointer and once by the write pointer).
// Space Complexity: O(1), since the compression is done in place and no additional data structures are used that scale with input size.
