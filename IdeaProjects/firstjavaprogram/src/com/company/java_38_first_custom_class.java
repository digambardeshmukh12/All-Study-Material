package com.company;

import javax.swing.plaf.basic.BasicTreeUI;

class Employee {

    int id ;
    int sallary ;
    String full_name ;

    void print_details(){

        System.out.println(" my employee id is  " + id + " ." );
        System.out.println(" my full name is " + full_name  );
        System.out.println(" and my sallary is  "  + sallary);
    }

}

public class java_38_first_custom_class {

    public static void main(String[] args) {

        System.out.println(" this is our first custom class  \n \n  " );
        Employee samarth = new Employee() ;
        Employee raj = new Employee() ;


        samarth.id =64 ;
        samarth.full_name = "samarth zunzunwala ";
        samarth.sallary = 56000 ;
        samarth.print_details();
        System.out.println(" \n \n ");

        raj.id = 43 ;
        raj.full_name = " raj deshmukh ";
        raj.sallary = 45000 ;
        raj.print_details();




    }
}
