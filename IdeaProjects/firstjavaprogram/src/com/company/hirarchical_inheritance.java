package com.company;

public class hirarchical_inheritance {

   void life (){
       System.out.println("the live person have life ");
   }

}

class Life extends hirarchical_inheritance {

    void g(){
        System.out.println(" the life is most importent for human ");

        System.out.println(" ");

    }

}

class Death extends  hirarchical_inheritance {

    void  d(){
        System.out.println(" the death person can not live  ");
        System.out.println(" ");

    }
}

class test_hirarchical {

    public static void main(String[] args) {

        Life life = new Life();
        Death death = new Death();

        life.g();
        death.d();


    }
}
