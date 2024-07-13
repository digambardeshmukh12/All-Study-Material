package com.company;

public class java_32_changing_array_int {

    static void   change(int a ){

        a = 54 ;

    }

    static void  change2( int [] arr ){

        arr[0] = 98 ;


    }


    public static void main(String[] args) {

//        case 1 : - changing int

        int a = 64 ;
        change(a);
        System.out.println(" the value of a after running " + a );



//        case 2 :- changing array


        int [] raj ={ 54 ,75 ,65 ,85 };
        change2(raj);
        System.out.println(" the value of raj [0] after a changing " + raj[0]);



        /*

      जेव्हा   आपण array  create  करतो तेव्हा  array  ची method तयार  होते आणि त्याचा reference जातो त्यामुळे array ची

      value  change होते .

      पण जेव्हा एक int पाठवतो तेव्हा int ची copy जाते त्यामुळे ती    change होत नाही   

         */



    }


}
