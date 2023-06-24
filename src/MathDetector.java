public class MathDetector {
    public boolean isMath(String text) {
        int amountNumber = 0;
        for (char character : text.toCharArray()) {
            if (Character.isDigit(character)) {
                amountNumber++;
            }
        }

        boolean hasOperator = false;
        for (char character : text.toCharArray()) {
            if (character == '=' || character == '+' || character == '-' || character == '*' || character == '/') {
                hasOperator = true;
                break;
            }
        }

        return hasOperator && amountNumber >= 2;
    }
}
class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}