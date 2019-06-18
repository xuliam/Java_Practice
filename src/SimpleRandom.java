import java.util.Random;

public class SimpleRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int randInt = rand.nextInt();
        System.out.println("randInt:"+ randInt);

        double randDouble = rand.nextDouble()*100;
        System.out.println("randDouble:"+ randDouble);

        double doubleVal = Math.random();
        System.out.println(doubleVal);

        int numa= 96;
        int numb= 65;
        int temp;

        temp = numa;
        numa = numb;
        numb = temp;
        System.out.println(numa +"   " +numb);
    }
}
