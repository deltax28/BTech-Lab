
import java.io.*;
import java.net.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deepak
 */
public class TCPChatClient {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rcvmsg,sndmsg;
        try{
            Socket s = new Socket("localhost",3000);
            System.out.println("Server Connected");
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            while(true) {
               sndmsg = br.readLine();
               out.println(sndmsg);
               if ((rcvmsg = in.readLine())!=null)
                    System.out.println("Server:"+rcvmsg);
               if(rcvmsg.equalsIgnoreCase("END"))
                    System.exit(0);
            }
            
        }
        catch(IOException e){
        }
    }   
}
