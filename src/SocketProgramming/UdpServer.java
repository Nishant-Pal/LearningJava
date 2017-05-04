package SocketProgramming;
import java.io.*;
import java.util.Scanner;
import java.net.*;

public class UdpServer
{
    public static void main(String args[])throws IOException
    {
        byte b1[]=new byte[1024];
        String addr="127.0.0.1";
        InetAddress ip1=InetAddress.getByName(addr);
        DatagramSocket s1= new DatagramSocket(8000);
        DatagramPacket p1= new DatagramPacket(b1,b1.length);
	s1.receive(p1);
	String rec=new String(p1.getData());
        System.out.println("packet has been recieved : "+ rec);
	System.out.println("address  : "+ p1.getAddress());
    }
    
    
}
