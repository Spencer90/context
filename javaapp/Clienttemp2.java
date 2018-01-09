import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.*;
import java.util.Scanner;
public class Client{
    public static void main (String[] args){
        Path source = Paths.get("/etc/hosts");
        System.out.println("reading from file: "+source);
        try(Scanner scanner = new Scanner(source)){
//            scanner.useDelimiter("\n ");
            while(scanner.hasNext()){
                
                System.out.println(scanner.next());
            }
        }catch(Exception e){System.out.println(e);
        }
        try{
            InetAddress address = InetAddress.getByName("serv");
            Socket s = new Socket(address, 25000);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            for(int i = 0; i<10000; i++){
                dout.writeUTF(String.valueOf(i));
//                Thread.sleep(1);
            }
            dout.flush();
            dout.close();s.close();
        }catch(Exception e){System.out.println(e);}

    }
}
