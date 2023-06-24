public class BigOrSmall {
    public String calculate(String text) {
        int countLowercase = 0;
        int countUppercase = 0;

        for (char character : text.toCharArray()) {
            if (Character.isLowerCase(character)) {
                countLowercase++;
            } else if (Character.isUpperCase(character)) {
                countUppercase++;
            }
        }

        if (countLowercase > countUppercase) {
            return "Small";
        } else if (countUppercase > countLowercase) {
            return "Big";
        } else {
            return "Same";
        }
    }
}
class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}