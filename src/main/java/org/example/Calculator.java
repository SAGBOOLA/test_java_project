package org.example;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean endCalc = false;
        while (!endCalc) {
            System.out.print("Enter Number of Numbers to be Calculated: ");
            int n = input.nextInt();
            int i, result = 0;
            int[] arr = new int[n];   //Creating N-size Array
            for (i = 0; i < n; i++)   //Entering N numbers in array
            {
                System.out.print("Enter: ");
                arr[i] = input.nextInt();
            }
            CalcOperators calcOperators = new CalcOperators();
            String operator;
            System.out.println("Choose the operator +,-,*,/");
            operator = input.next();
            switch (operator) {
                case "+":
                    result = calcOperators.add(arr);
                    for (i = 0; i < arr.length; i++) {
                        if (i < arr.length - 1) {
                            System.out.print(arr[i] + " + ");
                        } else {
                            System.out.print(arr[i] + " = ");
                        }

                    }
                    break;
                case "-":
                    result = calcOperators.subtract(arr);
                    for (i = 0; i < arr.length; i++) {
                        if (i < arr.length - 1) {
                            System.out.print(arr[i] + " - ");
                        } else {
                            System.out.print(arr[i] + " = ");
                        }

                    }
                    break;
                case "*":
                    result = calcOperators.multiply(arr);
                    for (i = 0; i < arr.length; i++) {
                        if (i < arr.length - 1) {
                            System.out.print(arr[i] + " * ");
                        } else {
                            System.out.print(arr[i] + " = ");
                        }

                    }
                    break;
                case "/":
                    try {
                        result = calcOperators.divide(arr);
                        for (i = 0; i < arr.length; i++) {
                            if (i < arr.length - 1) {
                                System.out.print(arr[i] + " / ");
                            } else {
                                System.out.print(arr[i] + " = ");
                            }

                        }
                    } catch (ArithmeticException e) {
                        System.out.println("Value of second number was zero, Enter a non-zero number");
                    }
                    break;
                case "exit":
                    endCalc = true;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid Operator");

            }
            System.out.println(result);
        }

    }
}