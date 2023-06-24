public class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        float frequency = 0f;
        String[] phraseToArr = phrase.split(" ");
        int totalWords = phraseToArr.length;
        int wordCount = 0;

        for (String str : phraseToArr) {
            if (str.equalsIgnoreCase(word)) {
                wordCount++;
            }
        }

        if (totalWords > 0) {
            frequency = (float) wordCount / totalWords;
        }

        return frequency;
    }
}
class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}