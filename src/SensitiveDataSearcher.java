public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase){
        String newPhrase = phrase.toLowerCase();
        return newPhrase.contains("pass") || newPhrase.contains("key")
                || newPhrase.contains("login") || newPhrase.contains("email");
    }
}
class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}