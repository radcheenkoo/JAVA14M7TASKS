public class NameCounter {
    public int count(String text){
        int count = 0;
        String[] textArr = text.split(" ");
        for (String str: textArr){
            char[] charStr = str.toCharArray();
            if (isRightCase(str)){
                count++;
            }
        }
        return count;
    }
    private boolean isRightCase(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (Character.isUpperCase(str.charAt(0)) && !(Character.isUpperCase(str.charAt(i)))){
                return true;
            }
        }
        return false;
    }
}
class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}