public class PalindromeCheckerApp {

    public static boolean isPalindrome(String text) {
        text = text.toLowerCase();

        if (text.length() <= 1) return true;

        if (text.charAt(0) != text.charAt(text.length() - 1)) return false;

        return isPalindrome(text.substring(1, text.length() - 1));
    }

    public static void main(String[] args) {
        String word = "Racecar";
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}