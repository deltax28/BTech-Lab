import java.io.*;
import java.net.*;
import java.lang.*;
public class udpclient
{
public static void main(String arg[])throws IOException
{
BufferedReader inu = new BufferedReader(new InputStreamReader(System.in));
DatagramSocket cs = new DatagramSocket();
InetAddress ip = InetAddress.getByName("localhost");
byte[] sd = new byte[256];
byte[] rd = new byte[256];
while(true)
{
String sen = inu.readLine();
sd = sen.getBytes();
DatagramPacket sp = new DatagramPacket(sd,0,sd.length,ip,9876);
cs.send(sp);
DatagramPacket rp = new DatagramPacket(rd,0,rd.length);
cs.receive(rp);
String msen = new String(rp.getData());
System.out.println("server:"+msen+"\n");
if(sen.equalsIgnoreCase("end"))

System.exit(0);
}
}
}