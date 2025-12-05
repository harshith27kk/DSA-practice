public class StringCompressionStringBuilder {
    public int compress(char[] chars) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                compressed.append(chars[i - 1]);
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        
        // Copy the compressed string back to the original array
        for (int i = 0; i < compressed.length(); i++) {
            chars[i] = compressed.charAt(i);
        }
        
        return compressed.length();
    }
    public static void main(String[] args) {
        StringCompressionStringBuilder solution = new StringCompressionStringBuilder();
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
// Approach: StringBuilder
// 1.Initialize a StringBuilder to build the compressed string.
// 2.Iterate through the character array, counting consecutive identical characters.
// 3.When a different character is encountered or the end of the array is reached, append the character and its count (if greater than 1) to the StringBuilder.
// 4.Copy the compressed string back to the original array.
// 5.Return the length of the compressed string.