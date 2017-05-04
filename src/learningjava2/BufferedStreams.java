/*
 Always remember to read a char file  pass a  char array to read method in FileReader
like
f.read(ch);

if only binary streams are given and you wanna read it through reader
then use
InputStreamReader
eg:BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

*PrintWriter is used just to get more println methods and it does  hides exception problems
 */
package learningjava2;
import java.io.*;

/**
 *
 * @author Nishant
 */
public class BufferedStreams {
    
    public static void charFile()throws java.io.IOException,java.io.FileNotFoundException
    {
        FileWriter f=new FileWriter("hello.txt");
        String ab="Hello my name is Nishant Pal";
        f.write(ab);
        f.close();char[] ch=new char[50];
        FileReader fin= new FileReader("hello.txt");
        
            while((fin.read(ch))!=-1)
        {
           System.out.println(ch);
            
            
        }
        
    }
    
    public static void charFileBuffered()throws java.io.FileNotFoundException,java.io.IOException
    {
            BufferedReader ber=new BufferedReader(new FileReader("hello.txt"));
            BufferedWriter bwr=new BufferedWriter(new FileWriter("hello.txt"));
            bwr.write("A DataInputStream should only be used to read data that was previously written by a DataOutputStream.\n"
                    + " If that's not the case, your DataInputStream is not likely to \"understand\" the data you are reading \n"
                    + "and will return random data.\n"
                    + "    Therefore, you should know exactly what type of data was written by the corresponding\n "
                    + "    DataOutputStream in which order.\n");
            String bc;
            bwr.close();
            while((bc=ber.readLine())!=null)
            {
                
                System.out.println(bc);
            }
            }
            
        
  
        
    
    public static void main(String[] args) throws java.io.IOException,java.io.FileNotFoundException
    {
      //  charFile();
        charFileBuffered();
    }
        
    }
    
   
