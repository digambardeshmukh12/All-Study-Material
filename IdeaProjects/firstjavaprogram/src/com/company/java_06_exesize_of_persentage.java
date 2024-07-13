package com.company;

import java.util.Scanner ;

public class java_06_exesize_of_persentage {
    public static void main(String[] args) {
        System.out.println("counting persentage ");
        Scanner sc = new Scanner(System.in);



        System.out.println("enter the markss of sub one ");
        int sub1= sc.nextInt();
        System.out.println("enter the markss of sub two ");
        int sub2= sc.nextInt();
        System.out.println("enter the markss of sub three ");
        int sub3= sc.nextInt();
        System.out.println("enter the markss of sub four ");
        int sub4= sc.nextInt();
        System.out.println("enter the markss of sub five ");
        int sub5= sc.nextInt();



        int obtained_marks = sub1 + sub2 + sub3 + sub4 + sub5 ;
        System.out.println("total marks obtained to student " + obtained_marks);


        System.out.println("enter the total marks of all sub");
        int total_marks = sc.nextInt();


        float persentage = obtained_marks * 100 / total_marks ;
        System.out.println("the persentage of student "+ persentage);


    }

}
