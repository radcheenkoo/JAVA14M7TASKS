public class DoubleSpaceCleaner {
    public String clean(String phrase){
        String newPhrase = phrase.replaceAll("\\s+"," ").trim();
        return newPhrase;
    }
}
class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}