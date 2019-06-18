import java.util.InputMismatchException;
import java.util.Scanner;

public class Page_10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer A, B;

        while(true){
            try{
                A = scanner.nextInt();
                B = scanner.nextInt();
                System.out.println(A+B);

                break;
            }catch (InputMismatchException ex){
                System.err.println("We have here NumberFormatException");
                scanner.next();
            }
        }
    }
}