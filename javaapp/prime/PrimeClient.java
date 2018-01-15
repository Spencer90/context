import java.io.*;
import java.net.*;
import java.util.ArrayList;
public class PrimeClient{
    public static void main (String[] args){
        try{
            InetAddress address = InetAddress.getByName("serv");
            Socket s = new Socket(address, 25000);
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            
            ArrayList<Integer> prime = new ArrayList<Integer>();
            long start = System.currentTimeMillis();
            
            prime.add(2);
            for (int i =2; i<=Integer.parseInt(args[0]); i++){
                for (int j = 0;prime.size()>j ; j++){
                    if(i%prime.get(j)==0) break;
                    if (j+1==prime.size()){
                        Thread.sleep(1);
                        prime.add(i);
                        System.out.println(i);
                        out.println("prime: "+i);
                    }
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("running time: "+(end-start));
            out.println("running time: "+(end-start));

            out.flush();
            out.close();
            s.close();
        }catch(Exception e){System.out.println(e);}

    }

}
