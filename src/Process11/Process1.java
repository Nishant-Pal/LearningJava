package Process11;
public class Process1
{//Java.lang
	
	public static void main(String[] args)throws java.io.IOException
	{
	
		//Get runtime from the system
		Runtime r=Runtime.getRuntime();
		//Create a process
		
		Process p=r.exec("");//Write cmd command in double quotes
		
		//You can provide input to the process and extract output from the process by using getInputStream and getOutputStream
        }}