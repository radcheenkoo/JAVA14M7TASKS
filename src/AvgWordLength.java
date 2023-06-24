public class AvgWordLength {
    public double count(String phrase){

        int totalLength = 0;

        String[] phraseToArr = phrase.split(" ");

        for (String word: phraseToArr){
            totalLength += word.length();
        }
        return (double) totalLength / phraseToArr.length;
    }
}
class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}