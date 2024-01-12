import java.util.*;

class Six{
   public static void main(String arg[]){
   
  Scanner scanner = new Scanner(System.in);
   System.out.print("Enter a character: ");

        char inputChar = scanner.next().charAt(0);

        int value = (int) inputChar;
        System.out.println("ASCII value of '" + inputChar + "' is: " +value);

   
}}