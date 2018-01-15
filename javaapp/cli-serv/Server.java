import java.io.*;  
import java.net.*;  
public class Server {  
   public static void main(String[] args){  
       try{  
           ServerSocket ss=new ServerSocket(25000);  
           Socket s=ss.accept();//establishes connection   
           DataInputStream dis=new DataInputStream(s.getInputStream());  
           String str=(String)dis.readUTF();
//           for (int i = 0; i < 100000; i++){
//             System.out.println("messageCnt= "+i);  
	   System.out.println("message="+str);
           ss.close();  
       }catch(Exception e){System.out.println(e);}  
   }  
}  
