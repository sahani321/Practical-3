import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int factorial = 1;
        
        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        
        scanner.close();
    }
}
