// SmallestElement.java
// Kameron Ibraheem
// Lab 04: Smallest Element
//
//

public class SmallestElement {

    // Method to find the minimum of two integers
    public static int findMinimum(int num1, int num2) {
        if (num1 < num2) {
            return num1; // Return num1 if it is less than num2
        } else {
            return num2; // Otherwise, return num2
        }
    }

    // Method to determine the order of two words
    public static int firstWord(String word1, String word2) {
        if (word1.equals(word2)) {
            return 3; // Both words are the same
        } else if (word1.compareTo(word2) < 0) {
            return 1; // word1 comes first
        } else {
            return 2; // word2 comes first
        }
    }

    public static void main(String[] args) {

        int min = findMinimum(25, 10);
        System.out.println("The minimum is:" + min);

        int first = firstWord("apple", "Apple");
        System.out.println("The first word is in the " + first + " spot");
    }
}
