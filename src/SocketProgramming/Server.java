package SocketProgramming;
import java.util.*;
import java.net.*;
import java.io.*;

public class Server
{
	public static void main(String args[])throws IOException
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string you want to send ");
		String ab=sc.next();
		ServerSocket server=new ServerSocket(8000);
		System.out.println("Waiting for connection........ ");
		Socket s1=server.accept();
		DataOutputStream d1= new DataOutputStream(s1.getOutputStream());
		d1.writeUTF(ab);
		d1.flush();
		s1.close();
		server.close();
	}
}
		