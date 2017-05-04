/*
using DataInputStream 
and DataOutputbStream
 */
package learningjava2;
import java.io.*;


/**
 *
 * @author Nishant
 */
public class IOSTreamsAndFile1 extends learningjava2.IOStreamsAndFile {
    
   
    public static void readFile()throws java.io.FileNotFoundException,java.io.IOException
    {
        DataInputStream d1= new DataInputStream(new FileInputStream("Sample.bin"));
        byte b;
        try{
            while(true)
        {
            System.out.println(d1.readByte());
        }}catch(EOFException e)
        {
           d1.close();
           System.out.println("File closed");
        }
    }

 public static void writeFile()throws java.io.FileNotFoundException,java.io.IOException
    {
        DataOutputStream d2= new DataOutputStream(new FileOutputStream("Sample.bin",true));
        byte hj[]="nishant".getBytes();
     
            d2.write(hj);
            d2.close();
          }
   /* FileReader and FileWriter are not to be used with DataInputStream And DataOutputSTream
    * Binary files cannot be read in any other mode except bytes
    */ 
        
    
    public static void main(String[] args) throws java.io.FileNotFoundException,java.io.IOException
    {
        writeFile();
        readFile();
        
        
        
        
    }
     
        /*
    DataInputStream is an InputStream subclass, hence it reads and writes bytes.
    If you are reading bytes and you know they are all going to be ints or some
    other primitive data type, then you can read those bytes directly into the
    primitive using DataInputStream.

Question: Would you would need to know the type (int, string, etc) of the content
    being read before it is read? And would the whole file need to consist of that 
    one primitive type?
The question I am having is: Why not use an InputStreamReader wrapped around the
    InputStream's byte data? With this approach you are still reading the bytes,
    then converting them to integers that represent characters. Which integers
    represent which characters depends on the character set specified, e.g., "UTF-8".

Question: In what case would an InputStreamReader fail to work where a DataInputStream
    would work?
My guess answer: If speed is really important, and you can do it, then converting the 
    InputStream's byte data directly to the primitive via DataInputStream would be the
    way to go? This avoids the Reader having to "cast" the byte data to an int first; 
    and it wouldn't rely on providing a character set to interpret
    which character is being represented by the returned integer. I suppose this is 
    what people mean by DataInputStream allows for a machine-indepent read of the underlying data.
    */
    }
    

