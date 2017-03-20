
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
public class TCPChatServer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rcvmsg,sndmsg;
        try{
            ServerSocket ss = new ServerSocket(3000);
            Socket s = ss.accept();
            System.out.println("Client Connected");
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            while(true) {
               if ((rcvmsg = in.readLine())!=null)
                    System.out.println("Client:"+rcvmsg);
               sndmsg = br.readLine();
               out.println(sndmsg);
               if(rcvmsg.equalsIgnoreCase("END"))
                System.exit(0);
            }
            
        }
        catch(IOException e){
        }
        
    }   
}
