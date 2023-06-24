import java.util.Arrays;

public class DigitExtracter {
    public int[] extract(String text) {
        int countNumbers = 0;
        for (char character : text.toCharArray()) {
            if (Character.isDigit(character)) {
                countNumbers++;
            }
        }

        int[] numbers = new int[countNumbers];
        int index = 0;

        for (char character : text.toCharArray()) {
            if (Character.isDigit(character)) {
                numbers[index] = Character.getNumericValue(character);
                index++;
            }
        }

        return numbers;
    }
}
class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}