//Write a Java program to move all lower-case letters to the front of a given word. This will keep the relative position of all the letters (both upper and lower case) same
public abstract class q4 {
    public static String moveLowerCaseToFront(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }

        char[] chars = word.toCharArray();
        int insertIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                // Swap lower-case letter to the front
                char temp = chars[i];
                for (int j = i; j > insertIndex; j--) {
                    chars[j] = chars[j - 1];
                }
                chars[insertIndex++] = temp;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String inputWord = "HelloWorld";
        String result = moveLowerCaseToFront(inputWord);
        System.out.println("Original Word: " + inputWord);
        System.out.println("Modified Word: " + result);
    } 
}
