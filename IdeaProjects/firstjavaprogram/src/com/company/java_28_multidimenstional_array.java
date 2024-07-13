package com.company;

public class java_28_multidimenstional_array {
    public static void main(String[] args) {


//        multi dimentional arrays is a arrays of array
//        each elements of multi dimentional arrays is arrays

//        Two dimentional arrays  or 2D arryas

        int[][] flats ;
        flats = new int [2][3];

        flats[0][0] =201;
        flats[0][1] =202;
        flats[0][2] =203;

        flats[1][0] =101;
        flats[1][1] =101;
        flats[1][2] =101;

        for (int i = 0 ; i<flats.length ; i++){
            for (int j=0 ; j<flats[i].length; j++){

                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println(" ");

        }








    }
}
