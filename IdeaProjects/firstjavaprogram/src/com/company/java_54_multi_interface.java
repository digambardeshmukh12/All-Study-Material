package com.company;



    interface  camera{
        void photo();
        void showPhoto();

    }

    interface gps{
        void giveLocation() ;
        void sendLocation();
        String [] list ();

    }

    class phonex implements camera ,gps{

        void  calling (){
            System.out.println(" we can conect to each other ");
        }

        public void  photo(){
            System.out.println(" we can take photo ");
        }

        public  void showPhoto(){
            System.out.println(" showing photoes  ");
        }

        public  void giveLocation(){
            System.out.println(" we can see location ");
        }

        public void sendLocation(){
            System.out.println(" we can give location ");
        }

        public  String  [] list(){
            System.out.println(" following is a my location list ");
            String [] raj = { " ambegaon " , " nanded " , " lahan " } ;


            return raj ;
        }

    }

    class smartPhone extends phonex{

        void special(){
            System.out.println(" its very high feature ");
        }
    }
    public class java_54_multi_interface    {
        public static void main(String[] args) {

            smartPhone obj  = new smartPhone();
            obj.photo();
            obj.showPhoto();
            obj.giveLocation();
            obj.sendLocation();
            obj.calling();
            obj.special();
            String [] man  = obj.list();
            for (String  item : man ) {

                System.out.println(item);
            }



        }
    }


