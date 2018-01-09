import java.io.*;  
import java.net.*;  
public class Client {  
   public static void main(String[] args) {  
      try{
	for(int j = 0; j<10000; j++){      
         Socket s=new Socket("master",25000);  
         DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
	 for(int i = 0; i<10000; i++){
	 
        	dout.writeUTF(String.valueOf(i));
		Thread.sleep(1);
	 }  
         dout.flush();  
         dout.close();  
         s.close();  
	}
	Thread.sleep(1);
      }catch(Exception e){System.out.println(e);}  
   }  
}  
