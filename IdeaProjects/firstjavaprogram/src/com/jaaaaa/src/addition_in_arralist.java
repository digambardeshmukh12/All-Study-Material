package com.jaaaaa.src;

import java.util.ArrayList;
import java.util.Scanner;

public class addition_in_arralist {

static ArrayList<Integer>nums = new ArrayList<>();
static int total ;

    public static void main(String[] args) {
        for (int i = 1; i<=5 ;i++){

            System.out.printf("enter the value of i "+ i);
        @SuppressWarnings("Resource")
                int num = new Scanner(System.in).nextInt();
        nums.add(num);
        }

        for (int j = 0; j<nums.size();j++){
            total +=nums.get(j);

        }
        System.out.println(total);
    }

}
