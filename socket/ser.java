import java.net.* ;
import java.io.* ;
class ser {
public static void main(String args[]){

try {

ServerSocket ss = new ServerSocket(3333);
Socket s = ss.accept();

BufferedReader bin = new BufferedReader( new InputStreamReader(System.in));
DataOutputStream dout  = new DataOutputStream(s.getOutputStream());
DataInputStream din = new DataInputStream(s.getInputStream());

String s1 = " " , s2 = " " ;

while(!s1.equals("stop")){

s1=(String)din.readUTF();
System.out.println("Client says: " + s1 );
s2 = bin.readLine();
dout.writeUTF(s2);
dout.flush();
}

din.close();
s.close();
ss.close();
}
catch(Exception e ){
System.out.println(e);
}

		}
	}