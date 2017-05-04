package SocketProgramming;
import java.io.*;
import java.util.Scanner;
import java.net.*;

public class UdpClient
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string u want to send from t1 ");
        String ab=sc.next();
        byte b1[]=ab.getBytes();
        String addr="127.0.0.1";
        InetAddress ip1=InetAddress.getByName(addr);
        DatagramSocket s1= new DatagramSocket();
        DatagramPacket p1= new DatagramPacket(b1,b1.length,ip1,8000);
	s1.send(p1);
        System.out.println("packet has been sent");
    }
    
    
}
