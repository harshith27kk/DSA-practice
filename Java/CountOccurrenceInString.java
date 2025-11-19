class countOccurrenceOfAllCharactersInString {
    public static void main(String[] args) {
        String str = "aaabbccy";
        int[] count = new int[256]; // ASCII character set size

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }
}

class countOccurrenceOfAllCharactersInStringWithoutSpaces {
    public static void main(String[] args) {
        String str = "hello world";
        int[] count = new int[256]; // ASCII character set size

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { // Ignore spaces
                count[ch]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }
}

class countOccurrenceOfGivenCharacterInString {
    public static void main(String[] args) {
        String str = "hello world";
        char targetChar = 'o';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }

        System.out.println("The character '" + targetChar + "' occurs " + count + " times in the string.");
    }
}   



class countTheoccurenceOfString {
	public static void main(String[] args) {
	String name = "harshith";
	char target = 'h';
	int count = 0;
	
for(int i=0; i<name.length();i++){
	if(name.charAt(i) == target){
	count++;
	}
}
System.out.println(count);
}
}