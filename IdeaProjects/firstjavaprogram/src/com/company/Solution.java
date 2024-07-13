package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {



    public static void fizzBuzz(int n) {

        for(int i=3;i<n;i++){

            if (i/3==0 && i/5!=0){
                System.out.println("Fizz");

            }
            if(i/3!=0 && i/5==0){
                System.out.println("Buzz");

            }
            if(i/3==0 && i/5==0){
                System.out.println("FizzBuzz");
            }

            else {
                System.out.println(i);
            }

        }


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the number ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("1");
        System.out.println("2");
        Result.fizzBuzz(a);

    }
}
