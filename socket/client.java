import java.net.*;
import java.io.* ;

public class client {
 public static void main(String args [] ){

try {

Socket s = new Socket("localhost",3333);
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
dout.writeUTF("HELLO SERVER ");
dout.flush();
dout.close();
s.close();

}

catch(Exception e ){
System.out.println(e);
}



}
}