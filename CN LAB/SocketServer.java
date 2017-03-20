/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program -1 : Socket Programming
 * @author Deepak
 */
import java.io.*;
import java.net.*;

public class SocketServer {
    public static void main(String[] args) throws IOException{
        try{
            ServerSocket ss = new ServerSocket(3000);
            Socket s = ss.accept();
            System.out.println("Client Connected");
            DataOutputStream d = new DataOutputStream(s.getOutputStream());
            d.writeChars("Hello");
            s.close();
        }
        catch (IOException e){
    }
    
}
}