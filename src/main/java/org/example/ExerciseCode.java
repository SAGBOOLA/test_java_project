package org.example;

import java.util.Scanner;

public class ExerciseCode {
    public static void main(String[]args){
        /*
        //For printing name
        System.out.println("Hello");
        System.out.println("Oluwaseun!");


        //Leap year code with statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of choice:");
        int year = scanner.nextInt();
        if(year % 4 == 0){
            System.out.println("This is a Leap Year");
        }else {
            System.out.println("This is not a Leap Year");
        }


        //Leap year code with iteration
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter year of choice:");
            int year = scanner.nextInt();
            if(year % 4 == 0){
                System.out.println("This is a Leap Year");
            }else{
                System.out.println("This is not a Leap year");
            }
        }

        // arithmetic operation with given number
        int a1 = 45;
        int a2 = 11;
        int a3 = 12;
        int a4 = 4;
        int a5 = 24;
        int a6 = 6;
        int a7 = 55;
        int a8 = 12;
        System.out.println(a1 + " + " + a2 + " = " + (a1+a2));
        System.out.println(a3 + " * " + a4 + " = " + (a3*a4));
        System.out.println(a5 + " / " + a6 + " = " + (a5/a6));
        System.out.println(a7 + " - " + a8 + " = " + (a7-a8));


        //Average of 3 numbers
        int num1 = 23;
        int num2 = 11;
        int num3 = 77;
        int sum = 0;
        int avg = 0;
        sum = (num1 + num2 + num3)/3;
        //avg = sum/3;
        System.out.println("(" + num1 + " + " + num2 + " + " + num3 + " + " + ")" + " / " + " 3 " + " = " + sum);


        //Average of any given number
        Scanner sc = new Scanner(System.in);
        int a, count = 1;
        int y, average, avg = 0;
        System.out.println("Enter the number of numbers you would like to find the average of:");
        a = sc.nextInt();
        while (count<=a){
            System.out.println("Enter the "+ count +" number?");
            y = sc.nextInt();
            avg += y;
            ++count;
        }
        average = avg/a;
        System.out.println("The Average is:"+ avg + " / " + a + " = " + average);



        //Name Printing code
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name:");
        String myName = scanner.nextLine();
        System.out.println("Hello" + " " + myName);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = scanner.nextInt();
        System.out.println("Enter the second number:");
        double b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));

         */

        //Conversion of seconds to hours, minutes and seconds
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;
        System.out.print( H + ":" + M + ":" + S);
        System.out.print("\n");



    }
}
