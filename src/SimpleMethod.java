import java.sql.SQLOutput;

public class SimpleMethod {
    public static int[] buildArray(int length){
        int [] arr = new int[length];
        return arr;
    }

    public static void printMessage(String... messages){
        if(messages.length == 0){
            System.out.println("NO MESSAGE");
            return;
        }
        for (int i = 0; i < messages.length; i++) {
            System.out.println(messages[i]);
        }
    }

    public static void printMessage(String[]messages, int i){
        System.out.println(messages[i]+"\t");
    }

    public static int calculate(int i){
        return 10-i;
    }

    public static int calculate(int i, int j){
        return i+j;
    }

    public static void main(String[] args) {
        int [] myarry = buildArray(10);
        //System

        SimpleMethod.printMessage();
        SimpleMethod.printMessage("Bad Man");
        SimpleMethod.printMessage("Batman","Superman","Spiderman");
        SimpleMethod.printMessage(new String[]{"This is array message"});

        int x =SimpleMethod.calculate(200);
        System.out.println(x);
        int y = SimpleMethod.calculate(10,12);
        System.out.println(y);
    }

}
