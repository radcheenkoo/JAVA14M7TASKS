public class UniqueCharCounter {
    public int count(String phrase) {
        boolean[] charExists = new boolean[128];
        int count = 0;

        for (char c : phrase.toCharArray()) {
            if (isValidChar(c) && !charExists[c]) {
                charExists[c] = true;
                count++;
            }
        }

        return count;
    }

    private boolean isValidChar(char c) {
        return (c >= '0' && c <= '9') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= 'a' && c <= 'z') ||
                c == ' ';
    }
}
class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
