package org.example;

import java.util.Scanner;

public class SimpleCa {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        boolean stopCalc = false;
        while (!stopCalc){
            System.out.println("Enter the first number:");
            int n1 = scanner.nextInt();
            System.out.println("Enter the second number:");
            int n2 = scanner.nextInt();
            double result;
            String operator;
            System.out.println("Choose the operator +,-,*,/:");
            operator = scanner.next();
            switch (operator){
                case "+":
                    result = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " + result);
                    break;
                case "-":
                    result = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + result);
                    break;
                case "*":
                    result = n1 * n2;
                    System.out.println(n1 + " * " + n2 + " = " + result);
                    break;
                case "/":
                    try {
                        result = n1 / n2;
                        System.out.println(n1 + " / " + n2 + " = " + result);
                    }
                    catch (ArithmeticException e){
                        System.out.println("Value of second number was zero, Enter a non-zero number");
                        n2 = scanner.nextInt();
                        result = n1 / n2;
                        System.out.println(n1 + " / " + n2 + " = " + result);
                    }
                    break;
                case "exit":
                    stopCalc = true;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid Operator!");

            }


        }
    }
}
