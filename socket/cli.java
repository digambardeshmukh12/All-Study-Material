import java.net.* ;
import java.io.* ;
class cli {
public static void main(String args[]){

try {

Socket s = new Socket("localhost",3333);
BufferedReader bin = new BufferedReader( new InputStreamReader(System.in));
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
DataInputStream din = new DataInputStream(s.getInputStream());
String s1 = " " , s2 = " " ;
while(!s1.equals("stop"))
{
s1 = bin.readLine();
dout.writeUTF(s1);
dout.flush();
s2 = (String)din.readUTF();
System.out.println("Server Says: " + s2 );
}
dout.close();
s.close();
}
catch(Exception e ) {

System.out.println(e);

}
}
}
