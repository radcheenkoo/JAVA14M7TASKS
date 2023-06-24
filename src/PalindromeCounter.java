public class PalindromeCounter {
    public int count(String phrase) {
        int palindrome = 0;
        String[] phraseToArr = phrase.split(" ");
        for (String i : phraseToArr) {
            StringBuilder stringBuilder = new StringBuilder(i);
            if (i.equalsIgnoreCase(String.valueOf(stringBuilder.reverse()))) {
                palindrome++;
            }
        }
        return palindrome;
    }
}
class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}