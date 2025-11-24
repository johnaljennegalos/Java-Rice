package exception.handling;

import java.util.Scanner;

public class basicCalculator {
    Scanner sc = new Scanner(System.in);

    public void calculate(){
        try{
            System.out.print("Enter First Number: ");
            int firstNumber = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int secondNumber = sc.nextInt();

            System.out.print("Enter Operator [+, -, /, *]: ");
            String operator = sc.next();

            double result;

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;

                case  "-":
                    result = firstNumber - secondNumber;
                    break;

                case  "/":
                    if(secondNumber == 0){
                        throw new DivisionByZeroException("Division by zero is not allowed");
                    }

                    result =  firstNumber / secondNumber;
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    break;

                default:
                    throw new InvalidOperatorException("Invalid operator!");

            }

            System.out.println("Result: " + result);
        } catch (InvalidOperatorException e) {
            System.out.println("Calculation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
