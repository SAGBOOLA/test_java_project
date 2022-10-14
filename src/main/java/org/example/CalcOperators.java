package org.example;

public class CalcOperators {
    public int add(int [] numbers){
        int sum = numbers[0];
        for (int i=1;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;


    }
    public int subtract(int [] numbers){
        int sub = numbers[0];
        for (int i=1;i<numbers.length;i++){
            sub-=numbers[i];
        }
        return sub;
    }
    public int multiply(int [] numbers){
        int mul = numbers[0];
        for(int i=1;i<numbers.length;i++){
            mul*=numbers[i];
        }
        return mul;
    }
    public int divide(int [] numbers){
        int div = numbers[0];
        for(int i=1;i<numbers.length;i++){
            div/=numbers[i];
        }
        return div;
    }
}
