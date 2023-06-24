public class EmailDetector {
    public boolean isPresent(String text){
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == '@' && chars[i - 2] != ' ' && chars[i - 1] != ' ' &&
                    chars[i + 1] != ' ' && chars[i + 2] != ' '){
                return true;
            }
        }
        return false;
    }
}
class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}