package com.company;

public class multilevel_inheritance {

    void life()
    {
        System.out.println(" life on earth ");
        System.out.println(" ");

    }
}

class  country extends multilevel_inheritance {

    void country(){

        System.out.println(" india is a coumtry on earth ");
        System.out.println(" ");
    }

}

class maharashtra extends country {

    void state() {

        System.out.println(" maharashtra is a state in india ");
        System.out.println(" ");
    }

}

class test_multi_level_inheritance {

    public static void main(String[] args) {

        maharashtra raj = new maharashtra() ;

        raj.life();
        raj.country();
        raj.state();

    }
}