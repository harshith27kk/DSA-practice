// leetcode problem: https://leetcode.com/problems/reverse-words-in-a-string/
//151. Reverse Words in a String
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(' ');
        }
        return sb.toString().trim();
    }
}