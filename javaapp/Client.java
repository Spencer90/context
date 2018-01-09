import java.io.*;
import java.net.*;
public class Client{
    public static void main (String[] args){
        try{
            InetAddress address = InetAddress.getByName("serv");
            Socket s = new Socket(address, 25000);
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            for(int i = 0; i<= 10000; i++){
                out.println(i);
                System.out.println("Sent: "+i);
		Thread.sleep(1);
            }
//            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
//            for(int i = 0; i<10000; i++){
//                dout.writeUTF(String.valueOf(i));
//                Thread.sleep(1);
//            }
            out.flush();
            out.close();
            s.close();
        }catch(Exception e){System.out.println(e);}

    }
}
