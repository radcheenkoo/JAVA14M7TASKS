public class WaterCounter {
    public double count(String text){
        double count = 0;
        for (Character character: text.toCharArray()){
            if (character.equals(' ')){
                count++;
            }
        }
        return (double) count / text.length();
    }
}
class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}