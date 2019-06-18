import java.util.Scanner;

public class Page_10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A, B;

        while(true){
            try{
                A = scanner.next();
                B = scanner.next();
                int NumberA = Integer.parseInt(A);
                int NumberB = Integer.parseInt(B);
                System.out.println(NumberA+NumberB);
                break;
            }catch (NumberFormatException ex){
        System.err.println("We have here NumberFormatException");
            }
        }
    }
}
