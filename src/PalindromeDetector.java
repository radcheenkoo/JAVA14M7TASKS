public class PalindromeDetector {
    public boolean isPalindrome(String word) {

        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        return String.valueOf(stringBuilder.reverse());
    }
}
class PalindromeDetectorTest {
    public static void main(String[] args) {
        //false
        System.out.println(new PalindromeDetector().isPalindrome("Java"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));
    }
}