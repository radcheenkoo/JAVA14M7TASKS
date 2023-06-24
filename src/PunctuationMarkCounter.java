public class PunctuationMarkCounter {
    public int count(String phrase) {
        char[] chars = new char[]{'.', ',', '!', ':', ';'};
        char[] chars1 = phrase.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                if (chars1[j] == chars[i]) {
                    count++;
                }

            }
        }
        return count;
    }
}
class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}