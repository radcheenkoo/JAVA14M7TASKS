public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){
        sourceWord = sourceWord.toLowerCase();
        targetWord = targetWord.toLowerCase();
        for (Character character1: sourceWord.toCharArray()){
            for(Character character2: targetWord.toCharArray()){
                if (character1.equals(character2)){
                    return true;
                }
            }
        }
        return false;
    }
}
class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}