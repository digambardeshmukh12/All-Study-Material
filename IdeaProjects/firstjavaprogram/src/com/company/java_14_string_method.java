package com.company;

import java.util.Locale;

public class java_14_string_method {
    public static void main(String[] args) {
        String name = "rajkumar";
        System.out.println( name );

        // count the  length of string
//        int value = name.length();
//        System.out.println(value);

        // convert to lower case
//        String  lstring = name.toLowerCase();
//        System.out.println(lstring);

        // convert to upper case
//        String  ustring = name.toUpperCase();
//        System.out.println(ustring);


        // remove space in string

//        String  spacename ="     raj      ";
//        System.out.println(spacename);


//     1) //   System.out.println(spacename.trim());
//
//     2) //   String nonspacename = spacename.trim();
//             System.out.println(nonspacename);



        // string print by number

        //  string print करते दिलेल्या number च्या पुढील ex. name.substring(1)  print   "aj'
        //  and     name. substring(1,5) print  ajku
        //  index start form 0 (zero) .  rajkumar  --> 01234567
        // first (in ex 2 . 1 is including and 5 is excluding
//        System.out.println(name.substring(1));
//        System.out.println(name.substring(1,5));
//          System.out.println(name.substring(0,8));

        // replece string

//          System.out.println(name.replace('r','R'));
//          System.out.println(name.replace("kumar","sumar"));
//          System.out.println(name.replace("r","sumar"));

        // start with boolen return

//        System.out.println(name.startsWith("ra"));
//        System.out.println(name.startsWith("rahh"));

        // ends with boolen return

//        System.out.println(name.endsWith("r"));
//        System.out.println(name.endsWith("p"));

        // char at number

//        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(6));

        // index off search and return first

//        String nameth = "rajkumarkumar";
//
//        System.out.println(nameth.indexOf("ku", 4));
//

        // chaeck string right wrong by equel.in third example case sensitivity is destroyed by ignorecase

//        System.out.println(name.equals("rajkumar"));
//        System.out.println(name.equals("Rajkumar"));
//
//        System.out.println(name.equalsIgnoreCase("RajKumar"));



//        esacape sequence characters
//            \t --> tab
//            \b -- backspace
//            \n -- new line
//            \\ --backslash \










    }
}
