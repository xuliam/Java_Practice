public class Page_3_1 {
    public static void main(String[] args) {
        int A =1;
        int B = 0;

        try{
            int result =A/B;
            System.out.println(result);
        } catch(ArithmeticException ex){
            System.out.println("Exception: an integer cannot be divided by zeroR");
        }

    }
}
