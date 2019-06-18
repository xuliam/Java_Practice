import java.util.Scanner;

public class Page_12_1 {
    public static class InvalidAnimalException extends Exception{
        public InvalidAnimalException(String name){

        }
    }
    public static void checkAnimal(String animal) throws InvalidAnimalException{
        if(animal.equals("Tiger")){

        }else{
            throw new InvalidAnimalException("sd");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String initName = "Lion";
        String animal = initName;

        try {
            System.out.println("what's your favorite animal?");
            animal = input.next();
            checkAnimal(animal);
            System.out.println("Thank you");
        }
        catch(InvalidAnimalException ex){
            System.out.println("That's not animal!");
            animal = initName;
        }
        finally{
            System.out.println("The animal name is "+ animal);
        }
    }
}
