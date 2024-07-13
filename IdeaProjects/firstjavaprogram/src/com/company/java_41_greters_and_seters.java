package com.company;


class  MyEmploye{
   private   int id ;
   private   String name ;

    void SetId(int a ){
        id = a ;
    }
    int Getid(){
        return id ;
    }

    void setName( String s ){
        name = s ;
    }

    String getName(){
        return name ;
    }


}
public class java_41_greters_and_seters {

    public static void main(String[] args) {

        MyEmploye raj = new MyEmploye();
        raj.SetId(43);
        raj.setName("raj deshmukh");
        System.out.println(" the id of employee is " + raj.Getid());
        System.out.println( " full name of employee is " + raj.getName());

    }
}
