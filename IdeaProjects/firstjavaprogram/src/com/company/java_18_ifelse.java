package com.company;
import java.util.Scanner ;


public class java_18_ifelse {
    public static void main(String[] args) {
        System.out.println("enter your age ");

        Scanner sc = new Scanner(System.in);
        int age ;
        age = sc.nextInt();

        if (age > 18){
            System.out.println("you have a pan card ");
        }
        else if (age == 18 ){
            System.out.println("you can applied to pan card ");
        }
        else if (age > 100){
            System.out.println("you are not human ");
        }
        else {
            System.out.println("you cant applied for pan card");
        }
    }
}
