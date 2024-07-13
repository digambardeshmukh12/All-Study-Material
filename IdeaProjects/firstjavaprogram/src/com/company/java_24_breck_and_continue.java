package com.company;

public class java_24_breck_and_continue {
    public static void main(String[] args) {


 //        break   --> whole loop is exist
//          continue --> continue only exist only one prosses / circle in loop


//        Breck and conyinue using lop


//        using for loop

//        for (int a = 0; a<=10; a++){
//            System.out.print(a);
//            System.out.println("  java is great");
//
//            if (a==5){
//                System.out.println("ending thr loop ");
//                break;
//            }
//        }


//        using while loop

//        int a = 0;
//        while (a<=5){
//            System.out.println(a);
//
//            a++ ;
//            if (a==3){
//                System.out.println("loop is ending ");
//                break;
//            }
//        }


//        using do while loop


//        int a = 0 ;
//
//        do {
//
//            System.out.println(a);
//
//            a++;
//            if (a==7){
//                System.out.println("loop is ending ");
//                break;
//            }
//        }while (a<=10);








//        loops using continue


        //        using for loop

        for (int a = 0; a<=10; a++){
            System.out.print(a);
            System.out.println("  java is great");

            if (a==5){
                System.out.println("ending thr loop ");
               continue;
            }
        }


//        using while loop

        int a = 0;
        while (a<=5){
            System.out.println(a);

            a++ ;
            if (a==3){
                System.out.println("this loop circle is end ");
                continue;
            }
        }


//        using do while loop


//        int a = 0 ;
//
//        do {
//
//            System.out.println(a);
//
//            a++;
//            if (a==7){
//                System.out.println("this loop  circle is end ");
//               continue;
//            }
//        }while (a<=10);










    }
}
