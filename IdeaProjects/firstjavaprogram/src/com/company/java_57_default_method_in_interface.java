package com.company;


interface  myPhoto {
    void  mypic() ;
    void  yourpic() ;
    default void doit(){
        System.out.println(" i am a default method ");
    }
}
class myPhone implements myPhoto {

    public void mypic(){
        System.out.println(" 1 ");
    }
    public  void yourpic() {
        System.out.println(" 2 ");
    }
    public void doit() {
        System.out.println(" 3 ");
    }

}
public class java_57_default_method_in_interface {

    public static void main(String[] args) {

        myPhone obj  = new myPhone();
        obj.mypic();
        obj.yourpic();
        obj.doit();
    }
}
