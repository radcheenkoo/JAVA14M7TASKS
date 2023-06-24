public class WordDeleter {
    public String remove(String phrase, String[] words){
        StringBuilder result = new StringBuilder();
        String[] phraseToArr = phrase.split(" ");
        for(String word: phraseToArr){
            if (!containsWord(words,word)){
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
    private boolean containsWord(String[] words, String targetWord) {
        for (String word : words) {
            if (word.equals(targetWord)) {
                return true;
            }
        }
        return false;
    }
}
class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}