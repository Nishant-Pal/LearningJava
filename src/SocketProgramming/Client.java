package SocketProgramming;
import java.util.*;
import java.net.*;
import java.io.*;

public class Client
{
	public static void main (String args[])throws IOException
	{
		String ab;
		Socket s1= new Socket("127.0.0.1",8000);
		DataInputStream d1= new DataInputStream(s1.getInputStream());
		ab=d1.readUTF();
		System.out.println("The string received is : "+ab);
		s1.close();
	}
}