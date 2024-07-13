package com.company;
import java.util.Scanner ;


public class java_05_user_input {
    public static void main(String[] args) {
        System.out.println("Taking input form  user ");
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter first number ");
        int a = sc.nextInt();
        System.out.println("enter secound number ");
        int b = sc.nextInt();
        int sum = a+b ;
        int product = a*b ;
        int divide = a/b;
        System.out.println("the sum of "+ a + " and " +b+ " is "+ sum);
        System.out.println("the multiplication of "+ a +" and "+b+" is "+ product);
        System.out.println("the division  of "+ a +" and "+b+" is "+ divide);


    }
}
