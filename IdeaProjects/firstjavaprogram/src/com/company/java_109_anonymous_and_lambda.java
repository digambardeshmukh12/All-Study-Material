package com.company;
import java.beans.Expression;

//     interface for     anonymous class

interface raj {
     void  rajendra();
     void  rajklesh();

}

//      interface for lambda expresion



@FunctionalInterface

interface digambar{

    void diga();

}

public class java_109_anonymous_and_lambda {
    public static void main(String[] args) {

//         anonymous class

        raj x = new raj() {
            @Override
            public void rajendra() {

                System.out.println(" its rajendra ");

            }

            @Override
            public void rajklesh() {

                System.out.println(" its rajklesh  ");

            }
        } ;

        x.rajendra();

/*
         for lambda Expression- > only use with functional interface means interface only contain
        only one method


 */



        digambar y = ()->{

            System.out.println(" its a lambda expresion ");

        };

        y.diga();

    }
}
