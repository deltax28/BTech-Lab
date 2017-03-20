/*UDP chat*/
import java.io.*;
import java.net.*;
public class udpserver
{
public static void main(String arg[])throws IOException
{
BufferedReader inu = new BufferedReader(new InputStreamReader(System.in));
DatagramSocket ss = new DatagramSocket(9876);
byte[] rd = new byte[256];
byte[] sd = new byte[256];
while(true)
{
DatagramPacket rp = new DatagramPacket(rd,0,rd.length);
ss.receive(rp);
String sn = new String(rp.getData());
System.out.println("client:"+sn+"\n");
String sen = inu.readLine();
sd = sen.getBytes();
InetAddress ip = InetAddress.getByName("localhost");
int port = rp.getPort();
DatagramPacket sp = new DatagramPacket(sd,0,sd.length,ip,port);
ss.send(sp);

if(sen.equalsIgnoreCase("end"))
{
System.exit(0);
}

if(sn.equalsIgnoreCase("end"))
System.exit(0);
}
}
}

