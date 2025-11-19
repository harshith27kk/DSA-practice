class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        return (s + s).contains(goal);
    }
    public static void main (String args[]){
        RotateString obj = new RotateString();
        String s = "abcde";
        String goal = "bcdea";
        System.out.println("Is the goal string a rotation of the original string? " + obj.rotateString(s, goal));
    }
}

// class Solution1 {   
//     public boolean rotateString(String s, String goal) {
//         if (s.length() != goal.length()){
//             return false;
//         }
//         String ans = s + s;
//         if(ans.contains(goal)){
//             return true;
//         } else {
//             return false;
//         }
//     }
// }
