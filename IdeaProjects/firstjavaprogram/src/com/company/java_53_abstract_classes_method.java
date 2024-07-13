package com.company;


  abstract class   box {

    public box(){
        System.out.println(" i am a constructor of box  ");
    }
    public void raj(){
        System.out.println(" i am a first function of box ");
    }

    abstract public void great();
    abstract public void great2();

}

  class  unbox extends box {
    public unbox(){

        System.out.println(" i am a constructor of unbox ");

    }
    public void great(){
        System.out.println("good mornning ");
    }

    public void great2(){
        System.out.println(" good evinning ");
    }

}

abstract class unbox3 extends box  {
    public void ram(){
        System.out.println(" raj is king ");
    }
}

public class java_53_abstract_classes_method {
    public static void main(String[] args) {


        unbox obj = new unbox();
        obj.great();
        obj.great2();
        obj.raj();


        /*
       1 } जेव्हा आपण एखादा abstract class  बनवतो  तेव्हा आपल्याला  त्या class  चा  object  नाही बनऊ शकत .

       2 } आपण जर abstract class ला inherite  केल्याने आपल्याला  child class  मध्ये parent class मधील
            सर्व abstract method            child class  मध्ये  override करावे लागतील  .
         */

    }
}
