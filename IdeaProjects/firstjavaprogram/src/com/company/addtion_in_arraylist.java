package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class addtion_in_arraylist {
  static   ArrayList<Integer> nums = new ArrayList<>();
    static  int total ;
    public static void main(String[] args) {

        for (int i = 1; i<=5 ; i++){

            System.out.println(" enter the value of " + i );
            @SuppressWarnings("resource")
             int num = new Scanner(System.in).nextInt();

            nums.add(num);
        }

        for (int j = 0 ; j < nums.size(); j++) {

            total += nums.get(j);

        }

        System.out.println(total);

    }
}
