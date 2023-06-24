import java.util.Arrays;

public class WordSplitter {
    public String[] split(String phrase){
        String lowerCasePhrase = phrase.toLowerCase();
        return lowerCasePhrase.split("\\s+");
    }
}
class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}