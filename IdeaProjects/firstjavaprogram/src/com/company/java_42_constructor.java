package com.company;

public class java_42_constructor {


    int id ;
     String name ;
     java_42_constructor(int i){

         id = i ;

     }

     java_42_constructor(String s ){

         name = s ;
     }

     java_42_constructor(){
         id = 56 ;
         name = "raj deshmukh " ;

     }
     java_42_constructor( int  i , String s ){

         id = i ;
         name = s ;
     }



    public static void main(String[] args) {

         java_42_constructor harry = new java_42_constructor();

       String raj = harry.name;
       int sam  = harry.id;
        System.out.println(raj + sam);


    }
}
