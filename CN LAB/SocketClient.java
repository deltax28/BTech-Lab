/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deepak
 */
import java.io.*;
import java.net.*;

public class SocketClient {
    public static void main(String[] args) throws IOException{
        try {
            Socket s = new Socket("localhost",3000);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str = br.readLine();
            System.out.println(str);
        }        
        catch (IOException e){
            
        }
    }
}
