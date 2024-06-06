import java.util.Scanner;

public class Main {

    public static int YourResult(int firstNumber, int secondNumber, String operator){
            int result = 0;
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
            
                default:
                    System.out.println("This is a wrong symbol");
                    break;
            }
            return result;
        }

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter your second number : ");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter your operator +-*/ : ");
        String operator = scanner.nextLine();
        System.out.printf("Your result is : %d\n", YourResult(firstNumber,secondNumber,operator));
        scanner.close();
    }
}